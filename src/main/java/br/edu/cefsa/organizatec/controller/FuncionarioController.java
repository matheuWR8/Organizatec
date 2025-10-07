package br.edu.cefsa.organizatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import br.edu.cefsa.organizatec.model.Funcionario;
import br.edu.cefsa.organizatec.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("funcionarios", service.listar());
        return "funcionarios/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "funcionarios/form";
    }

    @PostMapping
    public String salvar(@ModelAttribute Funcionario funcionario) {
        service.salvar(funcionario);
        return "redirect:/funcionarios";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        service.excluir(id);
        return "redirect:/funcionarios";
    }
}
