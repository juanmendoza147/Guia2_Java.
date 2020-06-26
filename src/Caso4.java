import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo número: ");
		int num2 = sc.nextInt();
		
		String mensaje = "";
		
		if (num1 == num2)
			mensaje = "iguales";
		
		else 
			if (num1 < num2)
				mensaje = "El primer número es menor";
			else 
				mensaje ="El sugundo número es menor";
		
		System.out.println("Resultado: "+mensaje);
		
		
		
	}

}
