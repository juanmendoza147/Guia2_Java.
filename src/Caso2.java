import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n�mero :");
		int num = sc.nextInt();
		
		String mensaje ="";
		
		if (num % 2 == 0 )
			mensaje ="N�mero par";
		else
			mensaje = "N�mero impar";
		
		System.out.println("Respuesta :"+mensaje);
	}

}
