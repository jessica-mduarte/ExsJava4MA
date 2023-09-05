/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere
que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou
em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores
para cima, isto é, considere latas cheias.*/
package ex1;
import java.util.Scanner;
public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
		float tam = scan.nextFloat();
		
		float lit = tam / 6;
		int lata = (int) (l/18);
		int gal = (int) (l/3.6);
		int misLa = (int) (l/18);
		int misGal = (int) ((l - (misLa*18))/3.6);
		
		if (lata % 18 != 0) {
			
			lata += 1;	
		}
		
		if (gal % 3.6 != 0){
			gal += 1;
		}
		
		if (l-(misLa * 18) % 3.6 != 0){
			misGal += 1;
		}
		float preco = lata*80;
		float preco2 = gal * 25;
		System.out.println("Apenas latas de 18 litros: "+ lata + " Preço: " + preco);
		System.out.println("Apenas galões de 3,6 litros: "+ gal + " Preço: "+ preco2);
		System.out.println("Mistura: "+ lata +" e " + gal + " = ");
		System.out.println((misLa*80)+(misGal*25));
	}

}
