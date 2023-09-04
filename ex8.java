/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/

package ex1;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quanto ganha por hora: ");
		float salh = scan.nextFloat();
		
		System.out.println("Digite quantas horas trabalha no mês: ");
		float horas = scan.nextFloat();
		
		float sal = salh * horas;
		
		System.out.println("Você ganha por mês: R$" + sal); 
		
	}

}
