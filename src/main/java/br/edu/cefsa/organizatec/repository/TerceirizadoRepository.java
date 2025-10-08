package br.edu.cefsa.organizatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.cefsa.organizatec.model.Terceirizado;

public interface TerceirizadoRepository extends JpaRepository<Terceirizado, Integer> {}
