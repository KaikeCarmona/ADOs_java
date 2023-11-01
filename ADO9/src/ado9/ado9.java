package ado9;

import java.util.Scanner;

public class ado9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double comprimento = 0.0;

		int escolha = 0;
		boolean continuar = true;

		System.out.printf("Insira o cumprimento do circulo: ");
		comprimento = teclado.nextDouble();
		
		while (continuar) {
			System.out.printf(
					"--------------------------------MENU--------------------------------\n1 - calcular diametro\n2 - calcular raio\n3 - calcular área\nDIGITE A OPÇÃO: ");
			escolha = teclado.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("O Diametro do circulo é: " + Diametro(comprimento));
				break;
			case 2:
				System.out.println("O Raio do circulo é: " + raio(comprimento));
				break;

			case 3:
				System.out.println("A Area do circulo é: " + area(comprimento));
				break;

			default:
				System.out.println("Programa finalizado!!!");
				continuar = false;
			}
		}

	}

	public static double Diametro(double comprimento) {
		return comprimento / 3.14;
	}

	public static double raio(double comprimento) {
		return  Diametro(comprimento) /2;
	}

	public static double area(double comprimento) {
		return Math.pow(raio(comprimento), 2)*3.14;
	}

}
