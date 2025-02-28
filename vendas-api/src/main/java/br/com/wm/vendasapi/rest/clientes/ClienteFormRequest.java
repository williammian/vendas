package br.com.wm.vendasapi.rest.clientes;

import java.time.LocalDate;

import br.com.wm.vendasapi.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteFormRequest {

	private Long id;
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private String endereco;
	private String email;
	private String telefone;
	private LocalDate cadastro;
	
	public Cliente toModel() {
		return new Cliente(id, dataNascimento, cpf, nome, endereco, telefone, email, cadastro);
	}
	
	public static ClienteFormRequest fromModel(Cliente cliente) {
		return new ClienteFormRequest(cliente.getId(), cliente.getNome(), 
				cliente.getCpf(), cliente.getNascimento(), 
				cliente.getEndereco(), cliente.getEmail(), 
				cliente.getTelefone(), cliente.getDataCadastro());
	}
}
