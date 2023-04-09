package Application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {

	
		private static List<String> list1 = new ArrayList<>();
		private static List<String> list2 = new ArrayList<>();
		private static List<String> list3 = new LinkedList<>();
		
		private static Scanner sc = new Scanner(System.in);
		
		private static String[] strings = new String[6];
		public static void main(String[] args) {
			
			// Adicionando elementos 
			System.out.println("digite o valor 1 da lista 1");
			strings[0] = sc.next();
			sc.nextLine();
			System.out.println("digite o valor 2 da lista 1");
			strings[1] = sc.next();
			sc.nextLine();
			
			for(int i=0; i<2; i++) {
				addElement(list1, strings[i]);
			}
			
			System.out.println("digite o valor 1 da lista 2");
			strings[2] = sc.next();
			sc.nextLine();
			System.out.println("digite o valor 2 da lista 2");
			strings[3] = sc.next();
			sc.nextLine();
			
			for(int i=2; i<4; i++) {
				addElement(list2, strings[i]);
			}
			
			System.out.println("digite o valor 1 da lista 3");
			strings[4] = sc.next();
			sc.nextLine();
			System.out.println("digite o valor 2 da lista 3");
			strings[5] = sc.next();
			sc.nextLine();
			
			for(int i=4; i<6; i++) {
				addElement(list3, strings[i]);
			}
			
			for(String s : list2) {
				addElement(list1, s);
			}
			for(String s : list3) {
				addElement(list1, s);
			}
			
			for(String s : list2) {
				System.out.print(s + " : ");
				if(list1.contains(s)) {
					System.out.println("Tem na lista 1");
				}else {
					System.out.println("Não contem na lista 1");
				}
			}
			if(list1.contains(list3.get(0)) == true && list1.contains(list3.get(1)) == true) {
				System.out.println("Todos os elementos da lista 3 estão na lista 1");
			}
			if(list1.equals(list2)) {
				System.out.println("lista 1 é igual lista 2");
			}else {
				System.out.println("lista 1 é diferente da lista 2");
			}
			System.out.println("lista 1 : " + list1.get(1));
			System.out.println("lista 2 : " + list2.get(1));
			System.out.println("lista 3 : " + list3.get(1));
			for(String s : list1) {
				if(list3.contains(s)) {
					list1.remove(s);
				}
			}
			System.out.print("o tamanho da lista 1 é:");
			System.out.println(list1.size());
			list3.removeAll(list3);
			if(list3.isEmpty()) {
				System.out.println("lista 3 é vazia");
			}else {
				System.out.println("list 2 não é vazia");
			}
			System.out.println("Todos elementos da lista 1");
			for(String s : list1) {
				System.out.println(s);
			}
			
			sc.close();
		}
		
	
		
		private static void addElement(List<String> list, String input) throws NumberFormatException {
		    try {
		        int number = Integer.parseInt(input);
		        list.add(String.valueOf(number));
		    } catch (NumberFormatException e) {
		        throw new RuntimeException("A entrada do usuário não é um número.");
		    }
		}

	}
