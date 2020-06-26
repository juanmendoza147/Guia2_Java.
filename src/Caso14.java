import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float descuento = 0 , total_pagar =0;
		int monto =0;
		
		System.out.println("Ingrese nombre del alumno:  ");
		String nom = sc.nextLine();
		
		System.out.println("Ingrese Carrera [DS -RC - DG] : ");
		String carrera = sc.nextLine();
		
		System.out.println("Turno [M - T - N]");
		String turno = sc.nextLine();
		
		String mensaje="";
		
		switch (carrera) {
		case "DS":
			monto=1500;
			if (turno.equals("M")) {
				descuento= monto*0.1f;
				mensaje="Mañana";
			}
			else if(turno.equals("T")) {
				descuento= monto*0.2f;
				mensaje="Tarde";
			}
			else if(turno.equals("N")){
				descuento= monto*0.15f;
				mensaje="Noche";
			}
			else {
				descuento=0;
				mensaje="Opcion incorrecta";
			}
			break;
		case "RC":
			monto=1400;
			if (turno.equals("M")) {
				descuento= monto*0.1f;
				mensaje="Mañana";
			}
			else if(turno.equals("T")) {
				descuento= monto*0.2f;
				mensaje="Tarde";
			}
			else if(turno.equals("N")) {
				descuento= monto*0.15f;
				mensaje="Noche";
			}
			else {
				descuento=0;
				mensaje="Opcion incorrecta";
			}
			break;
		case "DG":
			monto=1300;
			if (turno.equals("M")) {
				descuento= monto*0.1f;
				mensaje="Mañana";
			}
			else if(turno.equals("T")) {
				descuento= monto*0.2f;
				mensaje="Tarde";
			}
			else if(turno.equals("N")) {
				descuento= monto*0.15f;
				mensaje="Noche";
			}
			else {
				descuento=0;
				mensaje="Opcion incorrecta";
			}
			break;
		default:
			monto=0;
			mensaje="Opcion incorrecta";
		
		
		}
		
		total_pagar=monto-descuento;
		
		System.out.println("RESULTADOS");
		System.out.println("===========");
		System.out.println("Nombre del alumno : "+nom);
		System.out.println("Monto de la Carrera : "+monto);
		System.out.println("Nombre de Turno : "+mensaje);
		System.out.println("Descuento : "+descuento);
		System.out.println("Total a pagar : "+total_pagar);
		System.out.println("Toatl a pagar en $Dolares : "+total_pagar/3.33);

	}


	}
