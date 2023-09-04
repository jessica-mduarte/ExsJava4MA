/*Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.*/

package ex1;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado do quadrado: ");
		float lado = scan.nextFloat();
		
		double a = Math.pow(lado, 2);
		
		double c = a*2;
		
		System.out.println("O dobro da área é: " + c);
	
	}

}
