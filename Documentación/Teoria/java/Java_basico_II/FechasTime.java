/*
 * ============
 * =   TIME   =
 * ============
 * 
 * El paquete time aparece con Java 8 y mejora las clases Date y Calendar.
 * 
 * Dentro del paquete time tenemos diferentes clases para gestionar el tiempo y las fechas.
 * 
 * ====ENLACE====
 * https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
 * 
 * Voy a ejemplificar qué se puede hacer con las fechas para que os ayude a comprender su funcionamiento.
 * Principalmente voy a mostraros las diferentes clases de fecha que hay (Date, Time, DateTime, ZonedDateTime)
 * Cómo se pueden modificar las fechas y operar con ellas.
 * Cómo se les puede dar formato.
 * Comprobar lapsos de tiempo con Duration y Period.
 * 
 * Se pueden hacer muchísimas más cosas y es importante que invirtáis tiempo para jugar y explorar
 * los distintos métodos y cómo funcionan.
 * 
 * ===============
 * =   METODOS   =
 * ===============
 * 
 * .of...() --> para instanciar explícitamente con los valores deseados
 * .parse() --> para "traducir" fecha u hora que es una String que es una fecha a una clase de fecha
 * .get...() --> extraer partes de la fecha, hora, zona...
 * .is...() --> para comprobaciones
 * .with...() --> genera un objeto nuevo de fecha con un valor específico, como crear una copia con un cambio
 * .plus...() --> añadir tiempo, sumar
 * .minus...() --> quitar tiempo, restar
 * .to...() --> convertir fecha de una clase a otra
 * .at...() --> combinar diferentes objetos de tiempo para tener uno más completo
 */

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter; // fecha local

