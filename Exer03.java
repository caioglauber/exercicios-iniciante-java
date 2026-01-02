import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		/*Fazer um Programa para Ler Quatro valores Inteiros. 
		A seguir, calcule e mostre a diferença do produto de A e B pelo Produto de C e D segundo a fórmula
		dif = (A * B - C * D)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.println("Digite o Valor de A: ");
		a = sc.nextInt();
		
		System.out.println("Digite o Valor de B: ");
		b = sc.nextInt();
		
		System.out.println("Digite o Valor de C: ");
		c = sc.nextInt();
		
		System.out.println("Digite o Valor de d: ");
		d = sc.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("RESULTADO DE (A * B - C * D): " + dif);
		
		sc.close();
		
		
	}

}
