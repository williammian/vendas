package br.com.wm.vendasapi.rest.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wm.vendasapi.model.Produto;
import br.com.wm.vendasapi.model.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;

	@PostMapping
	public ProdutoFormRequest salvar( @RequestBody ProdutoFormRequest produto ) {
		Produto entidadeProduto = new Produto(
				produto.getNome(), 
				produto.getDescricao(), 
				produto.getPreco(), 
				produto.getSku()
		);
		
		repository.save(entidadeProduto);
		
		System.out.println(entidadeProduto);
		return produto;
	}
	
}
