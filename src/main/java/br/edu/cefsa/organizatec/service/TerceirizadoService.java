package br.edu.cefsa.organizatec.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.edu.cefsa.organizatec.model.Terceirizado;
import br.edu.cefsa.organizatec.repository.TerceirizadoRepository;

@Service
public class TerceirizadoService {
    private final TerceirizadoRepository repository;

    public TerceirizadoService(TerceirizadoRepository repository) {
        this.repository = repository;
    }

    public List<Terceirizado> listar() { return repository.findAll(); }

    public Terceirizado salvar(Terceirizado f) { return repository.save(f); }

    public void excluir(Integer id) { repository.deleteById(id); }

    public Terceirizado buscar(Integer id) { return repository.findById(id).orElse(null); }
}
