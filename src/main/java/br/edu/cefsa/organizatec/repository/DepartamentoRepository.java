package br.edu.cefsa.organizatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.cefsa.organizatec.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {}