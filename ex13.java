/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes
fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*h) - 44.7*/

package ex1;
import java.io.IOException;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo(feminino ou masculino): ");
		char s = (char)System.in.read();
		
		if ((s == 'F')||(s == 'f')){
			System.out.println("Digite sua altura: ");
			float h = scan.nextFloat(); 
			float imc = (float) ((62.1*h) - 44.7);
			System.out.println("Seu peso ideal é: "+ imc);
		}
		else if ((s == 'M') ||(s == 'm')){
			System.out.println("Digite sua altura: ");
			float h = scan.nextFloat(); 
			float imc = (float) ((72.7*h) - 58);
			System.out.println("Seu peso ideal é: "+ imc);
		}
	}

}
