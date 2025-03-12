package br.com.wm.vendasapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_venda")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_venda")
	private Venda venda;
	
	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	
	@Column
	private Integer quantidade;
	
}
