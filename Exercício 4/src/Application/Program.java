package Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities.Analista;
import Entities.AnalistaJunior;
import Entities.Departamento;
import Entities.Funcionario;
import Entities.Gerente;
import Entities.Ponto;
import Entities.Programador;

public class Program {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


  
          
          
        // Criação dos funcionários
    	Analista f1 = new AnalistaJunior().setNome("Julio Cesar").setId(1).setSalario(2800).createFuncionario();
    	Analista f2 = new AnalistaJunior().setNome("Magnus").setId(2).setSalario(3800).createFuncionario();
          
    	Departamento<Analista> departamento = new Departamento<Analista>();
    	
    	departamento.adicionarFuncionario(f1);
    	departamento.adicionarFuncionario(f2);
    	
    	 LocalDateTime horaEntrada = LocalDateTime.of(2023, 5, 1, 9, 0);
         LocalDateTime horaSaida = LocalDateTime.of(2023, 5, 1, 18, 0);
         
    	
        f1.setHoraEntrada(LocalDateTime.of(2023,4,7,7,30));
        f1.setHoraSaida(LocalDateTime.of(2023,4,7,5,30));
        
        f2.setHoraEntrada(LocalDateTime.of(2023,4,7,10,30));
        f2.setHoraSaida(LocalDateTime.of(2023,4,7,6,30));
        
        
       
        // Listagem dos funcionários do departamento
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : departamento.listarFuncionarios()) {
            System.out.println(funcionario.getNome() + " - " + funcionario.getSalario());
        }
        
  
        
            
        System.out.println("Lista de Atrasados:");
        for (Funcionario funcionario : departamento.listarAtrasados(LocalDateTime.of(2023,4,7,8,0))) {
            System.out.println(funcionario.getNome() + " - " + funcionario.getSalario());
        }

		
        }
    }
    

        	
        