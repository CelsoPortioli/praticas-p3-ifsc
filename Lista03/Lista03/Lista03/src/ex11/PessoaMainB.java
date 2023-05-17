package ex11;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		int TanVet = 3;
		Pessoa p = new Pessoa();
		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i < p.dados.length; i++) {
			if (i == 0) {
				System.out.println("Digite o nome da pessoa:");
				String nome = leitura.nextLine();
				p.nome = nome;
				p.dados[i] = p.nome;
			}
			if (i == 2) {
				System.out.println("Digite o cpf da pessoa:");
				Long cpf = leitura.nextLong();
				p.cpf = cpf;
				String Cpf = String.valueOf(p.cpf);
				p.dados[i] = Cpf;
			}
			if (i == 1) {
				System.out.println("Digite a data de nascimento da pessoa:");
				String datanascimento = leitura.nextLine();
				p.datanascimento = datanascimento;
				p.dados[i] = p.datanascimento;
			}

		}
		for (int i = 0; i < p.dados.length; i++) {
			if (i == 0) {
				System.out.print("O " + p.dados[i]);
			}
			if (i == 2) {
				System.out.print(" ,tem o CPF  " + p.dados[i]);
			}
			if (i == 1) {
				System.out.print(" ,e nasceu em " + p.dados[i]);
			}

		}

	}

}
