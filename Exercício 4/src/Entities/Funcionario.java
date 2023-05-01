package Entities;

import java.time.LocalDateTime;

public class Funcionario {
	  private String nome;
	  private int id;
	  private double salario;
	  private LocalDateTime horaEntrada;
	  private LocalDateTime horaSaida;

	  public Funcionario(String nome, int id, double salario, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
		    this.nome = nome;
		    this.id = id;
		    this.salario = salario;
		    this.horaEntrada = horaEntrada;
		    this.horaSaida = horaSaida;
		  }
    
    

	  public String getNome() {
		    return nome;
		  }


		  protected void setNome(String nome) {
		    this.nome = nome;
		  }


		  public int getId() {
		    return id;
		  }


		  protected void setId(int id) {
		    this.id = id;
		  }


		  public double getSalario() {
		    return salario;
		  }


		  protected void setSalario(double salario) {
		    this.salario = salario;
		  }


		  public LocalDateTime getHoraEntrada() {
		    return horaEntrada;
		  }


		  public void setHoraEntrada(LocalDateTime horaEntrada) {
		    this.horaEntrada = horaEntrada;
		  }


		  public LocalDateTime getHoraSaida() {
		    return horaSaida;
		  }


		  public void setHoraSaida(LocalDateTime horaSaida) {
		    this.horaSaida = horaSaida;
		  }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Funcionario other = (Funcionario) obj;
        return this.id == other.id;
    }
}