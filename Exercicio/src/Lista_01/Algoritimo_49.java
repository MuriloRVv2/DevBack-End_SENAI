package Lista_01;

import java.util.Scanner;

public class Algoritimo_49 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome completo: ");
		nome = sc.nextLine();
		
		System.out.println("Nome completo: " + nome);
		System.out.println("Primeiro caractere: " + nome .charAt(0));
		System.out.println("Último caractere: " + nome .charAt(nome .length()-1));
		System.out.println("Do primeiro ao terceiro caractere: ");
		System.out.println("Quarto caractere: " + nome .charAt(3));
		
		
	}
	
}
