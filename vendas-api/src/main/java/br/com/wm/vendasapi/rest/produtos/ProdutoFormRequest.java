package br.com.wm.vendasapi.rest.produtos;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProdutoFormRequest {

	private String sku;
	private BigDecimal preco;
	private String nome;
	private String descricao;
	
}
