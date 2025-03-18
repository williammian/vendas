package br.com.wm.vendasapi.rest.dashboard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DashboardData {

	private Long produtos;
	private Long clientes;
	private Long vendas;
	
}
