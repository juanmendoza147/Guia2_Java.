import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar nombre :");
		String empleado = sc.nextLine();
		
		System.out.println("Ingrese nivel :");
		int nivel = sc.nextInt();
		
		System.out.println("Ingrese su sueldo :");
		float sueldo = sc.nextFloat();
		
		float incremento = 0 , nuevo_sueldo = 0;
		
		switch (nivel) {
		case 1 : 
			incremento =  (float) 0.045;
			break;
		case 2 :
			incremento = (float) 0.06;
			break;
		case 3 : 
			incremento =  (float) 0.085;
			break;
		case 4 :
			incremento = (float) 0.11;
			break;
		default :
			incremento = 0;
		
		}
	
		nuevo_sueldo = sueldo + sueldo * incremento ;
				
		System.out.println("Resultado :");
		System.out.println("Incremento = "+incremento+"%");
		System.out.println("Nuevo sueldo = "+nuevo_sueldo);
	}

}
