package br.com.expertTeam.jabbaTheHuttbackend.adapters.outbound.persistence;

import br.com.expertTeam.jabbaTheHuttbackend.core.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoriaRepository extends JpaRepository<Categoria, Long> {
}
