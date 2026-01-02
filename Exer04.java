import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		/*Fazer um programa que entra com o numero do funcionario.
		 * numero de horas trabalhadas
		 * valor que receber por horas trabalhadas
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num_funcionario;
		double qtd_horas_trabalhadas, valor_horas_trabalhadas, salario;
		
		System.out.println("Entre com seu ID: ");
		num_funcionario = sc.nextInt();
		
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		qtd_horas_trabalhadas = sc.nextDouble();
				
		System.out.println("Entre com o valor por hora trabalhada: ");
		valor_horas_trabalhadas = sc.nextDouble();
		
		salario = qtd_horas_trabalhadas* valor_horas_trabalhadas;
		
		System.out.println("ID: " + num_funcionario);
		System.out.printf("Salário: R$ %.2f", salario);
		
		
	}

}
