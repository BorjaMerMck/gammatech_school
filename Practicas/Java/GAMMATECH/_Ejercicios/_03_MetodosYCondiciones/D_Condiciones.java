package _03_MetodosYCondiciones;

public class D_Condiciones {

	public static void main(String[] args) {

		ejercicio1(2);			
		ejerciocio2(-23);
		ejercico3(0);
		ejercicio4(2);
		ejercicio5(5);
		ejercicio6(14);
		ejercicio7(23,23);
		ejercicio8(12);
		ejercicio9('w');
	}
	
	private static void ejercicio1(int numero1) {
		System.out.println((numero1 > 0) ? "es positivo" : "es negativo");					
	}
	
	private static void ejerciocio2(int numero1) {
		System.out.println((numero1 < 0) ? "es negativo" : "es positivo");
	}
	
	private static void ejercico3(int numero1) {
		System.out.println((numero1 == 0) ? "es cero": "No es cero");
	}

	private static void ejercicio4(int numero1) {
		System.out.println((numero1 % 2 == 0) ? "es par" : "es impar");
	}
	
	private static void ejercicio5(int numero1) {
		System.out.println((numero1 % 3 != 0) ? "es impar" : "es par");
	}
	
	private static void ejercicio6(int numero1) {
		System.out.println((numero1 >= 18) ? "es mayor de edad" : "Es menor de edad");
	}
	
	private static void ejercicio7(int numero1,int numero2) {
		System.out.println((numero1 == numero2) ? "Es el mismo numero" : "Son numeros diferentes");
	}
	
	private static void ejercicio8(int numero1) {
		System.out.println((numero1 >= 0 && numero1 <= 10) ? "esta en el rango del 0 al 10 ": "no esta en el rango 1 a 10");
	}
	
	private static void ejercicio9(char letra) {
		System.out.println((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') ? "es una vocal" : "no es una vocal");
	}
	
}
