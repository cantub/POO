package iftm.poo.aula14;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor1[] = new int[3], vetor2[] = new int[3];
		int n1 = 0;
		int n2 = 0;

		for (int i = 0; i < 3; i++) {
			System.out.format("Digite o numero da posição [%d] do vetor 1: ", i);
			vetor1[i] = sc.nextInt();
			n1 += vetor1[i];
			
			System.out.format("Digite o numero da posição [%d] do vetor 2: \n", i);
			vetor2[i] = sc.nextInt();
			n2 += vetor2[i];
			System.out.println();
		}
		sc.close();
		
		System.out.println("1º vetor:");
		for (int i = 0; i < 3; i++)
			System.out.format("[%d]", vetor1[i]);
		
		System.out.format("\n");
		System.out.println("\n2º vetor:");
		for (int i = 0; i < 3; i++)
			System.out.format("[%d]", vetor2[i]);
		
		System.out.format("\n");
		System.out.format("\n A media do vetor 1: %.2f", (float) n1 / 3);
		System.out.format("\n A media do vetor 2: %.2f", (float) n2 / 3);
		System.out.format("\n A soma das médias e a média das médias. %.2f", (((float) n1 / 3) + (float) n2 / 3) / 2);

	}

}