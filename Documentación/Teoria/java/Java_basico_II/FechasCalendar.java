import java.util.Calendar;
public class FechasCalendar {
    public static void main(String[] args) {
        // Calendar es la clase y hay que instanciar un objeto
        // Uso del metodo getInstance() que devuelve fecha y hora
        // Similar a new Date()
        Calendar fecha = Calendar.getInstance();
        System.out.println("Fecha actual: " + fecha.getTime()); // Devuelve la fecha actual en el momento de la ejecución
        System.out.println();
        /* Se puede obtener la fecha en milisegundos.
         * La variable fecha lo que tiene guardado es la cantidad de milisegundos transcurridos
         * desde la hora UNIX hasta el momento actual.
         * HORA UNIX --> 01/01/1970 00:00:00
         * Se guarda en un tipo numérico long.
         */
        System.out.println("Fecha actual en milisegundos: " + fecha.getTimeInMillis());
        System.out.println();

        /* Podemos extraer día, mes, año, hora, minutos, segundos...
         * Se mantienen para que haya compatibilidad entre nuevas versiones de Java y código más antiguo
         * Es mejor usar la API actual --> java.time
         */
        
        // ----------
        //    Día --> devolverá un número entero que es el día del mes o de la semana
        // ----------
        // 1. Calendar.DAY_OF_WEEK --> devuelve entero entre 1 y 7 correspondiendo al día de la semana
        // Empieza a contar desde 1 y el primer día es domingo
        // 1 = domingo, 2 = lunes, 3 = martes...
        System.out.println("Hoy es día: " + fecha.get(Calendar.DAY_OF_WEEK) + " ¿a qué día de la semana corresponde?");
        // 2. Calendar.DAY_OF_MONTH --> devuelve un entero que corresponde al día numérico dentro del mes
        // Entre 1 y 31 || 1 y 30 || 1 y 29 || 1 y 28 según corresponda
        System.out.println("Hoy es día: " + fecha.get(Calendar.DAY_OF_MONTH));
        System.out.println();
        
        // ----------
        //    Mes --> devolverá un número entero que es el número del mes
        // ----------
        // CUIDADO: empieza a contar desde 0, algo confuso ¿no?
        // 0 = enero, 1 = febrero...
        System.out.println("Estamos en el mes: " + fecha.get(Calendar.MONTH));
        // Para evitar confusión hay que adaptar el resultado
        System.out.println("El mes actual corregido (sumando 1): " + (fecha.get(Calendar.MONTH) + 1));
        System.out.println();

        // ----------
        //    Año --> devolverá un número entero que es el año
        // ----------
        // Devuelve el año actual sin tener que hacer ninguna corrección posterior como pasa con java.util.Date
        System.out.println("Estamos en el año: " + fecha.get(Calendar.YEAR));
        System.out.println();

        // -----------
        //    Hora --> devolverá un número entero con la hora del momento actual.
        // -----------
        // 1. OPCION 1: Horas de 1 a 12 formato de 12h
        System.out.println("La hora actual es (HOUR formato 12h): " + fecha.get(Calendar.HOUR));
        // 2. OPCION 2: Horas de 0 a 23 formato de 24h
        System.out.println("La hora actual es (HOUR_OF_DAY formato 24h): " + fecha.get(Calendar.HOUR_OF_DAY));
        System.out.println();

        // -----------
        //    Minuto --> devolverá un número entero con los minutos del momento actual.
        // -----------
        // El resultado va de 0 a 59
        System.out.println("Los minutos actuales son: " + fecha.get(Calendar.MINUTE));
        System.out.println();

        // ---------------
        //    Segundos --> devolverá un número entero con los segundos del momento actual.
        // ---------------
        // El resultado va de 0 a 59
        System.out.println("Los segundos actuales son: " + fecha.get(Calendar.SECOND));
        System.out.println();

        // -------------------
        //    Milisegundos --> devolverá un número entero con los milisegundos del segundo actual.
        // -------------------
        // El resultado va de 0 a 999
        System.out.println("Los milisegundos actuales son: " + fecha.get(Calendar.MILLISECOND));
        System.out.println();

        System.out.println("------------------------------");
        System.out.println("        MODIFICACIONES ");
        System.out.println("------------------------------");
        System.out.println();

        /*
         * Calendar permite modificar las fechas con el método set()
         * El método set() tiene dentro distintos parámetros que servirán para modificar esas partes de la fecha
         * 
         * set(Año, Mes, Dia, Hora, Minuto, Segundo)
         * 
         * No es necesario dar un argumento (valor) a cada uno de los parámetros.
         * Set únicamente modificará aquella parte de la fecha cuyo parámetro tenga valor.
         */
        System.out.println("Recordemos la fecha: " + fecha.getTime());
        // Modificación de fecha:
        fecha.set(Calendar.YEAR, 2023);
        System.out.println("Vamos a modificar el año poniéndolo en 2023: " + fecha.getTime());
        System.out.println();
        
        // Se pueden hacer varias modificaciones al mismo tiempo. Vamos a cambiar:
        // Año = 2025
        // Mes = Abril
        // Dia = 3
        // Hora = 2
        // Minuto = 13
        // Segundos = 33
        // Modificación de fecha:
        fecha.set(2025, Calendar.APRIL, 3, 2, 13, 33);
        // fecha.set(2025, 3, 3, 2, 13, 33); --> El mes se puede poner en número, recuerda que 0=enero, 3=abril
        System.out.println("Cambiamos varios valores a la vez: " + fecha.getTime());
        System.out.println();

        /*
         * ====ADVERTENCIA====
         * Modificar las fechas erróneamente no va a hacer saltar un error.
         * Si a febrero le asignamos el día 30 saltará al mes siguiente.
         * Esto supone un problema porque podemos estar trabajando con fechas incorrectas.
         */

        System.out.println("---------------------------");
        System.out.println("        OPERACIONES ");
        System.out.println("---------------------------");
        System.out.println();

        /* 
         * java.util.Date no permitía operar con fechas, ni añadir ni sustraer días o meses.
         * Esto con java.util.Calendar se empezó a poder hacer, pero de manera del todo intuitiva.
         * 
         * Hay dos métodos para modificar las fechas: add() y roll().
         * 
         * ---add()---
         * Modifica la fecha de tal manera que si rebasa el mes, va a modificar también el mes.
         * Por ejemplo, tenemos fecha 31-01-2025 y queremos añadir 1 día. 
         * Pasaría a 32-01-2025 que no existe, así que salta a día 01, pero no solo estamos modificando
         * día, como ha rebasado la capacidad del mes 01 también modificará el mes pasando a 02.
         * La fecha resultante después de añadir 1 día a 31-01-2025 será 01-02-2025.
         * 
         * ---roll()---
         * Únicamente modifica la parte de la fecha deseada sin alterar el resto.
         * Por ejemplo, tenemos fecha 03-12-2024 y queremos sumar 1 mes.
         * Es el último mes y no existe el mes 13, así que saltará al mes 01.
         * roll() no va a modificar ninguna otra parte de la fecha:
         * la fecha resultante después de añadir 1 mes con roll() será 03-01-2024.
         *
         * *** Mientras que add() hubiera cambiado el año, roll() únicamente ha cambiado el mes.
         */
        
        // Reset de la fecha para volver a tener la fecha actual:
        fecha = Calendar.getInstance();
        System.out.println("METODO ADD");
        System.out.println("Añadiendo un día a la fecha actual: " + fecha.getTime());
        fecha.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Nueva fecha con un día añadido: " + fecha.getTime());
        System.out.println();
        System.out.println("Si le añadimos 5 días saltará de mes (fecha tal como está): " +fecha.getTime());
        fecha.add(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Fecha modificada: " + fecha.getTime());
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("METODO ROLL");
        // Reset de la fecha para volver a tener la fecha actual:
        fecha = Calendar.getInstance();
        System.out.println("Añadiendo 6 días a la fecha actual: " + fecha.getTime());
        fecha.roll(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Nueva fecha con seis días añadidos: " + fecha.getTime());
        System.out.println();
        /*
         * Con la suma de días que hemos hecho tendríamos que pasar a abril, pero lo único
         * que se modifica es el día.
         */


        /* 
         * java.util Calendar --> clase introducida en Java 1.1 (1997).
         * La finalidad era mejorar la anterior clase Date.
         * Date tenía métodos obsoletos, además que no permitía hacer operaciones.
         * Tampoco manejaba correctamente las diferentes zonas horarias.
         * Aunque solucionaba parte de esos problemas, seguía siendo poco intuitivo (meses que empiezan en 0...)
         * En Java 8+ llega el paquete java.time que introduce diferentes clases
         * que permiten trabajar con fechas de una manera mucho más moderna e intuitiva.
         */
        
    }
}

