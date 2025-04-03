public class Ejemplos {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        
        // condiciones
        if (a < b) {
            System.out.println("A ES MENOR");
        } else if (a == b) {
            System.out.println("SON IGUALES");
            int c = 10;
            int suma = a + b + c;
            System.out.println(suma);
        } else {
            System.out.println("A ES MAYOR");
        }

        // otras condiciones
        if (esPar(a)) {
            System.out.println("El número " + a + " es par");
            if (a < b) {
                System.out.println("A ES MENOR");
            } else if (a == b) {
                System.out.println("SON IGUALES");
            } else {
                System.out.println("A ES MAYOR");
            }
        } else {
            System.out.println("Como que A no es par, no hago nada");
        }

        System.out.println("he mirado todas las condiciones");
        suma += 5; // suma aquí no existe porque solo existe dentro del bloque condicional
        System.out.println(suma);
    }

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}