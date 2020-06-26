import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numbre del alumno :");
		String nombre = sc.next();
		
		System.out.println("Nota1 :");
		int nota1 = sc.nextInt();
		
		System.out.println("Nota2 :");
		int nota2 = sc.nextInt();
		
		System.out.println("Asistenci [0-12]");
		int asistencias = sc.nextInt();
		
		String estado = "";
		float promedio = (float) (nota1 * 0.3 + nota2 * 0.7);
		float porcentaje = asistencias * 100 / 12;
		
		if (promedio >=13 && porcentaje >=70)
			estado = " Aprobado";
		else 
			estado = "Desaprobado";
			
		System.out.println("Resultado.......");
		System.out.println("Alumno : "+nombre);
		System.out.println("Promedio :"+promedio);
		System.out.println("Asistencia : "+asistencias);
		System.out.println("Estado :"+estado);
		
			
	}

}
