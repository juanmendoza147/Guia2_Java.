import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese segundo n�mero: ");
		int num2 = sc.nextInt();
		
		String mensaje = "";
		
		if (num1 == num2)
			mensaje = "iguales";
		
		else 
			if (num1 > num2)
				mensaje = "El primer n�mero es mayor";
			else 
				mensaje ="El sugundo n�mero es mayor";
		
		System.out.println("Resultado: "+mensaje);
		
		
		
	}

}
