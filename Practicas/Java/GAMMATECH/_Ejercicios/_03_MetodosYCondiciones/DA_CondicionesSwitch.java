package _03_MetodosYCondiciones;

public class DA_CondicionesSwitch {
	
	public static void scanner() {
		
	}
	
    // 1. Indica numéricamente (del 1 al 7) el día de la semana
    // según el número que sea que muestre por pantalla 
    // el día de la semana en palabras (Lunes, Martes, Miércoles...)
    public static void ejercicio1() {

    	Scanner sc = new Scanner(System.in);
    	switch (numero) {
		// Podemos tener de 1 a N "case", que serán cada uno de los valores
		// que puede tomar la variable del "switch". 
		case 0:
			System.out.println("El numero es 0");
			break; // Esta palabra reservada hace que dejemos de ejecutar la
				   // sentancia "switch" y no entre por otros "case" o por
				   // el default
		case 1:
			System.out.println("El número es 1, no es 0");
			break;
		case 2:
			System.out.println("El número es 2, no es ni 0 ni 1");
			break;
		default: // Si no cumple ninguno de los casos anteriores, entaría
				 // por la sentencia "default"
			System.out.println("El número no es ni 0, ni 1, ni 2");
			// break; // No lo necesita porque es la ultima parte
	} // aquí cierra switch
	
    	
    }

    // 2. Calificación con letra
    // A = Excelente, B = Notable, C = Aprobado, D = Insuficiente
    public static void ejercicio2() {
        
    }

    // 3. Menú de opciones: genera un menú para iniciar un juego
    // que tenga varias opciones:
    // 1 -> Seleccionaste Nueva partida
    // 2 -> Seleccionaste Cargar partida
    // 3 -> Seleccionaste Salir
    // Opción inválida

    public static void ejercicio3() {
     
    }

    // 4. Estación del año: verifica en qué estación estás
    // declara una variable que contenga el nombre de la estación
    // verifica el nombre de la estación y cuando se dé el caso correcto
    // que muestre por pantalla: "Estás en [estacion]" 
    // [estacion] --> hace referencia al valor de la variable que 
    //                contiene el nombre de la estación
    public static void ejercicio4() {
        
    }

    // 5. Tipo de figura geométrica
    // 3 -> triángulo
    // 4 -> cuadrado o rectángulo
    // 5 -> pentágono
    // 6 -> hexágono
    public static void ejercicio5() {
        
    }

    // 6. Tipo de moneda
    // USD -> Dolar
    // EUR -> Euro
    // GBP -> Libra
    // JPY -> Yen
    public static void ejercicio6() {
        
    }

    // 7. Número de mes: verifica el mes según su número (del 1 al 12)
    // Enero, Febrero...
    public static void ejercicio7() {
        
    }

    // 8. Clasificación por edad y periodo escolar
    // de 3 a 5 años: Infantil
    // de 6 a 11 años: Primaria
    // de 12 a 15 años: ESO
    // de 16 a 17 años: Bachillerato
    // de 18 a 21 años: Universidad
    // de 22 en adelante: Persona formada
    public static void ejercicio8() {
        
    }

    // 9. Letra del DNI para un número fijo
    // Para calcular la letra se divide el número del DNI
    // entre 23 y el resto indica la letra, según la tabla
    // que encontraréis en este link:
    // https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/#:~:text=Por%20ejemplo%2C%20si%20el%20n%C3%BAmero,n%C3%BAmeros%20y%20d%C3%ADgito%20de%20control.
    public static void ejercicio9() {

        
    }

    // 10. Estado de un semáforo
    public static void ejercicio10() {
        
    }

    // Método main para ejecutar todos los ejercicios
    public static void main(String[] args) {
        //ejercicio1(); 
        //ejercicio2(); 
        //ejercicio3(); 
        //ejercicio4(); 
        //ejercicio5();
        //ejercicio6(); 
        //ejercicio7(); 
        //ejercicio8(); 
        //ejercicio9(); 
        //ejercicio10();
        String cadena1 = "Hola";
        String cadena2 = "Adiós";
        boolean sonIguales = cadena1.equals(cadena2);
        System.out.println("La cadena: " + cadena1
        + "\nLa cadena: " + cadena2
        + "\nSon iguales: " + sonIguales);
    }
}  