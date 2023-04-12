package ifsc;

import java.util.ArrayList;

public class Veiculo<veiculos> {
	private String nome;
	private Integer ano;
	public String númeroDeRodas;
	public String fabricante;
	public String cor;
	

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getNúmeroDeRodas() {
		return númeroDeRodas;
	}

	public void setNúmeroDeRodas(String númeroDeRodas) {
		this.númeroDeRodas = númeroDeRodas;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
