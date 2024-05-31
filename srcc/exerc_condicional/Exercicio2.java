package exerc_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int x; 
		
		System.out.print("Digite o número: ");
		x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.print("PAR");
			
		}
		else {
			System.out.print("IMPAR");
		}
		
		
		
		
		
		sc.close();
		
		
	}

}
