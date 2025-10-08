package br.edu.cefsa.organizatec.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Terceirizado extends Pessoa {

    private String funcao;
    private String empresaPrestadora;
    private LocalDate dataInicioContrato;
    private LocalDate dataFimContrato;
    private String responsavelInterno;

    @ManyToOne
    private Departamento departamento;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmpresaPrestadora() {
        return empresaPrestadora;
    }

    public void setEmpresaPrestadora(String empresaPrestadora) {
        this.empresaPrestadora = empresaPrestadora;
    }

    public LocalDate getDataInicioContrato() {
        return dataInicioContrato;
    }

    public void setDataInicioContrato(LocalDate dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    public LocalDate getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(LocalDate dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public String getResponsavelInterno() {
        return responsavelInterno;
    }

    public void setResponsavelInterno(String responsavelInterno) {
        this.responsavelInterno = responsavelInterno;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
}
