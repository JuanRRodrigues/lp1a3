package Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.Gerente;
import Entities.Programador;

public class Program {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    	
    	
    	
    	 Gerente gerente1 = new Gerente("João", 1, 10000);
         Programador programador1 = new Programador("Pedro", 2, 5000);
         Funcionario funcionario1 = new Funcionario("Juan", 3, 1200);
         
         
         System.out.println("Qual o Nome do Funcioanrio");
         String name = sc.nextLine();
         System.out.println("Qual o ID do Funcioanrio");
         int id = sc.nextInt();
         System.out.println("Hora de chegada: (dd/MM/yyy HH:mm): ");
         LocalDateTime horaEntrada = LocalDateTime.parse(sc.nextLine(), fmt);
         System.out.println("Hora de saida: (dd/MM/yyy HH:mm): ");
         LocalDateTime horaSaida = LocalDateTime.parse(sc.nextLine(), fmt);
    	sc.close();
    	
    	
      
    }
    
}
        	
        