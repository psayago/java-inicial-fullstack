package ar.edu.utn.inicial;
import java.util.Scanner;

import java.util.Scanner;

public class WhileHolaMundo {
	private static Scanner scan2;

	
	

	public static void main(String[] args) {
						
		System.out.print("Ingrese un numero: ");
		Scanner scan = new Scanner(System.in);
		int ingresoUsuario = scan.nextInt();
		
		System.out.print("Ingrese su nombre: ");
		scan2 = new Scanner(System.in);
		String palabra = scan2.nextLine();
		
		int contador=0;		 
		while (ingresoUsuario != 0) {
			System.out.println("Hola " + palabra + " es la iteracion nro: " + (contador+1));
			contador++;
			System.out.print("Ingrese un numero: ");
			ingresoUsuario = scan.nextInt();
		}
		System.out.println("Cantidad de iteraciones : " + contador);
		
	}	
	
}
