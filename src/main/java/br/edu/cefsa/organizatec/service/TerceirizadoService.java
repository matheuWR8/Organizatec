package br.edu.cefsa.organizatec.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.edu.cefsa.organizatec.model.Terceirizado;
import br.edu.cefsa.organizatec.dao.TerceirizadoDAO;

@Service
public class TerceirizadoService {
    private final TerceirizadoDAO dao;

    public TerceirizadoService(TerceirizadoDAO dao) {
        this.dao = dao;
    }

    public List<Terceirizado> listar() { return dao.listar(); }

    public void salvar(Terceirizado f) { dao.salvar(f); }

    public void excluir(Integer id) { dao.excluir(id); }

    public Terceirizado buscar(Integer id) { return dao.buscarPorId(id); }
}
