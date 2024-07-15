package exerc_condicional;

import java.util.Scanner;

public class ExercicioAula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = 50.00;
		int minutos;
		double custo = 2.00;
		
		System.out.print("Digite quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if(minutos <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f", valor);
		}
		else {
			System.out.printf("valor a pagar: R$ %.2f", valor + custo*(minutos-100));
		}
		
		
		sc.close();

	}

}
