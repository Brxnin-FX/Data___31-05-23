package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Insira o tamanho do array");
		int tamanho = entrada.nextInt();

		int []array = new int[tamanho];

		int loopInt = 0;
		do {
			try {
			System.out.println("Insira o numero a ser adicionado");
			int numeroAdd = entrada.nextInt();
			System.out.println("Insira o local onde sera salvo o numero");
			int indexArray = entrada.nextInt();
			if(numeroAdd < 0 || indexArray < 0 ) {
				throw new NegativeNumberException(" Numero Negetaivo");
			}
			array[indexArray] = numeroAdd;
			loopInt = loopInt + 1;
			
			
		}catch(InputMismatchException e) {
			System.out.println("Erro" + e.getMessage());
			entrada.nextLine();
			
			
		}catch(NegativeNumberException e) {
			System.out.println("Erro" + e.getMessage());
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Tamnho do vetor inserido incorreto");
			System.out.println("Array Atual: ");
			for(int i=0;i< array.length;i++) {
				System.out.println("Array numero" +i + "Valor[" + array[i]+"]");
			}
			
			
		}
			
		}while(loopInt != tamanho);
		
		
		
		
		System.out.println("\n\n\n\n-----------Array Formado---------------");
		
		for(int i=0;i< array.length;i++) {
			System.out.println("Array numero " +i + "Valor[" + array[i]+"]");
		}

		entrada.close();
	}

}
