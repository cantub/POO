package iftm.poo.aula14;
import java.util.Scanner;

public class Exercicio01 {
	public static 
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite uma palavra: ");
		String sc = scanner.nextLine();
		for(int i = 0; i < sc.length(); i++)
			System.out.println(sc);
	}
}