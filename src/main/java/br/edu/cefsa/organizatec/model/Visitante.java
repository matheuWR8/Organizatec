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

    public String registrarAtividades(String detalhe) {
        // Implementação para Visitante: registra o motivo da visita.
        return this.getNome() + " (Visitante) registrou o motivo da visita: " + this.motivo;
    }

    /**
     * Registra a saída do visitante.
     */
    public String registrarSaida() {
        if (this.dataSaida == null) {
            this.dataEntrada = LocalDateTime.now();
            return "Saída de " + this.getNome() + " registrada com sucesso às " + this.dataSaida.toLocalTime();
        }
        return this.getNome() + " já registrou a saída.";
    }

    /**
     * Verifica se o visitante está atualmente na empresa.
     */
    public boolean estaNaEmpresa() {
        return this.dataSaida == null;
    }

}
