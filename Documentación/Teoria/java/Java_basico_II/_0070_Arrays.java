public class _0070_Arrays {

	public static void main(String[] args) {
		// Un array en java es una estructura de datos que nos permite
		//almacenar una colección de datos de un mismo tipo.

		// Podemos entender un array como tener muchas variables
		// de un mismo declaradas en una estructura.
		
		// Ejemplo, si queremos almacenar 5 números en memoria
		// necesitariamos 5 variables de tipo int
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 5;
		
		//Si quisieramos imprimirlo, tendriamos que ir 1 a 1
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		// Los arrays nos permiten almacenar un número de variables
		//dentro de una misma "variable"
		
		//Podemos declarar un array de la siguiente manera
		int[] arrayNumeros = new int[5];
		/*
		 * Los corchetes [] después del tipo indican que la variable
		 * es un array.
		 * En la asignación le indicamos con la palabra new que genere
		 * el array vacía.
		 * int[5] --> indica que puede albergar 5 valores diferentes.
		 * El número dentro de los corchetes indica la cantidad de
		 * elementos que puede tener.
		 * 
		 * ATENCION: esto no se puede variar.
		 * 
		 * ==================
		 * =   POSICIONES   =
		 * ==================
		 * 
		 * Empiezan a contar desde 0. En el caso anterior tendremos
		 * posiciones que van de 0 a 4.
		 * 
		 * La variable se llama arrayNumeros, pues la primera posición
		 * es arrayNumeros[0]. Así sucesivamente.
		 */
		
		System.out.println("------------ Arrays -----------------");
		
		// Los arrays enteros por defecto se inicializan todas las posiciones
		// a 0.
		arrayNumeros[0] = 1;
		arrayNumeros[1] = 2;
		arrayNumeros[2] = 3;
		arrayNumeros[3] = 4;
		arrayNumeros[4] = 5;
		
		//Para acceder a una posición del array se hace de la misma manera
		System.out.println(arrayNumeros[0]);//Esta seria la primera posición del array
		System.out.println(arrayNumeros[1]);//Esta sería la segunda posición del array
		System.out.println(arrayNumeros[2]);//Esta sería la tercera posición del array
		System.out.println(arrayNumeros[3]);//Esta sería la cuarta posición del array
		System.out.println(arrayNumeros[4]);//Esta sería la quinta posición del array
											//o la última posición del array
		
		//Ojo, si accedéis o modificais una posición que no existe, da error
		//en tiempo de ejecución, concretamente ArrayIndexOutOfBoundsException
		//arrayNumeros[5] = 6;//No da error en tiempo de compilación, pero si en ejecución
		
		//Una vez creado el array, NO se puede modificar el tamaño. Es por esto que este
		//tipo de array en java se conoce como "array estatico"
		
		//Podemos conocer la longitud de un array gracias a la propiedad "length"
		System.out.println("El tamaño del array es: " + arrayNumeros.length);//5
		
		//Gracias a que un array es una colección de variables se puede recorrer
		//con bucles
		
		//Ejemplo, guardar los primeros 1000 numeros en variables
		int[] arrayMilNumeros = new int[100];
		//arrayMilNumeros[0] = 1;
		//arrayMilNumeros[1] = 2;
		//arrayMilNumeros[2] = 3;
		//Esto es inviable....
		//Hay que usar bucles
		/*
		for(int i = 0; i < 100; i++) {//i <= 99;
			arrayMilNumeros[i] = i + 1;
			System.out.println("Vuelta número: " + (i + 1));
			System.out.println("Asignación a la posición " + i + " del array de 1000 números: " + arrayMilNumeros[i]);
		}
		*/
		//Iteración 1
		//i = 0;
		//arrayMilnumeros[0] = 1
		//Iteración 2
		//i = 1;
		//arrayMilnumeros[1] = 2
		//Iteración 3
		//i = 2;
		//arrayMilnumeros[2] = 3
		//Iteración 4
		//i = 3;
		//arrayMilnumeros[3] = 4
		//....
		/*
		System.out.println("Ahora imprimimos el bucle");
		for(int i = 0; i < 100; i++) {
			System.out.println(arrayMilNumeros[i]);
		}
		*/
		/*
		a) te imprime los numeros del 1 al 1000
		b) te imprime los numeros del 0 al 1000
		c) te imprime los numeros del 0 al 999
		d) error en tiempo de complacion
		e) error en tiempo de ejecución
		*/
		
		//Normalmente para recorrer un array se usa como condición de parada
		//la propiedad "length"
		System.out.println("==================*********=================");
		System.out.println("El arrayMilNumeros tiene una longitud de: " + arrayMilNumeros.length);
		/* 
		for(int i = 0; i < arrayMilNumeros.length; i++) {
			System.out.println(arrayMilNumeros[i]);
		}
		*/
		
		//Se pueden hacer arrays de cualquier tipo de dato
		double[] arrayDoubles = new double[5];
		arrayDoubles[0] = 34.56;
		
		boolean[] arrayBooleans = new boolean[3];
		arrayBooleans[2] = false;
		//arrayBooleans[3] = true;//Error en tiempo de ejecución
		
		//Podemos declarar arrays e inicializarlos al mismo tiempo
		char[] arrayCaracteres = {'F','e','l','i','x'};
		//El tamaño de este array es 5
		//El numero de posiciones de este array es 5
		//La primera posición del array tiene de valor: F
		//La última posición del array tiene de valor: x
		//La posición 5 del array tiene de valor: NO EXISTE
		//La posición 4 del array tiene de valor: x
		//La posición 3 del array tiene de valor: i
		
		int[] arrayNumerico2 = {2,4,5,6,7,8};
		//El tamaño de este array es 6
		//El numero de posiciones de este array es 6
		//La primera posición del array tiene de valor: 2
		//La última posición del array tiene de valor: 8
		//La posición 5 del array tiene de valor: 8
		//La posición 6 del array tiene de valor: NO EXISTE
		//La posición 4 del array tiene de valor: 7
		//La posición tercera del array tiene de valor: 5
		//La posición quinta del array tiene de valor: 7
		//La posición septima del array tiene de valor: NO EXISTE
	}

}