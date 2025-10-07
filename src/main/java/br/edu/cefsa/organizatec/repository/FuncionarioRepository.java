package br.edu.cefsa.organizatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.cefsa.organizatec.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {}