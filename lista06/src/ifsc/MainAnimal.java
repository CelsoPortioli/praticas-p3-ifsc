package ifsc;

import java.util.ArrayList;

public class MainAnimal {

	public static <Cachorros> void main(String[] args) {
		// TODO Auto-generated method stub

		Animal bixos = new Animal();

		ArrayList<Cachorro> cachorro = new ArrayList<>();

		Cachorro Cachorro = new Cachorro();

		Cachorro.setNome("Fimas");
		Cachorro.setRaca("Vira-lata");
		Cachorro.setCaminha("Sim");
		Cachorro.setComprimento(1.45f);
		Cachorro.setNumeroDePatas(4);
		Cachorro.setCor("Branco");
		Cachorro.setEcossistema("Instituto Federal de Santa Catarina, Câmpus Gaspar");
		Cachorro.add(Cachorro);
		Cachorro.Late();
		System.out.println("\nNome do cachorro: " + Cachorro.getNome());
		System.out.println("\nRaça do cachorro: " + Cachorro.getRaca());
		System.out.println("\nO cachorro pode caminhar: " + Cachorro.getCaminha());
		System.out.println("\nComprimento do cachorro: " + Cachorro.getComprimento() + " metros");
		System.out.println("\nNúmero de patas do cachorro: " + Cachorro.getNumeroDePatas() + " patas");
		System.out.println("\nCor do cachorro: " + Cachorro.getCor());
		System.out.println("\nEcossistema do cachorro: " + Cachorro.getEcossistema());
		System.out.println("\n");
		ArrayList<Gato> gato = new ArrayList<>();

		Gato Gato = new Gato();

		Gato.setNome("Etebaldo");
		Gato.setRaca("Persa");
		Gato.setCaminha("Sim");
		Gato.setComprimento(0.45f);
		Gato.setNumeroDePatas(3);
		Gato.setCor("Malhado");
		Gato.setEcossistema("Delegacia de policia Jaraguá do Sul");
		Gato.add(gato);
		Gato.Mia();
		System.out.println("\nNome do gato: " + Gato.getNome());
		System.out.println("\nRaça do gato: " + Gato.getRaca());
		System.out.println("\nO gato pode caminhar: " + Gato.getCaminha());
		System.out.println("\nComprimento do gato: " + Gato.getComprimento() + " metros");
		System.out.println("\nNúmero de patas do gato: " + Gato.getNumeroDePatas() + " patas");
		System.out.println("\nCor do gato: " + Gato.getCor());
		System.out.println("\nEcossistema do gato: " + Gato.getEcossistema());
		System.out.println("\n");

	}

}