public class FechasTime {
    public static void main(String[] args) {

        /*
         * ===============
         * =   FORMATO   =
         * ===============
         * Voy a dejar varios formatos preparados.
         * En cada caso habrá un ejemplo de cómo puede entrar una String y "traducirla" con un formato concreto.
         * 
         * |                               TABLA DE PATRONES MAS USADOS                               |
         * |--------|-------------------------|---------------------|---------------------------------|
         * |SIMBOLO | SIGNIFICADO             | EJEMPLO DE SALIDA	| COMENTARIO                      |
         * |--------|-------------------------|---------------------|---------------------------------|
         * | y	    | Año	                  | 2025, 25	        | yy (2 dígitos), yyyy (4 dígitos)|
         * | M (m)  | Mes	                  | 3, 03, Mar, March	| M, MM, MMM, MMMM                |
         * | d	    | Día del mes	          | 5, 05, 25	        | d (1–31)                        |
         * | E (m)  | Día de la semana	      | Mon, Monday	        | E, EEE, EEEE                    |
         * | H (m)  | Hora (0–23)	          | 0 a 23	            | 24h formato                     |
         * | h	    | Hora (1–12)	          | 1 a 12	            | 12h formato con AM/PM           |
         * | m	    | Minutos	              | 0 a 59	            |                                 |
         * | s	    | Segundos	              | 0 a 59              |                                 | 	
         * | S (m)  | Milisegundos	          | 987	                | hasta 3 dígitos                 |
         * | a	    | AM/PM	                  | AM, PM	            |                                 |
         * | z	    | Zona horaria	          | CET, PST, etc.	    | abreviatura de zona horaria     |
         * | Z (m)	| Offset de zona horaria  | +0100, -0500	    | offset sin :                    |
         * | XXX	| Offset con dos puntos	  | +01:00, -05:00	    | estilo ISO                      |
         * |--------|-------------------------|---------------------|---------------------------------| 
         * 
         * En esta tabla tenéis un resumen de cómo hay que escribir el patrón de la fecha para darle formato.
         * (m) --> significa que esa letra es mayúscula.
         */

        // Formato Date
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Formato Time
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        // formato DateTime
        DateTimeFormatter formatoDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Formato ZonedDateTime
        DateTimeFormatter formatoZonedDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss Z z");


        /*
         * =================================
         * =   DIFERENTES TIPOS DE FECHA   =
         * =================================
         * En las siguientes líneas voy a almacenar en diferentes variables LA HORA ACTUAL según las diferentes clases.
         * De todas ellas voy a sacar un print por pantalla en el momento que esté utilizando cualquiera de ellas.
         * Aquí lo que vas a ver es cómo sacar la fecha actual en las clases principales.
         */

        // Clase Date
        LocalDate fechaDate = LocalDate.now();
        // Clase Time
        LocalTime horaTime = LocalTime.now();
        // Clase DateTime
        LocalDateTime fechaDateTime = LocalDateTime.now();
        // Clase ZonedDateTime
        ZonedDateTime fechaZonedDateTime = ZonedDateTime.now();

        /*
         * =================
         * =   LocalDate   =
         * =================
         * 
         * Ya sabes cómo tener la fecha actual, pero: 
         * 1. qué pasa si la fecha viene de una cadena de texto
         * 2. qué pasa si lo que quieres es una fecha puesta manualmente
         */

        System.out.println("======LocalDate======");
        System.out.println("Vamos a ver primero la fecha actual: " + fechaDate);
        System.out.println();

        // ======FECHA EN CADENA DE TEXTO======
        String fechaString = "06/06/1966"; // esto es una String
        // Se ha declarado anteriormente formatoFecha dia/mes/año
        // Se puede "traducir" (parsear) la cadena de texto a fecha
        System.out.println("Entra una String que es una fecha que queremos convertir: " + fechaString);
        LocalDate fechaDateParse = LocalDate.parse(fechaString, formatoFecha);
        System.out.println("Se ha parseado la fecha y ahora es de la clase LocalDate");
        System.out.println("fecha parseada: " + fechaDateParse);
        System.out.println();

        // ======FECHA ASIGNADA "MANUALMENTE"======
        LocalDate fechaManual = LocalDate.of(1966, 06, 06);
        System.out.println("La siguiente fecha ha sido asignada de forma manual: " + fechaManual);
        System.out.println();

        /*
         * Ahora hay dos fechas:
         * 1. La fecha actual en el momento de ejecución.
         * 2. La fecha que se ha asignado manualmente en String o directamente como LocalDate: 06/06/1966
         * 
         * Veamos lo siguiente:
         * - Cómo comparar.
         * - Cómo manipularlas (sumando y restando).
         * - Cómo coger únicamente partes de la fecha, como puede ser el año, mes, día...
         */

        // ======COMPARACION ENTRE FECHAS======
        System.out.println("======COMPARACION ENTRE FECHAS======");
        System.out.println("Fecha actual: " + fechaDate);
        System.out.println("Fecha introducida manualmente: " + fechaManual);

        // Voy a ver si una fecha es anterior a la otra
        // Para esto están los métodos isBefore e isAfter (antes y después respectivamente)
        // Utilizar este método devuelve un boolean
        boolean anterior = fechaManual.isBefore(fechaDate); // true
        System.out.println("¿Es la fecha '" + fechaManual + "' anterior a la fecha '" + fechaDate + "'?: " + anterior);
        boolean posterior = fechaManual.isAfter(fechaDate); // false
        System.out.println("¿Es la fecha '" + fechaManual + "' posterior a la fecha '" + fechaDate + "'?: " + posterior);
        System.out.println();

        /*
         * ======OPERACIONES CON FECHAS======
         * Para poder hacer diferentes operaciones están los métodos que empiezan por:
         * - plus (sumar)
         * - minus (restar)
         * 
         * Se pueden añadir días, meses, años, minutos, etc.
         * 
         * Para hacer las diferentes operaciones hay distintos métodos.
         * LocalDate es una clase que solo tiene en cuenta la fecha (año-mes-dia)
         * A LocalDate se le pueden añadir/quitar años, meses, semanas, días
         */

        System.out.println("======OPERACIONES CON FECHAS======");
        System.out.println("Fecha sin manipular: " + fechaDate);
        LocalDate fechaDateAddDia = fechaDate.plusDays(10); // añade 10 días a la fecha
        System.out.println("Se han añadido 10 días a '" + fechaDate + "' obteniendo como resultado: " + fechaDateAddDia);
        LocalDate fechaDateQuitarMes = fechaDate.minusMonths(5); // quita 5 meses a la fecha
        System.out.println("Se han substraído 5 meses a '" + fechaDate + "' obteniendo como resultado: " + fechaDateQuitarMes);
        System.out.println("Cada operación tiene su método, no olvides tener siempre a mano el manual. :)");
        System.out.println();

        /*
         * ======EXTRAER PARTES DE FECHAS======
         * Se pueden obtener partes de las fechas como el año, el mes, el día, etc.
         * Los métodos para ello empiezan por get
         */

        System.out.println("======EXTRAER PARTES DE FECHAS======");
        System.out.println("Fecha inicial: " + fechaDate);
        // Los días como mucho van a llegar a 31
        // Los meses como mucho van a llegar a 12
        // Los años son más grandes
        // Todos son números enteros, podemos almacenar los días y meses como byte
        // Aunque por lo general, para evitar problemas de tamaño (dado el tipado estático de Java)
        // Cuando hacemos operaciones con los números necesitamos que sean int
        // Así que por comodidad vamos a utilizar int, ya que es más seguro, sencillo y compatible
        // utilizar siempre este tipo.
        int diaMes = fechaDate.getDayOfMonth();
        int diaAnio = fechaDate.getDayOfYear();
        DayOfWeek diaSemana = fechaDate.getDayOfWeek();
        int mes = fechaDate.getMonthValue();
        Month mesNombre = fechaDate.getMonth();
        int anio = fechaDate.getYear();
        System.out.println("Dentro de la fecha el día es: " + diaMes);
        System.out.println("Teniendo en cuenta los 365 días del año este es el día número: " + diaAnio);
        System.out.println("Hoy es: " + diaSemana);
        System.out.println("Dentro de la fecha el mes es: " + mes);
        System.out.println("El nombre de este mes es: " + mesNombre);
        System.out.println("Estamos en el año: " + anio);
        System.out.println();

        /* 
         * =================
         * =   LocalTime   =
         * =================
         * 
         * ======HORA EN CADENA DE TEXTO======
         * Para traducir una hora en String a LocalTime el proceso es el mismo visto en LocalDate.
         * 
         * ======HORA ASIGNADA "MANUALMENTE"======
         * Para hacer una asignación de hora manual el proceso es el mismo visto en LocalDate.
         * 
         * ======COMPARACION ENTRE HORAS======
         * Para verificar si un tiempo es anterior o posterior se hace igual que con LocalDate (isBefore/isAfter).
         * 
         * ======OPERACIONES CON HORAS======
         * Funciona del mismo modo:
         * - plus para añadir
         * - minus para substraer
         * 
         * Según qué sea lo que se desea modificar se deberá aplicar uno u otro método.
         * 
         * ======EXTRAER PARTES DE FECHAS======
         * Se puede extraer cualquier parte de la hora igual que de la fecha.
         * El procedimiento es el mismo, salvo que no será con años, días, meses... 
         * Es con Hour, Minute, Second, Nano...
         */

        /*
         * =====================
         * =   LocalDateTime   =
         * =====================
         * 
         * Se utiliza la misma lógica teniendo en cuenta que esta clase se puede entender como Date + Time
         */

        /* 
         * =====================
         * =   ZonedDateTime   =
         * =====================
         * 
         * Incluye zona horaria.
         * Todo funciona igual, pero me detengo a mostrar las zonas horarias.
         */
        System.out.println("=====================");
        System.out.println("=   ZonedDateTime   =");
        System.out.println("=====================");
        System.out.println();
        System.out.println("Recordatorio de la fecha entera: " + fechaZonedDateTime);
        // Cambio de la información al huso horario de Tokio
        // Podéis consultar las diferentes zonas aquí: https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
        ZonedDateTime fechaZonedDateTimeTokio = fechaZonedDateTime.withZoneSameLocal(ZoneId.of("Asia/Tokyo"));
        System.out.println("Fecha en la zona horaria de Tokio: " + fechaZonedDateTimeTokio);
        // CUIDADO --> así cambias la zona con la MISMA HORA LOCAL (la nuestra)

        // Si se utiliza el método que tiene en cuenta el INSTANTE sí que va a transformar la hora
        // Un instante es único en cualquier parte del mundo que te encuentres.
        fechaZonedDateTimeTokio = fechaZonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Fecha transformada para este mismo momento en el horario de Tokio: " + fechaZonedDateTimeTokio);
        System.out.println();

        // Revisando, si podemos extraer lo que queramos de una fecha será fácil quedarnos fecha y hora (DateTime)
        // para mostrarle al usuario algo más amable ¿no?
        
        // ======CAMBIO DE FORMATO======
        System.out.println("Este formato cuesta de entender para un usuario normal. Se procede a simplificarlo...");
        // Java es de tipado estático. La variable fechaZonedDateTimeTokio se ha declarado como ZonedDateTime
        // Necesitamos una variable nueva de la clase LocalDateTime para poder alojar la fecha
        LocalDateTime fechaLocalDateTimeTokio = fechaZonedDateTimeTokio.toLocalDateTime();
        System.out.println("En el horario de Tokio es: " + fechaLocalDateTimeTokio);
        // Sigue sin mostrarse tan bien como quisiéramos. Formato...
        // fechaLocalDateTimeTokio.format(formatoDateTime); --> Esto devuelve una String
        // Es mejor hacerlo directamente en la sentencia de salida y no utilizar más variables innecesarias.
        System.out.println("Corregido: " + fechaLocalDateTimeTokio.format(formatoDateTime));
        System.out.println();

        /*
         * =========================
         * =   DURATION y PERIOD   =
         * =========================
         * 
         * Se pueden crear duraciones de tiempo basadas en segundos con la clase Duration
         * o en fechas con la clase Period.
         * 
         * También se puede calcular el tiempo transcurrido entre fechas u horas utilizando el método between.
         */

        System.out.println("=========================");
        System.out.println("=   DURATION Y PERIOD   =");
        System.out.println("=========================");
        System.out.println();
        System.out.println("======PERIOD======");
        System.out.println("Fecha actual: " + fechaDate);
        System.out.println("Fecha creada: " + fechaManual);
        System.out.println();
        // La diferencia entre una y otra será de la clase Period
        Period diferenciaFecha = Period.between(fechaManual, fechaDate);
        System.out.println("El tiempo transcurrido entre ambas fechas es de: ");
        System.out.println("Días: " + diferenciaFecha.getDays());
        System.out.println("Meses: " + diferenciaFecha.getMonths());
        System.out.println("Años: " + diferenciaFecha.getYears());
        System.out.println();
        System.out.println("======DURATION======");
        System.out.println("Hora actual: " + horaTime.format(formatoHora));
        // No hemos creado antes una hora, podemos hacerlo ahora:
        LocalTime horaManual = LocalTime.of(22, 45, 30);
        System.out.println("Hora creada: " + horaManual);
        System.out.println();
        // La diferencia, al ser tiempo y no fecha, será de la clase Duration
        Duration diferenciaHora = Duration.between(horaTime, horaManual);
        System.out.println("El tiempo transcurrido entre ambas es de:");
        System.out.println("Segundos: " + diferenciaHora.getSeconds());
        System.out.println("Nanosegundos: " + diferenciaHora.getNano());
        System.out.println();

        /*
         * ======OPERACIONES CON PERIODOS======
         * También se pueden hacer operaciones utilizando los métodos plus y minus para añadir o substraer
         * 
         * Vamos a crear un Periodo para añadir o quitar a una fecha.
         * También vamos a hacer lo mismo con una duración para hacerlo con una hora.
         */

        System.out.println("======OPERACIONES======");
        // Creo tanto periodo como duracion
        Duration duracionOperaciones = Duration.ofHours(5); // Esto simplemente es una duración de 5h
        Period periodoOperaciones = Period.ofWeeks(2); // Esto en cambio es una duración de 2 semanas
        System.out.println("Periodo y duración establecidos...");
        System.out.println("A la hora '" + horaTime.format(formatoHora) + "' le voy a añadir la duración.");
        System.out.println("La hora actualizada es: " + horaTime.plus(duracionOperaciones).format(formatoHora));
        System.out.println();
        System.out.println("A la fecha '" + fechaDate + "' le voy a quitar el periodo.");
        System.out.println("La fecha actualizada es: " + fechaDate.minus(periodoOperaciones));
        


        



        // // Calendar es la clase y hay que instanciar un objeto
        // // Uso del metodo getInstance() que devuelve fecha y hora
        // // Similar a new Date()
        // Calendar fecha = Calendar.getInstance();
        // System.out.println("Fecha actual: " + fecha.getTime()); // Devuelve la fecha actual en el momento de la ejecución
        // System.out.println();
        // /* Se puede obtener la fecha en milisegundos.
        //  * La variable fecha lo que tiene guardado es la cantidad de milisegundos transcurridos
        //  * desde la hora UNIX hasta el momento actual.
        //  * HORA UNIX --> 01/01/1970 00:00:00
        //  * Se guarda en un tipo numérico long.
        //  */
        // System.out.println("Fecha actual en milisegundos: " + fecha.getTimeInMillis());
        // System.out.println();

        // /* Podemos extraer día, mes, año, hora, minutos, segundos...
        //  * Se mantienen para que haya compatibilidad entre nuevas versiones de Java y código más antiguo
        //  * Es mejor usar la API actual --> java.time
        //  */
        
        // // ----------
        // //    Día --> devolverá un número entero que es el día del mes o de la semana
        // // ----------
        // // 1. Calendar.DAY_OF_WEEK --> devuelve entero entre 1 y 7 correspondiendo al día de la semana
        // // Empieza a contar desde 1 y el primer día es domingo
        // // 1 = domingo, 2 = lunes, 3 = martes...
        // System.out.println("Hoy es día: " + fecha.get(Calendar.DAY_OF_WEEK) + " ¿a qué día de la semana corresponde?");
        // // 2. Calendar.DAY_OF_MONTH --> devuelve un entero que corresponde al día numérico dentro del mes
        // // Entre 1 y 31 || 1 y 30 || 1 y 29 || 1 y 28 según corresponda
        // System.out.println("Hoy es día: " + fecha.get(Calendar.DAY_OF_MONTH));
        // System.out.println();
        
        // // ----------
        // //    Mes --> devolverá un número entero que es el número del mes
        // // ----------
        // // CUIDADO: empieza a contar desde 0, algo confuso ¿no?
        // // 0 = enero, 1 = febrero...
        // System.out.println("Estamos en el mes: " + fecha.get(Calendar.MONTH));
        // // Para evitar confusión hay que adaptar el resultado
        // System.out.println("El mes actual corregido (sumando 1): " + (fecha.get(Calendar.MONTH) + 1));
        // System.out.println();

        // // ----------
        // //    Año --> devolverá un número entero que es el año
        // // ----------
        // // Devuelve el año actual sin tener que hacer ninguna corrección posterior como pasa con java.util.Date
        // System.out.println("Estamos en el año: " + fecha.get(Calendar.YEAR));
        // System.out.println();

        // // -----------
        // //    Hora --> devolverá un número entero con la hora del momento actual.
        // // -----------
        // // 1. OPCION 1: Horas de 1 a 12 formato de 12h
        // System.out.println("La hora actual es (HOUR formato 12h): " + fecha.get(Calendar.HOUR));
        // // 2. OPCION 2: Horas de 0 a 23 formato de 24h
        // System.out.println("La hora actual es (HOUR_OF_DAY formato 24h): " + fecha.get(Calendar.HOUR_OF_DAY));
        // System.out.println();

        // // -----------
        // //    Minuto --> devolverá un número entero con los minutos del momento actual.
        // // -----------
        // // El resultado va de 0 a 59
        // System.out.println("Los minutos actuales son: " + fecha.get(Calendar.MINUTE));
        // System.out.println();

        // // ---------------
        // //    Segundos --> devolverá un número entero con los segundos del momento actual.
        // // ---------------
        // // El resultado va de 0 a 59
        // System.out.println("Los segundos actuales son: " + fecha.get(Calendar.SECOND));
        // System.out.println();

        // // -------------------
        // //    Milisegundos --> devolverá un número entero con los milisegundos del segundo actual.
        // // -------------------
        // // El resultado va de 0 a 999
        // System.out.println("Los milisegundos actuales son: " + fecha.get(Calendar.MILLISECOND));
        // System.out.println();

        // System.out.println("------------------------------");
        // System.out.println("        MODIFICACIONES ");
        // System.out.println("------------------------------");
        // System.out.println();

        // /*
        //  * Calendar permite modificar las fechas con el método set()
        //  * El método set() tiene dentro distintos parámetros que servirán para modificar esas partes de la fecha
        //  * 
        //  * set(Año, Mes, Dia, Hora, Minuto, Segundo)
        //  * 
        //  * No es necesario dar un argumento (valor) a cada uno de los parámetros.
        //  * Set únicamente modificará aquella parte de la fecha cuyo parámetro tenga valor.
        //  */
        // System.out.println("Recordemos la fecha: " + fecha.getTime());
        // // Modificación de fecha:
        // fecha.set(Calendar.YEAR, 2023);
        // System.out.println("Vamos a modificar el año poniéndolo en 2023: " + fecha.getTime());
        // System.out.println();
        
        // // Se pueden hacer varias modificaciones al mismo tiempo. Vamos a cambiar:
        // // Año = 2025
        // // Mes = Abril
        // // Dia = 3
        // // Hora = 2
        // // Minuto = 13
        // // Segundos = 33
        // // Modificación de fecha:
        // fecha.set(2025, Calendar.APRIL, 3, 2, 13, 33);
        // // fecha.set(2025, 3, 3, 2, 13, 33); --> El mes se puede poner en número, recuerda que 0=enero, 3=abril
        // System.out.println("Cambiamos varios valores a la vez: " + fecha.getTime());
        // System.out.println();

        // /*
        //  * ====ADVERTENCIA====
        //  * Modificar las fechas erróneamente no va a hacer saltar un error.
        //  * Si a febrero le asignamos el día 30 saltará al mes siguiente.
        //  * Esto supone un problema porque podemos estar trabajando con fechas incorrectas.
        //  */

        // System.out.println("---------------------------");
        // System.out.println("        OPERACIONES ");
        // System.out.println("---------------------------");
        // System.out.println();

        // /* 
        //  * java.util.Date no permitía operar con fechas, ni añadir ni sustraer días o meses.
        //  * Esto con java.util.Calendar se empezó a poder hacer, pero de manera del todo intuitiva.
        //  * 
        //  * Hay dos métodos para modificar las fechas: add() y roll().
        //  * 
        //  * ---add()---
        //  * Modifica la fecha de tal manera que si rebasa el mes, va a modificar también el mes.
        //  * Por ejemplo, tenemos fecha 31-01-2025 y queremos añadir 1 día. 
        //  * Pasaría a 32-01-2025 que no existe, así que salta a día 01, pero no solo estamos modificando
        //  * día, como ha rebasado la capacidad del mes 01 también modificará el mes pasando a 02.
        //  * La fecha resultante después de añadir 1 día a 31-01-2025 será 01-02-2025.
        //  * 
        //  * ---roll()---
        //  * Únicamente modifica la parte de la fecha deseada sin alterar el resto.
        //  * Por ejemplo, tenemos fecha 03-12-2024 y queremos sumar 1 mes.
        //  * Es el último mes y no existe el mes 13, así que saltará al mes 01.
        //  * roll() no va a modificar ninguna otra parte de la fecha:
        //  * la fecha resultante después de añadir 1 mes con roll() será 03-01-2024.
        //  *
        //  * *** Mientras que add() hubiera cambiado el año, roll() únicamente ha cambiado el mes.
        //  */
        
        // // Reset de la fecha para volver a tener la fecha actual:
        // fecha = Calendar.getInstance();
        // System.out.println("METODO ADD");
        // System.out.println("Añadiendo un día a la fecha actual: " + fecha.getTime());
        // fecha.add(Calendar.DAY_OF_MONTH, 1);
        // System.out.println("Nueva fecha con un día añadido: " + fecha.getTime());
        // System.out.println();
        // System.out.println("Si le añadimos 5 días saltará de mes (fecha tal como está): " +fecha.getTime());
        // fecha.add(Calendar.DAY_OF_MONTH, 15);
        // System.out.println("Fecha modificada: " + fecha.getTime());
        // System.out.println();
        // System.out.println("*********************");
        // System.out.println();
        // System.out.println("METODO ROLL");
        // // Reset de la fecha para volver a tener la fecha actual:
        // fecha = Calendar.getInstance();
        // System.out.println("Añadiendo 6 días a la fecha actual: " + fecha.getTime());
        // fecha.roll(Calendar.DAY_OF_MONTH, 15);
        // System.out.println("Nueva fecha con seis días añadidos: " + fecha.getTime());
        // System.out.println();
        // /*
        //  * Con la suma de días que hemos hecho tendríamos que pasar a abril, pero lo único
        //  * que se modifica es el día.
        //  */


        // /* 
        //  * java.util Calendar --> clase introducida en Java 1.1 (1997).
        //  * La finalidad era mejorar la anterior clase Date.
        //  * Date tenía métodos obsoletos, además que no permitía hacer operaciones.
        //  * Tampoco manejaba correctamente las diferentes zonas horarias.
        //  * Aunque solucionaba parte de esos problemas, seguía siendo poco intuitivo (meses que empiezan en 0...)
        //  * En Java 8+ llega el paquete java.time que introduce diferentes clases
        //  * que permiten trabajar con fechas de una manera mucho más moderna e intuitiva.
        //  */
        
    }
}