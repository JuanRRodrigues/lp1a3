package Entities;

import java.time.LocalDateTime;


public class GerenteBuilder implements builder{
    private String nome;
    private int id;
    private double salario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    
    public GerenteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public GerenteBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public GerenteBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public GerenteBuilder setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public GerenteBuilder setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Gerente createFuncionario(){
        return new Gerente(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }
    

}