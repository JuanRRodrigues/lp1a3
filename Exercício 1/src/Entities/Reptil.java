package Entities;

public class Reptil extends Animal{

	private double temperaturaCorporal;
	
	public Reptil(String nome, int idade, String especie, double temperaturaCorporal) {
		super(nome, idade, especie);
		this.temperaturaCorporal = temperaturaCorporal;
	}

	@Override
	public void emitirSom() {
		System.out.println("som de reptil");
	}

	public double getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(double temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	@Override
	public void alimentar() {
		this.setAlimentado(true);
	}
	
	@Override
	public String toString() {
		return "Mamifero tempoGestacao: " + getTemperaturaCorporal() + ", Nome: " + getNome() + ",Idade: " + getIdade()
				+ ", Especie: " + getEspecie() + ", Alimentado: " + getAlimentado() + "]";
	}
	
}