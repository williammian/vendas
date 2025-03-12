package br.com.wm.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.vendasapi.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
