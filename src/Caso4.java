import java.util.Scanner;

public class Caso4 {

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
			if (num1 < num2)
				mensaje = "El primer n�mero es menor";
			else 
				mensaje ="El sugundo n�mero es menor";
		
		System.out.println("Resultado: "+mensaje);
		
		
		
	}

}
