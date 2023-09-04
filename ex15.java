/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:*/

package ex1;
import java.util.Scanner;
public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor das horas: ");
		double valorh = Double.parseDouble(scan.nextLine());
		
		System.out.println("Entre com o número de horas trabalhadas por mês:");
		int horastrab = Integer.parseInt(scan.nextLine());
		
		double salbruto = valorh * horastrab;
		
		/*desconto INSS*/
		double inss = (8.0 / 100.0) * salbruto;
		
		/*desconto sindicato*/
		double sind = (5.0 / 100.0) * salbruto;
		
		/*desconto IR*/ 
		double ir = (11.0 / 100.0) * salbruto;
		
		/*cálculo salário líquido*/
		double salliq = salbruto - (inss + sind + ir);
		
		System.out.println("O salário líquido será de: R$" + salliq);
		
		System.out.println("O desconto do INSS será: R$" + inss);
		System.out.println("O desconto do sindicato será: R$" + sind); 
		System.out.println("O desconto do IR será: R$" + ir);
		System.out.println("Os descontos totalizarão R$" + (inss + sind + ir)); 
		System.out.println("O salário bruto no total será R$" + salbruto);
	}

}
