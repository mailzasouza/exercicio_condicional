package exerc_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.print("Digite dois números separados por espaço: ");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.print("Q1");
		}
		if (x < 0 && y > 0) {
			System.out.print("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.print("Q4");
		} else if (x == 0 && y > 0 || y < 0) {
			System.out.print("Eixo Y");
		} else if(y == 0 && x > 0.0 || x < 0.0) {
			System.out.print("Eixo X");
		}

		sc.close();
	}

}
