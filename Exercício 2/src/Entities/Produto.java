package Entities;

public class Produto {

	private String Nome;
	private double preço;
	
	public Produto(String nome, double preço) {
		Nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	@Override
	public String toString() {
		return " Nome=" + Nome + " preço=" + preço ;
	}
	

	
}
