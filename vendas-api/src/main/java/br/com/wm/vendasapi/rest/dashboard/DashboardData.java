package br.com.wm.vendasapi.rest.dashboard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import br.com.wm.vendasapi.model.repository.projections.VendaPorMes;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DashboardData {

	private Long produtos;
	private Long clientes;
	private Long vendas;
	private List<VendaPorMes> vendasPorMes;
	
	public DashboardData(Long produtos, Long clientes, Long vendas, List<VendaPorMes> vendasPorMes) {
		super();
		this.produtos = produtos;
		this.clientes = clientes;
		this.vendas = vendas;
		this.vendasPorMes = vendasPorMes;
		this.preencherMesesFaltantes();
	}
	
	public List<VendaPorMes> getVendasPorMes() {
		if(vendasPorMes == null) {
			vendasPorMes = new ArrayList<>();
		}
		return vendasPorMes;
	}
	public void setVendasPorMes(List<VendaPorMes> vendasPorMes) {
		this.vendasPorMes = vendasPorMes;
	}
	
	public void preencherMesesFaltantes() {
		Integer mesMaximo =  getVendasPorMes()
									.stream()
									.mapToInt(VendaPorMes::getMes)
									.max().getAsInt();
		
		List<Integer> listaMeses = IntStream
					.rangeClosed(1, mesMaximo)
					.boxed().collect(Collectors.toList());
		
		List<Integer> mesesAdicionados = getVendasPorMes()
					.stream()
					.map(VendaPorMes::getMes)
					.collect(Collectors.toList());
		
		listaMeses.stream().forEach(mes -> {
			if(!mesesAdicionados.contains(mes)) {
				VendaPorMes vendaPorMes = new VendaPorMes() {
					
					@Override
					public BigDecimal getValor() {
						return BigDecimal.ZERO;
					}
					
					@Override
					public Integer getMes() {
						return mes;
					}
				};
				
				getVendasPorMes().add(vendaPorMes);
			}
		});
		
		getVendasPorMes().sort( Comparator.comparing(VendaPorMes::getMes) );
	}
}
