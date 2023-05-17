package ex10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o nome cientifico do animal desejado:");
		String nomeCientifico = leitura.nextLine();
		a.nomeCientifico = nomeCientifico;
		System.out.println("Digite a familia do animal desejado:");
		String familia = leitura.nextLine();
		a.familia = familia;
		System.out.println("Digite o reino cientifico do animal desejado:");
		String reino = leitura.nextLine();
		a.reino = reino;
		System.out.println("O animal de nome cientifico : " + a.nomeCientifico + ", pertence a familia : " + a.familia
				+ ", pertence ao reino : " + a.reino);
		System.out.println("A seguir digite 5 nomes populares deste animal.");
		for (int i = 0; i < a.nomesPopulares.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º nome popular do animal desejado:");
			String nomesPopulares = leitura.nextLine();
			a.nomesPopulares[i] = nomesPopulares;
		}
		System.out.println("A seguir os 5 nomes populares do animal, dititados peloc usuario.");
		for (int i = 0; i < a.nomesPopulares.length; i++) {
			System.out.println((i + 1) + "º nome popular do animal:" + a.nomesPopulares[i]);
		}

	}

}
