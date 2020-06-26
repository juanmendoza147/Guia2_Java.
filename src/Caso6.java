import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese sueldo : ");
		int sueldo = sc.nextInt();
		
		float descuento = 0;
		
		if (sueldo >1500)
			descuento = (float) (0.05 * sueldo) ;
		else if (sueldo <3000)
			descuento = (float) (0.02 *sueldo);
		
		System.out.println("Resultado : ");
		System.out.println("Impuesto calculado = "+descuento);
		
		
	}

}
