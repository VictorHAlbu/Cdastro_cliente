package br.com.victor;
import java.util.ArrayList;
import java.util.Scanner;


public class Cliente {
	  
	  private int codigo;
	    private String cpf;
	    private String nome;
	    private String data;
	    private int QtdDeElelentos;
	    public Cliente() {

	    }

	    public Cliente(int codigo, String cpf, String nome, String data) {
	        super();
	        this.codigo = codigo;
	        this.cpf = cpf;
	        this.nome = nome;
	        this.data = data;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    @Override
		public String toString() {
			return "Cliente: codigo=" + codigo + ", cpf=" + cpf + ", nome=" + nome + ", data=" + data + "]";
		}

		public String getdata() {
	        return data;
	    }

	    public void setdata(String data) {
	        this.data = data;
	    }

	    
	    Scanner entrada = new Scanner(System.in);
	    static Cliente cliente = new Cliente();
	    static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	    public void cadCliente() {

	        System.out.println("\n===== Cadastro de cliente =====\n");

	        System.out.println("Código: ");
	        cliente.setCodigo(Integer.parseInt(entrada.nextLine()));

	        System.out.println("CPF: ");
	        cliente.setCpf(entrada.nextLine());

	        System.out.println("Nome: ");
	        cliente.setNome(entrada.nextLine());

	        System.out.println("Data ");
	        cliente.setdata(entrada.nextLine());

	        listaClientes.add(cliente);

	        System.out.println("Cliente cadastrado com sucesso.");
	        TestaCliente.main(null);
	    }

		private boolean posicaoOcupada(int posicao) {
			return posicao >= 0 && posicao < this.QtdDeElelentos;
		}
	    public void pesquisaCliente() {

	        String cpf;

	        System.out.println("===== Pesquisa de cliente =====\n");
	        System.out.println("Digite o CPF do cliente: ");
	        cpf = entrada.nextLine();

	        for (Cliente clientes : listaClientes) {

	            if (clientes.getCpf().equals(cpf)) {

	                System.out.println("\n.:: Resultado da pesquisa ::.");
	                System.out.println("Código: " + clientes.getCodigo() + 
	                "\nCPF: " + clientes.getCpf() +
	                "\nNome: " + clientes.getNome() +
	                "\nData: " + clientes.getdata());

	                System.out.println("O que desja fazer com esse cliente? ");
	                System.out.println("\nE - Editar cliente");
	                System.out.println("\nA - Apagar cliente");
	                System.out.println("\nV - Voltar para o menu principal");
	                String opcao = null;
	                opcao = entrada.nextLine();

	                switch (opcao) {

	                    case "a":
	                        String lcpf = cpf;
	                        clientes.apagacliente(lcpf);
	                        break;

	                    case "v":
	                        TestaCliente.main(null);
	                        break;

	                    default:
	                        System.out.println("Opção inválida.");
	                        break;
	                }

	                entrada.next();
	                TestaCliente.main(null);
	            }
	        }
	        System.out.println("Cliente nao encontrado.");
	        TestaCliente.main(null);
	    }

	    public void editacliente() {

	        System.out.println("===== Edição de cliente =====\n");

	    }

	    public void apagacliente(String cpf) {

	        //System.out.println("===== Pesquisa de cliente =====\n");
	        //System.out.println("Digite o CPF do cliente: ");

	        //String acpf = entrada.next(cpf);

	        System.out.println("\nTem certeza que deseja apagar este cliente? ");
	        System.out.println("\n1 - Sim");
	        System.out.println("\n2 - Não");

	        int opcao = entrada.nextInt();

	        switch (opcao) {
	        case 1:
	            int pcpf = listaClientes.indexOf(cpf);
	            listaClientes.remove(pcpf);
	            System.out.println("Cliente apagado com sucesso.");
	            System.out.println("Aperte qualquer tecla para continuar...");
	            TestaCliente.main(null);
	            break;

	        case 2:
	        	TestaCliente.main(null);
	            break;

	        default:
	            System.out.println("Opção inválida.");
	            break;

	            /*
	        for (Cliente clientes : listaClientes) {

	            if (clientes.getCpf().equals(cpf)) {

	                System.out.println("Código: " + clientes.getCodigo() + 
	                        "\nCPF: " + clientes.getCpf() +
	                        "\nNome: " + clientes.getNome() +
	                        "\nEndereço: " + clientes.getEndereco());


	            }
	        }
	        */
	        }
	    }
	

public String toString2() {
	
	if(QtdDeElelentos == 0) {
		return "[]";
	}
	StringBuilder builder = new StringBuilder("[");

	for (int i = 0; i < this.QtdDeElelentos -1; i++) {
		builder.append(nome);
		builder.append(", ");
		
	}
	builder.append("]");
	
	return builder.toString();
 }
}

