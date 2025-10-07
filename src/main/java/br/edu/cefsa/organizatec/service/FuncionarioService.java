package br.edu.cefsa.organizatec.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.edu.cefsa.organizatec.model.Funcionario;
import br.edu.cefsa.organizatec.dao.FuncionarioDAO;

@Service
public class FuncionarioService {

    private final FuncionarioDAO dao;

    public FuncionarioService(FuncionarioDAO dao) {
        this.dao = dao;
    }

    public void salvar(Funcionario f) {
        dao.salvar(f);
    }

    public Funcionario buscar(Integer id) {
        return dao.buscarPorId(id);
    }

    public List<Funcionario> listar() {
        return dao.listar();
    }

    public void excluir(Integer id) {
        dao.excluir(id);
    }

    public void atualizar(Funcionario f) {
        dao.atualizar(f);
    }

}
