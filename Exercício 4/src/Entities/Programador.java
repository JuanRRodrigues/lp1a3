package Entities;

import java.time.LocalTime;

public class Programador extends Funcionario implements Ponto {
    public Programador(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public void entrada(LocalTime hora) {
        setHoraEntrada(hora);
    }

    @Override
    public void saida(LocalTime hora) {
        setHoraSaida(hora);
    }
}