package IFSC;

import java.util.Iterator;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class HelloMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Agr pode ler os dados*/
		
		Scanner leitura = new Scanner(System.in);
		
		/*Pergunta e recebe o nome*/	
		
		System.out.println("Diga o seu nome:");
		String nome = leitura.nextLine();
		
		/*Pergunta e recebe a idade*/
		
		System.out.println("Diga a sua idade:");
		String idadeStr = leitura.nextLine();
		
		/*Conversão de variavel*/
		
		double idade = Double.valueOf(idadeStr);
		
		/*Exibe o conteúde que foi digitado*/
		
		System.out.println(nome + ", " + idade + " Anos");
		
		

	}

}
