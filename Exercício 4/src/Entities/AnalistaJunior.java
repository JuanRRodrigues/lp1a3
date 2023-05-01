package Entities;

import java.time.LocalDateTime;


public class AnalistaJunior implements builder{
    private String nome;
    private int id;
    private double salario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    
    public AnalistaJunior setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public AnalistaJunior setId(int id) {
        this.id = id;
        return this;
    }
    public AnalistaJunior setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public AnalistaJunior setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public AnalistaJunior setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Analista createFuncionario(){
        return new Analista(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }
    

}