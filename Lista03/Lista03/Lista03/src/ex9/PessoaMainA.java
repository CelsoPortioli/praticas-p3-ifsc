package ex9;

public class PessoaMainA {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.cpf = 86163618041l;
		p.nome = "Roberto Carlos";
		p.datanascimento = "19/04/1941";
		System.out.println("O " + p.nome + " ,tem o CPF  " + p.cpf + " ,e nasceu em " + p.datanascimento);
		p.cpf = 19269275078l;
		p.nome = "Edson Arantes";
		p.datanascimento = "21/02/1952";
		System.out.println("O " + p.nome + " ,tem o CPF  " + p.cpf + " ,e nasceu em " + p.datanascimento);
		p.cpf = 22984343018l;
		p.nome = "Otávio Miguel Goulart Venero";
		p.datanascimento = "29/03/2023";
		System.out.println("O " + p.nome + " ,tem o CPF  " + p.cpf + " ,e nasceu em " + p.datanascimento);

	}

}
