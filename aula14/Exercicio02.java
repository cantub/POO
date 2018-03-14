package iftm.poo.aula14;
import java.util.Scanner;

public class Exercicio02 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String sc = scanner.nextLine();
		System.out.println("Digite uma palavra: ");
		System.out.println(sc);
		System.out.println(sc.length());
		for(int i = 0; i < sc.length(); i++)
			System.out.println(sc.charAt(i));
	}
}