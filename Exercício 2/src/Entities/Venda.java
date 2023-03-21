package Entities;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	public Venda() {
		Produtos.add(new Produto("P1", 2.50));
	}

	private List<Produto> Produtos = new ArrayList<>();
	
	
	public void ListarProdutos() {
		for(int i=0;i<Produtos.size();i++) {
			System.out.println("id: " + i + Produtos.get(i));
		}
	}
	
	public void addRemove(int id) throws Exception {
		if(Produtos.contains(Produtos.get(id))) {
			Produtos.remove(id);
		}else {
			throw new Exception("nÃO TEM");
		}

}

	
}

