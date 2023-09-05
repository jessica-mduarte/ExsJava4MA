/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez
que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João
deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

package ex1;
import java.util.Scanner;
public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso de peixes: ");
		float peso = scan.nextFloat();
		
		float excesso = peso - 50;
		
		float multa = (float) (excesso * 4.00);
		
		if (peso > 50) {
			
			System.out.println("Quilos excedentes: "+ excesso);
			System.out.println("Multa a pagar: R$"+ multa);
		}
		else {
			
			System.out.println("Não tem multa para pagar");
		}
	}

}
