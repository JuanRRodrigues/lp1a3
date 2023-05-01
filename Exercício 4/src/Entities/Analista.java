package Entities;


import java.time.LocalDateTime;

public class Analista extends Funcionario implements Ponto{

    protected Analista(String nome, int id, double salario, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }
    
    public void entradaFuncionario(LocalDateTime date) {
        setHoraEntrada(date);
    }

    public void saidaFuncionario(LocalDateTime date) {
        setHoraSaida(date);
    }   

  

}