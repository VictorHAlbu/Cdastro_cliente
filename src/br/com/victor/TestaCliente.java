package br.com.victor;
import java.util.Scanner;

public class TestaCliente {

public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
	        Cliente cliente = new Cliente();
	        Cliente removidos = new Cliente();
	      
	        
	        System.out.println("====== CADASTRO CLIENTES =====");
	        System.out.println("1 - Cadastrar cliente");
	        System.out.println("2 - Pesquisar cliente/excluir");
	        System.out.println("3 - Clientes Cadastrados");
	        System.out.println("Escolha uma opção: ");
	        int opcao = sc.nextInt();

	        switch (opcao) {

	        case 1:
	            cliente.cadCliente();
	            break;

	        case 2:
	            cliente.pesquisaCliente();
	            break;
	        case 3:
	            System.out.println(cliente.getNome());
	            break;


	        default:
	            System.out.println("Opção inválida.");
	            TestaCliente.main(null);
	            break;
	        }
	        
	        
	        

	    }
	

	}


