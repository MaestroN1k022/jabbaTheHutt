package br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence.springData;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProdutoRepository extends JpaRepository<Produto, Long> {
}
