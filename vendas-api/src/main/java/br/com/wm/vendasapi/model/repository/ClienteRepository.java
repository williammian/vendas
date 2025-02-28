package br.com.wm.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.vendasapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
