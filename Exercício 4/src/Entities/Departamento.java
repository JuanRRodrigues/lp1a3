package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Departamento <T extends Funcionario & Ponto> {
    private List<T> funcionarios;
    private List<Gerente> gerentes;
    
    public Departamento() {
        funcionarios = new ArrayList<>();
        gerentes = new ArrayList<>();
    }
    
    public void adicionarFuncionario(T f1) {
        funcionarios.add(f1);
        if (f1 instanceof Gerente) {
            gerentes.add((Gerente) f1);
        }
    }
    
    public void adicionarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }
    
    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> lista = new ArrayList<>();
        lista.addAll(funcionarios);
        lista.addAll(gerentes);
        return lista;
    }
    
    public List<T> listarAtrasados(LocalDateTime hora) {
        List<T> lista = new ArrayList<>();
        for (T funcionario : funcionarios) {
            if (funcionario.getHoraEntrada().compareTo(hora) > 0) {
                lista.add(funcionario);
            }
        }
        return lista;
    }
}