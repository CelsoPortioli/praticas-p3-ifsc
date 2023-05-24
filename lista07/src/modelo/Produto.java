package modelo;

public class Produto {
	private String Nome;
	private Long codBarras;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Long getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(Long codBarras) {
		this.codBarras = codBarras;
	}

}
