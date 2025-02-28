package br.com.wm.vendasapi.model;

import java.time.LocalDate;

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
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate nascimento;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	
	public Cliente(LocalDate nascimento, String cpf, String nome, String endereco, String telefone, String email) {
		super();
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
}
