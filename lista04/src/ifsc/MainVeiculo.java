package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static <veiculos> void main(String[] args) {
		Veiculo veiculo1 = new Veiculo();

		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		Veiculo R8 = new Veiculo();
		R8.setNome("R8 e-tron");
		R8.setFabricante("Audi AG");
		R8.setNúmeroDeRodas("4 rodas");
		R8.setAno(2015);
		R8.setCor("Rosa");
		
		veiculos.add(R8);
		
		Veiculo Uno = new Veiculo();
		Uno.setNome("\nUno");
		Uno.setFabricante("Fiat");
		Uno.setNúmeroDeRodas("4 rodas");
		Uno.setAno(2010);
		Uno.setCor("Branco\n");
		
		veiculos.add(Uno);
		
		Veiculo Celta = new Veiculo();
		Celta.setNome("Celta");
		Celta.setFabricante("Ford");
		Celta.setNúmeroDeRodas("4 rodas");
		Celta.setAno(2005);
		Celta.setCor("Rosa");
		
		veiculos.add(Celta);

		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNúmeroDeRodas());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
		}
		
		
	
	}
}
