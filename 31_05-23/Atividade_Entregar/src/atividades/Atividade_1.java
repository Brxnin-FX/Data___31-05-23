package atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade_1 {

	public static void metodo1()  throws ArrayIndexOutOfBoundsException{		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o tamanho o Array: ");
		int tamanho=0;
		boolean loop =false;
		do {
		try {
		 tamanho = entrada.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Erro " + e.getMessage());
			System.out.println("Insria um numero: ");
			loop = true;
			entrada.next();
		}
		}while(loop);
		int []vetor = new int[tamanho];
		
		for(int i = 0; i<tamanho; i++) {		
			vetor[i] = i;			
			System.out.println(i);		
		}
		
		
				
	}
		
	public static void main(String[] args) {		
		System.out.println("Início da main.");	
		try {
			metodo1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro " + e);
		}
				
		System.out.println("Fim da main.");		
	}	
}
