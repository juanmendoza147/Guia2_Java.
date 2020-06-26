import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa nota : ");
		int nota = sc.nextInt();
		
		String muestre = "";
		
		if (nota <= 7)
			muestre = "sin palabras";
		else
			if (nota <= 10)
				muestre = "malo";
			else 
				if (nota <= 14)
					muestre = "regular";
				else 
					if (nota <=17)
						muestre = "notable";
					else
						if (nota <=20 )
							muestre = "Excelente";
		
		System.out.println("NOTA : "+muestre);
	}

}
