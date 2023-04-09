package Entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Departamento<T extends Funcionario & Ponto> {
    private List<T> funcionarios;
    private List<Gerente> gerentes;
    
    public Departamento() {
        funcionarios = new ArrayList<>();
        gerentes = new ArrayList<>();
    }
    
    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
        if (funcionario instanceof Gerente) {
            gerentes.add((Gerente) funcionario);
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
    
    public List<T> listarAtrasados(LocalTime hora) {
        List<T> lista = new ArrayList<>();
        for (T funcionario : funcionarios) {
            if (funcionario.getHoraEntrada().compareTo(hora) > 0) {
                lista.add(funcionario);
            }
        }
        return lista;
    }
}