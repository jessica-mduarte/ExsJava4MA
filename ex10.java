/*Conversão de graus Celsius para Fahrenheit*/

package ex1;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Celsius para converter em Fahrenheit: ");
		int celsius = scan.nextInt();
		
		 int grausf = (celsius * 9/5) + 32;
		
		System.out.println("A conversão de Celsius para Fahrenheit: " + grausf); //
		
	}

}
