/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.*/

package ex1;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Fahrenheit: ");
		int grausf = scan.nextInt();
		
		int celsius = 5 *((grausf - 32)/9);
		
		System.out.println("A conversão da temperatura para Celsius será: " + celsius);
	}

}
