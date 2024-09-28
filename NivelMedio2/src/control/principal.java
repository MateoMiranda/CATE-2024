package control;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
import java.text.*;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int opc = 0;
		int horas = 0;
		
		do{
			opc = mostrarElegirOpcionMenu(s);
			ejecutarAccion(opc, horas, s);
			} while(opc != 2);
			 

			s.close();

			}

			public static int mostrarElegirOpcionMenu(Scanner s) {
			int opc = 0;
			System.out.println("1. Deseo Calcular Salario");
			System.out.println("2. Ya no deseo Calcular el Salario");

			opc = ingresarEntero(s,1,2); 

			return opc;

			}
			
			public static int ingresarEntero(Scanner s, int min, int max) {
				int n = 0;
				boolean error;

				do {
				error = false;
				try {
				n = s.nextInt();
				if(n < min || n > max) {
				error = true;
				System.out.println("Error. El numero debe estar entre " + min + " y " + max);
				}

				} catch(InputMismatchException err) {

				System.out.println("Error. Tipo de dato mal ingresado");
				System.out.println("Vuelva a ingresar");
				error = true;
				s.nextLine();

				}

				}while(error);

				return n;
				}
			
			public static void ejecutarAccion(int opc, int horas, Scanner s) {
				if(opc == 1){
				System.out.println("Ingrese La Cantidad de Horas");	
				horas = s.nextInt();
				
				if(horas>84) {
				System.out.println("La Cantidad de Horas NO Puede Ser Mayor que 84");
				} else if(horas<=35) {
				int sueldo=horas*180;
				System.out.println("Su Sueldo es de " + sueldo + " Pesos");
				} else if(horas>35){
					int diferencia=horas-35;
					int sueldo=35*180+diferencia*240;
				System.out.println("Su Sueldo es de " + sueldo + " Pesos");
				}
				
				} 
				
			}
}
