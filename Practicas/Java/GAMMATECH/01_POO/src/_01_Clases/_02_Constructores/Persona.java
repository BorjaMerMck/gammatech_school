package _01_Clases._02_Constructores;

//Siempre que queramos construir un objeto, necesitamos de la ayuda de lo
//que se conoce como "Constructor"

//Un Constructor en POO es un método especial el cual se usa pra la creación
//de los objetos. Es imperativo usar siempre algún constructor para crear un
//objeto.

//En java se permite crear mas de un constructor. El constructor de un objeto
//en java, sigue la misma regla que los métodos, es decir, la firma de un 
//método o función se puede extrapolar al constructor, pero no podemos cambiar
//el nombre del constructor. El nombre del constructor SIEMPRE tendrá que ser
//el nombre de la clase. Los constructores cuando se crean no devuelven NADA,
//ni siquiera "void"
public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	// En java, si no creamos un constructor, la JVM de java nos proporcionara
	//el llamado "constructor por defecto", que es un constructor sin parámetros 
	//de entrada.
	
	// El constructor por defecto es el siguiente:
	public Persona() {
		//Este sería el constructor por defecto que crea java automaticamente
		//, un constructor VACIO
		//OJO!!! Siempre y cuando NO creemos mas constructores.
		//Dicho de otra manera, si nosotros no creamos consturctor, java
		//creará el constructor por defecto, en cuanto creemos un constructor
		//java NO creará ningun constructor más.
		
		//Podemos alterar el comportamiento de un constructor
		System.out.println("Objeto creado");
		
		//Normalmente podemos alterar el comportamiento de un constructor
		//cuando queremos que todos los valores de los objetos empiecen
		//igual
		edad = 18;//De esta manera TODOS los objetos tendrán la edad
				  //d2 18 cuando invoquemos este constructor
		
		this.edad = 18;
	}
	
	/*
	Con el constructor lo que queremos hacer es construir un objeto
	directamente con unas características determinadas. Estas características
	son los atributos.
	
	En el caso de Persona tenermos los atributos: nombre, edad, peso, estaCasado.
	
	Todo método o función puede tener parámetros (que van a ser los valores que 
	necesitará de entrada e internamente el método utilizará como si fueran variables).
	Los paramétros tienen que tener un nombre que sea descriptivo. En el caso del
	constructor los parámetros, en general, van a hacer alusión a los atributos (a las
	características del objeto que se va a instanciar).
	
	PROBLEMA: si quiero crear (instanciar) un objeto dándole valor a cada uno
	de los atributos directamente lo más fácil será que el nombre del parámetro en
	el método constructor sea el mismo nombre que el atributo de la clase.
	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		nombre = nombre;
		edad = edad;
		peso = peso;
		estaCasado = estaCasado;
		
		El constructor es lo mismo que un método/función. Si le digo que
		nombre = nombre se vuelve loco. Quiero que el valor que hay en el parámetro
		nombre se asigne al ATRIBUTO de la clase (que es la característica del objeto)
		
		Para esto necesito la palabra this delante del nombre que hace referencia
		al atributo de clase.
		
		Dicho de otra manera: las líneas 65 - 68 necesito que sean así:
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}
	*/
	
	//Podemos tener todos los constructores que queramos, es decir, 
	//los constructores se puede SOBRECARGAR
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		//Aquí tenemos un problema, cuando declaramos una variable dentro
		//de un constructor con el MISMO nombre que el atributo, tapamos
		//la visibilidad del atributo.
		
		//Aquí NO estamos accediendo al atributo 'nombre', estamos accediendo
		//al parametro de entrada 'nombre'
		//nombre = "Felix";
		//edad = 18;
		
		//Para romper esta problemática podemos usar la palabra reservada "this"
		
		//"this" es una referencia al propio objeto
		// De momento vamos a usar "this" para acceder a los atributos de un
		//objeto
		this.nombre = nombre;
		//El primer nombre es el atributo, el segundo nombre es el parámetro
		//de entrada
		
		//Se considera buena práctica de programación referirse a los atributos
		//con "this"
		
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}
	
	//Constructor solo con el nombre
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	//Aunque el atributo "apellido" existiera, este constructor
	//no se podría crear porque tiene la misma firma que el constructor
	//del nombre (el de arriba)
	/*
	public Persona(String apellido) {
		this.apellido = apellido;
	}*/
}