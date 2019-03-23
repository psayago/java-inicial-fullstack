package ar.edu.utn.inicial;

public class CondicionanteIf {
	
	public static void main(String[] args) {
		// Prueba git en casa
		System.out.println("Hola mundo!!");
		int valor = -1;
		//comentario
		if(valor < 0) {
			System.out.println("Valor es negativo");			
		} else if (valor>0) {
			System.out.println("Valor es positivo");
		}
		else System.out.println("Valor es cero");
		System.out.println("El valor es: " + valor + " <= ese es su valor");
	}	
	
}
