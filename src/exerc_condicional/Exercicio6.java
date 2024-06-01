package exerc_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;

		System.out.print("Digite um número: ");
		x = sc.nextDouble();

		if (x > 0.00 && x <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}

		if (x > 25.00 && x <= 50) {
			System.out.println("Intervalo [25,50]");
		}

		if (x > 50.00 && x <= 75) {
			System.out.println("Intervalo [50,75]");
		}

		if (x > 75.00 && x <= 100.0) {
			System.out.println("Intervalo [75,100]");
		}

		else {
			if(x < 0.00 || x >100) {
				System.out.println("Fora de intervalo");	
			}
			
			
		}

		sc.close();

	}

}
