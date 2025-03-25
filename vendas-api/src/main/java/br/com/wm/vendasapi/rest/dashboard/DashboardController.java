package br.com.wm.vendasapi.rest.dashboard;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wm.vendasapi.model.repository.ClienteRepository;
import br.com.wm.vendasapi.model.repository.ProdutoRepository;
import br.com.wm.vendasapi.model.repository.VendaRepository;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin("*")
public class DashboardController {

	@Autowired
	private VendaRepository vendas;
	
	@Autowired
	private ClienteRepository clientes;
	
	@Autowired
	private ProdutoRepository produtos;
	
	@GetMapping
	public DashboardData getDashBoard() {
		long produtosCount = produtos.count();
		long clientesCount = clientes.count();
		long vendasCount = vendas.count();
		
		var anoCorrente = LocalDate.now().getYear();
		var vendasPorMes = vendas.obterSomatoriaVendasPorMes(anoCorrente);
		
		return new DashboardData(produtosCount, clientesCount, vendasCount, vendasPorMes);
	}
	
}
