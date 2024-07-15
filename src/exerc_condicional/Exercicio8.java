package exerc_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, totalSalario, taxa;
		 
		
		
		System.out.print("Digite o valor do salário: ");
		salario = sc.nextDouble();
		
		sc.nextLine();
		if (salario <= 2000.00) {
			taxa = 0.0;
		}
		else if (salario <= 3000.00) {
			taxa = (salario - 2000.00) * 0.08;
			System.out.printf("IRRF a pagar: ", taxa);
		}
		else {
			System.out.println("Tudo bem");
		}
		if (taxa == 0) {
			System.out.print("Isento");
		}	
		
		
		sc.close();

	}

}
