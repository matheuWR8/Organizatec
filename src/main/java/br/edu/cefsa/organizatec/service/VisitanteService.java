package br.edu.cefsa.organizatec.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.edu.cefsa.organizatec.model.Visitante;
import br.edu.cefsa.organizatec.repository.VisitanteRepository;

@Service
public class VisitanteService {
    private final VisitanteRepository repository;

    public VisitanteService(VisitanteRepository repository) {
        this.repository = repository;
    }

    public List<Visitante> listar() { return repository.findAll(); }

    public Visitante salvar(Visitante f) { return repository.save(f); }

    public void excluir(Integer id) { repository.deleteById(id); }

    public Visitante buscar(Integer id) { return repository.findById(id).orElse(null); }
}
