/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere
que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/
package ex1;
import java.util.Scanner;
public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
		float tam = scan.nextFloat();
		
		float lit = t / 3;
		
		if (tam % 18 != 0) {
			int lata = (int) (l/18);
			la += 1;
			float preco = lata*80;
			System.out.println("Latas a comprar: "+lata);
			System.out.println("Preço das latas: "+preco);
		}

	}

}
