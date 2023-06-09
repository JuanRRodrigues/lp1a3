package Entities;

import java.time.LocalDateTime;


public class ProgramadorBuilder implements builder{
    private String nome;
    private int id;
    private double salario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    
    public ProgramadorBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public ProgramadorBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public ProgramadorBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public ProgramadorBuilder setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public ProgramadorBuilder setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Programador createFuncionario(){
        return new Programador(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }
    

}