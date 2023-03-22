package Entities;

public class Mamífero extends Animal {

	private int tempoGestacao;

	public Mamífero(String nome, int idade, String especie, int tempoGestacao) {
		super(nome, idade, especie);
		this.tempoGestacao = tempoGestacao;
	}

	public int getTempoGestacao() {
		return tempoGestacao;
	}

	public void setTempoGestacao(int tempoGestacao) {
		this.tempoGestacao = tempoGestacao;
	}
	
	@Override
	public void alimentar() {
		this.setAlimentado(true);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
	}

	@Override
	public String toString() {
		return "Mamifero tempoGestacao: " + tempoGestacao + ", Nome: " + getNome() + ",Idade: " + getIdade()
				+ ", Especie: " + getEspecie() + ", Alimentado: " + getAlimentado() + "]";
	}
	
}
