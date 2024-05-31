package exerc_condicional;

import java.util.Scanner;

public class Exercio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		int x;
		
		System.out.print("Digite o número: ");
		x = sc.nextInt();
		
		if( x < 0) {
			System.out.print("NEGATIVO");
		}
		else 
			System.out.print("POSITIVO");
		
		
		sc.close();

	}

}
