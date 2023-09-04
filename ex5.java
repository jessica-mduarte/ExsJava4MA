/*Faça um Programa que converta metros para centímetros.*/

package ex1;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os números em metros que deseja converter para centímetros: ");
		float metros = scan.nextFloat();
		
		float conversao = metros/100;
		
		System.out.println("A conversão será: " + conversao + " centímetros");
		
		
		
	}

}
