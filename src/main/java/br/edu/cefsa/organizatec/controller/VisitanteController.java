package br.edu.cefsa.organizatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import br.edu.cefsa.organizatec.model.Visitante;
import br.edu.cefsa.organizatec.service.VisitanteService;

@Controller
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService service;

    public VisitanteController(VisitanteService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("visitantes", service.listar());
        return "visitantes/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("visitante", new Visitante());
        return "visitantes/form";
    }

    @PostMapping
    public String salvar(@ModelAttribute Visitante visitante) {
        service.salvar(visitante);
        return "redirect:/visitantes";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        service.excluir(id);
        return "redirect:/visitantes";
    }
}
