package exerc_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, z;
		
		System.out.println("Digite os números: ");
		x = sc.nextInt();
		z = sc.nextInt();
		
		if(x % z == 0 || z % x == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		
		sc.close();

	}

}
