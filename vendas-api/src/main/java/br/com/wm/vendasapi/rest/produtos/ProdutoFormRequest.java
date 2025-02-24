package br.com.wm.vendasapi.rest.produtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.wm.vendasapi.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoFormRequest {

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private String sku;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate cadastro;
	
	public Produto toModel() {
		return new Produto(id, nome, descricao, preco, sku);
	}
	
	public static ProdutoFormRequest fromModel(Produto produto) {
		return new ProdutoFormRequest(
			produto.getId(), 
			produto.getNome(), 
			produto.getDescricao(), 
			produto.getPreco(),
			produto.getSku(),
			produto.getDataCadastro()
		);
	}
}
