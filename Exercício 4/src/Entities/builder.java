package Entities;

import java.time.LocalDateTime;

public interface builder {    
    public builder setNome(String nome);
    public builder setId(int id);
    public builder setSalario(double salario);
    public builder setHoraEntrada(LocalDateTime horaEntrada);
    public builder setHoraSaida(LocalDateTime horaSaida);
    public Funcionario createFuncionario();
}