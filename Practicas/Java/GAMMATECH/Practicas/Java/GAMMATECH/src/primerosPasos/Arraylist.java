package primerosPasos;
import java.util.ArrayList;

public class Arraylist {


	    public static void main(String[] args) {

	    	ArrayList<String> lista = new ArrayList<>();

	        lista.add("Manzana");
	        lista.add("platano");
	        lista.add("Pera");

	        System.out.println("Lista completa: " + lista);


	        System.out.println("\nElementos de la lista:");
	        for (String elemento : lista)
	        {
	            System.out.println(elemento);
	        }
	    }
	}