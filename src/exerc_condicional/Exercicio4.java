package exerc_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim;
		
		System.out.print("Que horas o jogo começou: ");
		inicio = sc.nextInt();
		
		System.out.print("Que horas terminou? ");
		fim = sc.nextInt();
		
		int durou;
		if(inicio < fim) {
			durou = fim - inicio;
			
		}
		else {
			durou = 24 - inicio + fim;
		}
		System.out.println("o jogo durou " +durou+ " horas ");
		
		
		sc.close();
		

	}

}
