package br.edu.cefsa.organizatec.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Visitante extends Pessoa {

    private String documento;
    private String motivo;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private String funcionarioVisitado;

    @ManyToOne
    private Departamento departamento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFuncionarioVisitado() {
        return funcionarioVisitado;
    }

    public void setFuncionarioVisitado(String funcionarioVisitado) {
        this.funcionarioVisitado = funcionarioVisitado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
}
