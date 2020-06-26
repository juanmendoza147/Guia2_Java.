import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Operacion del [1 - 6] :");
		int nivel = sc.nextInt();
		
		int suma = 0 , resta = 0 , multi = 0,divicion = 0, resto_total = 0, promedio =0;
		
		switch (nivel) {
		case 1 :
			suma = (int) (num1 + num2);
			System.out.println("Resultados.....:");
			System.out.println("Número = "+num1);
			System.out.println("Número = "+num2);
			System.out.println("Operacion : Suma");
			System.out.println("Resultado = "+suma);
	
			break;
		case 2 :
			resta = (int) (num1 - num2);
			System.out.println("Resultados.....:");
			System.out.println("Número = "+num1);
			System.out.println("Número = "+num2);
			System.out.println("Operacion : resta");
			System.out.println("Resultado = "+resta);
			break;
		case 3 :
			multi = (int)(num1 * num2);
			System.out.println("Resultados.....:");
			System.out.println("Número = "+num1);
			System.out.println("Número = "+num2);
			System.out.println("Operacion : Producto");
			System.out.println("Resultado = "+multi);
			break;
		case 4 :
			divicion = num1 % num2;
			System.out.println("Resultados.....:");
			System.out.println("Número = "+num1);
			System.out.println("Número = "+num2);
			System.out.println("Operacion : divicion");
			System.out.println("Resultado = "+divicion);
			break;
		case 5 :
			promedio = (num1 + num2)/2;
			System.out.println("Resultados.....:");
			System.out.println("Número = "+num1);
			System.out.println("Número = "+num2);
			System.out.println("Operacion : promedio");
			System.out.println("Resultado = "+promedio);
			break;
		case 6 :
			resto_total = num1 ^ num2;
			System.out.println("Resultados.....:");
			System.out.println("Número = "+num1);
			System.out.println("Número = "+num2);
			System.out.println("Operacion : resto entero");
			System.out.println("Resultado = "+resto_total);
		default:
			System.out.println("ERROR");
			
		}

	}

}
