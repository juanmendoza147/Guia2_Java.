import java.util.Scanner;
public class Caso11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese N�mero [1-7] :");
	int num_dia = sc.nextInt();
	
	String nombre_dia = "";
	
	switch (num_dia ) {
	case 1 :
		nombre_dia = "domingo";
		break;
	case 2 :
		nombre_dia = "lunes";
		break;
	case 3 :
		nombre_dia = "martes";
		break;
	case 4 :
		nombre_dia = "Miercoles";
		break;
	case 5 :
		nombre_dia = "Jueves";
		break;
	case 6 :
		nombre_dia = "Viernes";
		break;
	case 7 :
		nombre_dia = "Sabado";
		break;
	default :
		nombre_dia = "desconocido";
		
	}
	System.out.println("Nombre del d�a : "+nombre_dia);

	}

}
