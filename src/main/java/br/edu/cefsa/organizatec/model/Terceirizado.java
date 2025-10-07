package br.edu.cefsa.organizatec.model;

import java.time.LocalDate;

public class Terceirizado extends Pessoa {

    private String funcao;
    private String empresaPrestadora;
    private LocalDate dataInicioContrato;
    private LocalDate dataFimContrato;
    private String responsavelInterno;
    private Integer departamentoId;

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

    public Integer getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Integer departamentoId) {
        this.departamentoId = departamentoId;
    }

    
    
}
