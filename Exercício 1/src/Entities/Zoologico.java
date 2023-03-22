package Entities;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

	private static List<Animal> animais = new ArrayList<>();
	
	
	public List<Animal> getAnimais() {
		return animais;
	}
	
	public static void listarAnimais() {
		for(Animal animal : animais) {
			System.out.println(animal);
		}
	}

	public static void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public static void alimentarAnimais() {
		for(Animal animal : animais) {
			animal.alimentar();
		}
	}
	
	public static void main(String[] args) {
		
		Mamífero cachorro = new Mamífero("bob", 4, "cachorro", 8);
		
		Ave galinha = new Ave("galinha", 3, "galinha", "pequeno");
		
		Reptil sapo = new Reptil("sapo", 9, "sapo", 24.3);
		
		adicionarAnimal(cachorro);
		adicionarAnimal(galinha);
		adicionarAnimal(sapo);
		alimentarAnimais();
		listarAnimais();
	}

}