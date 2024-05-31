package exerc_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		int codigo;
		double total;
		total = 0.00;
		int num;
		
		System.out.println("Digite o número do pedido: ");
		num = sc.nextInt();
		System.out.print("Digite o código: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4.00;
		} 
		if(codigo == 2) {
			total = quantidade * 4.50;
		}
		if(codigo == 3) {
			total = quantidade * 5.00;
		}
		if(codigo == 4) {
			total = quantidade * 2.00;
		} 
		if(codigo == 5) {
			total = quantidade * 1.50;
		}
		
			
			System.out.printf("Total: R$ %.2f%n", total);
		
		
		
		
		sc.close();
	}

}
