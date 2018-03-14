package iftm.poo.aula14;
import java.util.Scanner;


public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int min = 0;
		int max = 0;
			
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
				
			if(idade < 21) {
					min++;
			}else if(idade > 50){
					max++;
			}else if(idade == 0){
					break;
			}
		}
			
		System.out.printf("%d Pessoas tem menos de 21.\n", min);
		System.out.printf("%d Pessoas tem mais de 50.\n", max);
		sc.close();
	}
}