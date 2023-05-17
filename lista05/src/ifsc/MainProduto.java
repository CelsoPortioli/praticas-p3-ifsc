package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produtos = new Produto();

		ArrayList<Produto> produto = new ArrayList<>();

		Produto Papel = new Produto();

		Papel.setNome("Papel Sulfite A4 Clamex");
		Papel.setCodBarras(789835741123l);
		Papel.setPreco(32.59);
		Papel.setFornecedor("Fornecedor Clamex");

		produto.add(Papel);

		Produto Cartolina = new Produto();

		Cartolina.setNome("Cartolina Verde");
		Cartolina.setCodBarras(21544767467l);
		Cartolina.setPreco(12.75);
		Cartolina.setFornecedor("Fornecedor Claudia");

		produto.add(Cartolina);

		Produto Papelao = new Produto();

		Papelao.setNome("Papelão");
		Papelao.setCodBarras(754162785185l);
		Papelao.setPreco(09.87);
		Papelao.setFornecedor("Fornecedor Claudionor");

		produto.add(Papelao);

		for (Produto produtos1 : produto) {
			System.out.println("\nNome do produto:" + produtos1.getNome());
			System.out.println("Código de barras do produto:" + produtos1.getCodBarras());
			System.out.println("Preço do produto:" + produtos1.getPreco());
			System.out.println("Fornecedor do produto:" + produtos1.getFornecedor());
		}

	}

}
