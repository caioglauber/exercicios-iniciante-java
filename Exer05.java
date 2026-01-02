import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		//calcular a area das figuras com os valores passados.
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		double area_triangulo, area_trapezio, area_quadrado, area_circulo, area_retangulo;
		
		System.out.println("Entre com um Valor para A: ");
		a = sc.nextDouble();
		
		System.out.println("Entre com um Valor para B: ");
		b = sc.nextDouble();
				
		System.out.println("Entre com um Valor para C: ");
		c = sc.nextDouble();
		
		area_triangulo = (a*c)/ 2;
		area_circulo = 3.14159*(Math.pow(c, 2));
		area_trapezio = ((a + b) * c) / 2;
		area_quadrado = b*b;
		area_retangulo = a * b;
		
		System.out.printf("AREA TRIAGULO: %.3f\n", area_triangulo);
		System.out.printf("AREA CIRCULO: %.3f\n", area_circulo);
		System.out.printf("AREA TRAPEZIO: %.3f\n", area_trapezio);
		System.out.printf("AREA QUADRADO: %.3f\n", area_quadrado);
		System.out.printf("AREA RETANGULO: %.3f", area_retangulo);
		
		sc.close();
	}

}
