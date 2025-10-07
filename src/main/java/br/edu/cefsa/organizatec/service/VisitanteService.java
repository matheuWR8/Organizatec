package br.edu.cefsa.organizatec.service;

import org.springframework.stereotype.Service;
import java.util.List;
import br.edu.cefsa.organizatec.model.Visitante;
import br.edu.cefsa.organizatec.dao.VisitanteDAO;

@Service
public class VisitanteService {
    private final VisitanteDAO dao;

    public VisitanteService(VisitanteDAO dao) {
        this.dao = dao;
    }

    public List<Visitante> listar() { return dao.findAll(); }

    public Visitante salvar(Visitante f) { return dao.save(f); }

    public void excluir(Integer id) { dao.deleteById(id); }

    public Visitante buscar(Integer id) { return dao.findById(id).orElse(null); }
}
