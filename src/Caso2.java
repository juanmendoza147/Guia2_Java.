import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número :");
		int num = sc.nextInt();
		
		String mensaje ="";
		
		if (num % 2 == 0 )
			mensaje ="Número par";
		else
			mensaje = "Número impar";
		
		System.out.println("Respuesta :"+mensaje);
	}

}
