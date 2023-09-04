/*Faça um programa que peça 4 notas bimestrais e mostre a média*/

package ex1;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		float a = scan.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		float b = scan.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		float c = scan.nextFloat();
	
		System.out.println("Entre com a quarta nota: ");
		float d = scan.nextFloat();
		
		
		System.out.println("A média das notas é " + ((a + b + c + d)/4));
	}

}
