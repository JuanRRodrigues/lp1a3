package Entities;

import java.time.LocalDateTime;


public class FuncionarioBuilder implements builder{
    private String nome;
    private int id;
    private double salario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    
    public FuncionarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public FuncionarioBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public FuncionarioBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public FuncionarioBuilder setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public FuncionarioBuilder setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Analista createFuncionario(){
        return new Analista(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }
    

}