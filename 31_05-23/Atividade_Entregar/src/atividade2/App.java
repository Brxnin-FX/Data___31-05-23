package atividade2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	


	public static void main(String[] args) {
		/*
		 * No inicio da Main eu instancio todos os atributos e variaveis
		 * que eu vou utilizar para o codigo
		 * como input de dados --> Scanner entrada = new Scanner(System.in):
		 * 
		 * e o Objeto para utilizar os metodos da classe conta --> Conta minhaConta = new Conta();
		 * 
		 * Double valorLimite = inserirDouble(); --> variavel para setar o valor limite da conta
		 * minhaConta.setSaldoLimite(valorLimite); --> setando o valor limite com a variavel valorLimite
		 * 
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		Conta minhaConta = new Conta();
		System.out.println("Insira o valor limite da Conta");
		Double valorLimite = inserirDouble();
		minhaConta.setSaldoLimite(valorLimite);
		
		
		/*
		 * Double deposito = inserirDouble(); --> variavel usada para fazer o deposito
		 * minhaConta.depositar(deposito); --> faz o deposito com a variavel inserida anteriormente
		 * 
		 */
		
		System.out.println("Valor a ser Depositado: ");
		Double deposito = inserirDouble();
		minhaConta.depositar(deposito);
		
		
		
		/*
		 * Aqui eu utilizo uma variavel auxiliar (boolean loop = false;) para faser um loop
		 * no try catch para que a Exception lançada nao quebro o codigo e consiga recuperar 
		 * o valor da conta
         *
		 * juntamente com o laço do while fazendo a repetição caso o usuario deseje sair
		 */
		boolean loop = false;
		do {
		/*
		 * menu para ver se o usuario deseja fazer um deposito ou não 
		 */
			
			System.out.println("Deseja sacar?");
			System.out.println("1 -- Sim");
			System.out.println("2 --Não");
			int opcao = inserirInt();
			if(opcao == 1) {
				
				/*
				 * caso escolha a opcao 1 ele fara um deposito
				 * inserirno um valor na variavel valorASacar
				 */
			System.out.println("Insira o valor que deseja sacar");
			Double valorASacar = inserirDouble();
			
			minhaConta.sacar(valorASacar);
			//Aqui nos atribuimos o valor true para que o laço se repita
			loop = true;
				
			}
			/*
			 * caso o valor de loop seja false 
			 * ele saira do laço e mostrara a mensagem ate mais...
			 */
			else if(opcao == 2){
				System.out.println("Até mais");
			}
			//Verificação do laço do While pela variavel Loop
		}while(loop);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	public static Integer inserirInt() {
		Scanner entrada = new Scanner(System.in);
		Integer num = null;
		 boolean entradaValida = false;
		 while (!entradaValida) {
	            try {
	                num = entrada.nextInt();
	                entradaValida = true;
	            } catch (InputMismatchException e) {
	                System.err.println("Erro: Entrada invÃ¡lida. Insira um nÃºmero inteiro.");
	                entrada.nextLine();
	            }
	        }
	        
	        return num;
	    
	}
	
	
	public static Double inserirDouble() {
		Scanner entrada = new Scanner(System.in);
		Double num = null;
		 boolean entradaValida = false;
		 while (!entradaValida) {
	            num = entrada.nextDouble();
				entradaValida = true;
	        }
	        
	        return num;
	}

}
