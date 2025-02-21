package br.com.wm.vendasapi.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "descricao", length = 255)
	private String descricao;
	
	@Column(name = "preco", precision = 16, scale = 2)
	private BigDecimal preco;
	
	@Column
	private String sku;
	
	public Produto(String nome, String descricao, BigDecimal preco, String sku) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.sku = sku;
	}
	
}
