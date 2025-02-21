package br.com.wm.vendasapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.vendasapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
