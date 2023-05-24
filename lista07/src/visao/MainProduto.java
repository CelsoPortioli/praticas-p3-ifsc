package visao;

import modelo.Produto;

import controle.ProdutoDAO;

class MainProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setNome("Cavalo");
		p.setCodBarras(45985747l);

		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p);

		for (Produto produto : dao.listar()) {
			System.out.println("\nProduto cadastrado: " + produto.getNome());
		}

		p.setNome("Cadeira de massagem");
		dao.alterar(p);

		for (Produto produto : dao.listar()) {
			System.out.println("\nProduto cadastrado: " + produto.getNome());
		}

		dao.excluir(p);
		for (Produto produto : dao.listar()) {
			System.out.println("\nProduto cadastrado: " + produto.getNome());
		}

		System.out.println("\nProduto cadastrado: " + dao.listar());
		
		dao.inserir(p);
		p.setNome("Lamparina");
		dao.alterar(p);

		for (Produto produto : dao.listar()) {
			System.out.println("\nProduto cadastrado: " + produto.getNome());
		}

		dao.excluir(p);
		for (Produto produto : dao.listar()) {
			System.out.println("\nProduto cadastrado: " + produto.getNome());
		}

		System.out.println("\nProduto cadastrado: " + dao.listar());}}

