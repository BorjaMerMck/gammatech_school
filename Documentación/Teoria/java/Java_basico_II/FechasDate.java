
import java.util.Date;
public class FechasDate {
    public static void main(String[] args) {
        // Date es la clase y hay que instanciar un objeto
        Date fecha = new Date();
        System.out.println("Fecha actual: " + fecha); // Devuelve la fecha actual en el momento de la ejecución

        /* Se puede obtener la fecha en milisegundos.
         * La variable fecha lo que tiene guardado es la cantidad de milisegundos transcurridos
         * desde la hora UNIX hasta el momento actual.
         * HORA UNIX --> 01/01/1970 00:00:00
         * Se guarda en un tipo numérico long.
         */
        System.out.println("Fecha actual en milisegundos: " + fecha.getTime());

        /* Podemos extraer día, mes, año, hora, minutos, segundos...
         * No obstante todo ello está deprecado. En el momento de compilar saldrá un warning
         * Se mantienen para que haya compatibilidad entre nuevas versiones de Java y código más antiguo
         * Se debe usar la metodología actual --> java.time
         */
        
        // ----------
        //    Día --> devolverá un número entero que es el día del mes o de la semana
        // ----------
        // 1. getDay() --> devuelve entero entre 0 y 6 correspondiendo al día de la semana
        // Empieza a contar desde 0 y el primer día es domingo
        // 0 = domingo, 1 = lunes, 2 = martes...
        System.out.println("Hoy es día: " + fecha.getDay() + " ¿a qué día de la semana corresponde?");
        // 2. getDate() --> devuelve un entero que corresponde al día numérico dentro del mes
        // Entre 1 y 31 || 1 y 30 || 1 y 29 || 1 y 28 según corresponda
        System.out.println("Hoy es día: " + fecha.getDate());
        
        // ----------
        //    Mes --> devolverá un número entero que es el número del mes
        // ----------
        // CUIDADO: empieza a contar desde 0, algo confuso ¿no?
        // 0 = enero, 1 = febrero...
        System.out.println("Estamos en el mes: " + fecha.getMonth());
        // Para evitar confusión hay que adaptar el resultado
        System.out.println("El mes actual corregido (sumando 1): " + (fecha.getMonth() + 1));

        // ----------
        //    Año --> devolverá un número entero que es el año, pero hay que añadirle 1900
        // ----------
        // Resultado + 1900 = año actual
        // Fue una decisión de los años 90, representar los años como un desplazamiento desde 1900
        // Ejemplo: el año 1965 nos lo mostrará como 65.
        // Ejemplo: el año 2150 nos lo mostrará como 250.
        System.out.println("Estamos en el año: " + fecha.getYear());
        System.out.println("Le añadimos 1900 al año para tener la información correcta: " + (fecha.getYear() + 1900));
        // Por estos problemas ya en Java 1.1 se desaconsejó su uso para pasar a usar java.util.Calendar


        // -----------
        //    Hora --> devolverá un número entero con la hora del momento actual.
        // -----------
        // El resultado va de 0 a 23
        System.out.println("La hora actual es: " + fecha.getHours());

        // -----------
        //    Minuto --> devolverá un número entero con los minutos del momento actual.
        // -----------
        // El resultado va de 0 a 59
        System.out.println("Los minutos actuales son: " + fecha.getMinutes());

        // -----------
        //    Segundos --> devolverá un número entero con los segundos del momento actual.
        // -----------
        // El resultado va de 0 a 59
        System.out.println("Los segundos actuales son: " + fecha.getSeconds());

        /* 
         * La versión Java 1.0 es de 1996. Introdujo clases como String o Random.
         * Pero por los sistemas de ese momento, principalmente, funcionaban en UNIX.
         * Esa fue la orientación que se le dio a Java. 
         * Pronto quedó obsoleto y nació la clase Calendar en Java 1.1 en 1997
         */

    }
}




        