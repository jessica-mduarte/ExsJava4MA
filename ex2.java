/*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]*/

package ex1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		float numero = scan.nextFloat();
		
		System.out.println("O número informado foi " + numero);
	
		
	}

}
