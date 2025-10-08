package br.edu.cefsa.organizatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.cefsa.organizatec.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {}
