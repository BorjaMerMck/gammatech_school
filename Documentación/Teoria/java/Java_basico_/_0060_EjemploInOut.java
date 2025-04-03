// import de la clase Scanner
import java.util.Scanner;
// class creada para el ejemplo
public class _0060_EjemploInOut {
    // método main
    public static void main(String[] args) {
        // Creación del objeto en una variable
        Scanner sc = new Scanner(System.in);

        // Output: mensaje que aparecerá en consola
        System.out.println("Introduce un número entero mayor que 5:");
        // Input: guardado en una variable para poderlo usar posteriormente
        int numero = sc.nextInt(); // el usuario escribe y presiona ENTER

        // Comprobación del número introducido
        if (numero <= 5) { // Si está mal lanzará un error
            System.err.println("Has introducido: " + numero + ". Número incorrecto.");
        } else {
            System.out.println("Número introducido: " + numero);
        }
    }
}