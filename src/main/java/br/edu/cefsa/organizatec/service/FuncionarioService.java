package br.edu.cefsa.organizatec.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.edu.cefsa.organizatec.model.Funcionario;
import br.edu.cefsa.organizatec.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> listar() {
        return repository.findAll();
    }

    public Funcionario salvar(Funcionario f) {
        return repository.save(f);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    public Funcionario buscar(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
