import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese precio :");
		float precio = sc.nextFloat();
		
		System.out.println("Ingrese cantidad :");
		int cantidad = sc.nextInt();
		
		float descuento = 0;
		float parcial = precio * cantidad;
		
		if (cantidad > 8)
			descuento = (float) (0.1 * parcial);
		
		float total = parcial - descuento;
		
		System.out.println("Resultado .....");
		System.out.println("total = "+total);
		System.out.println("Descuento ="+descuento);
		System.out.println("Neto = "+parcial);
		
	}

}
