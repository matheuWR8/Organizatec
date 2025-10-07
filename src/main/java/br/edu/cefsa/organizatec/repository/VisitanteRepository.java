package br.edu.cefsa.organizatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.cefsa.organizatec.model.Visitante;

public interface VisitanteRepository extends JpaRepository<Visitante, Integer> {}
