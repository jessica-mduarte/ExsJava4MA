/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/

package ex1;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio de um círculo para saber sua área: ");
		float raio = scan.nextFloat();
		
		
		double a = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + a);
		
	}

	

}
