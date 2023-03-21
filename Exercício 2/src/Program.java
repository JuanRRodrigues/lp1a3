import java.util.Scanner;

import Entities.Venda;

public class Program {
	
		 private static int op, id;
		 
			public static void main(String[] args) {
				Venda vendas = new Venda();
				Scanner sc = new Scanner(System.in);
				
				do {
					menu();
					op = sc.nextInt();
					switch (op) {
					case 1: {
						vendas.ListarProdutos();
						break;
					}
					case 2:{
						System.out.println("indique o Id");
						id = sc.nextInt();
						try {
							vendas.addRemove(id);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
						
					default:
						break;
					}
					
					
					
				}while(op != 3);
			
				sc.close();
			}
			
			public static void menu() {
				System.out.println("Menu");
				System.out.println("Opção 1: Listar");
				System.out.println("Opção 2: Vender");
			}
		

  
}
