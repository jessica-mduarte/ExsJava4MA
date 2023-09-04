/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
 *  usando a seguinte fórmula:
(72.7*altura) - 58*/

package ex1;
import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();
        
        double imc = (72.7 * altura) - 58;
        
        System.out.println("Seu peso ideal é: ");
        System.out.println(imc); 
	}

}
