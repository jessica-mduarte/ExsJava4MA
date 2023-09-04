/*Faça um programa que leia o número inteiro e verifique se é divisível  por 5 e por 3 ao mesmo tempo.*/
		

package ex1;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		
		if (numero % 5 == 0 && numero % 3 == 0) {
			
			System.out.println("Esse número é divisível por 5 e 3.");
		}
		
		else {
			System.out.println("Esse número não é divisível por 5 e 3.");
		}
			
	}

}
