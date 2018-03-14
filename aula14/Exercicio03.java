package iftm.poo.aula14;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String scan = sc.nextLine();
		sc.close();	
		
		int count = 0;
		String stri = scan.toLowerCase();
		
		for (int i = 0; i < stri.length(); i++)
		{
			if((stri.charAt(i) == 'a') || (stri.charAt(i) == 'e') || (stri.charAt(i) == 'i') || (stri.charAt(i) == 'o') || (stri.charAt(i) == 'u') )
				count++;			
		}
			System.out.format("A palavra  %s  tem %d caracteres sendo %d vogais\n", scan, scan.length(), count);			
			System.out.format("%.2f porcentagem das vogais em relação ao total de caracteres.", ((float)count / scan.length())*100);
	}

}