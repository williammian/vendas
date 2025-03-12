package br.com.wm.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.vendasapi.model.ItemVenda;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {

}
