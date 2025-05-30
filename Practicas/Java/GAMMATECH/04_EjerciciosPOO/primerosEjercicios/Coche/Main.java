package Coche;

public class Main {
	
	
	public static void main(String[] args) {
		
		Coche c1 = new Coche(4,4,4,0,false,true,false);
		
		
		c1.estados();
	}

}
/*
 * =================
 * =   ENUNCIADO   =
 * =================
 * 
 * Crea una clase Coche. Indica características como cantidad de ventanas,
 * cantidad de puertas, cantidad de ruedas, velocidad, si está circulando o no,
 * si está frenado o no, si está en marcha o no.
 * 
 * Piensa cómo hacer el constructor del vehículo.
 * 
 * Necesitarás hacer varios métodos y pensar qué atributos son valores numéricos
 * y los que no.
 * 
 * Haz un método acelerar que incremente la velocidad del coche en 5km/h
 * Haz un método decelerar que disminuya la velocidad del coche en 5km/h
 * Haz un método arrancar para que se ponga en marca el vehículo.
 * 
 * En el método main, hecho en una clase a parte, tienes que probar con que el coche
 * acelere, decelere, arranque y frene.
 * 
 * Atención: si el coche no está en marcha no va a poder acelerar ni decelerar.
 */

