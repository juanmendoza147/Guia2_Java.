import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese edad :");
		int edad = sc.nextInt();
		
		if (edad >=8)
			System.out.println("Mayor de edad ");
		
		else 
			System.out.println("Menor de edad");
		
	}

}
