package br.edu.cefsa.organizatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import br.edu.cefsa.organizatec.model.Terceirizado;
import br.edu.cefsa.organizatec.service.TerceirizadoService;

@Controller
@RequestMapping("/terceirizados")
public class TerceirizadoController {

    private final TerceirizadoService service;

    public TerceirizadoController(TerceirizadoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("terceirizados", service.listar());
        return "terceirizados/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("terceirizado", new Terceirizado());
        return "terceirizados/form";
    }

    @PostMapping
    public String salvar(@ModelAttribute Terceirizado terceirizado) {
        service.salvar(terceirizado);
        return "redirect:/terceirizados";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        service.excluir(id);
        return "redirect:/terceirizados";
    }
}
