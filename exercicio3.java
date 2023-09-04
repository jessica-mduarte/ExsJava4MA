/*Faça um programa que imprima que peça 2 números  e imprima a soma*/



package ex1;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int a = scan.nextInt();
		
		System.out.println("DIgite o segundo número: ");
		int b = scan.nextInt();
		
		System.out.println("A soma dos dois números será: " + (a + b));
		
		
	}

}
