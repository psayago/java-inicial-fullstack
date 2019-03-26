package ar.edu.utn.inicial;

public class TestSwitchCase {

	public static void main(String[] args) {
		// Prueba de Switch
		char color='M';
	    switch (color) {
	    case 'R': 
	    	System.out.println("Color ROJO");
	    	break;	    
	    case 'B': 
	    	System.out.println("Color AZUL");
	    	break;
	    case 'Y': 
	    	System.out.println("Color AMARILLO");
	    	break;
	    default:
	    	System.out.println("No reconozco el color");
	    	break;
	    }
	    
	}

}
