package primerosPasos;

public class Coche {
	
	
	private String marca, modelo,anio;
	
	public Coche (String marca, String  modelo,String anio)
	{
		this.marca = marca;
		this.modelo=modelo;
		this.anio = anio;
	}
	
	
	public void imprimirInfo()
	{
			
		System.out.println("Marca: "+marca + "\nModelo: "+ modelo +"\nAño: "+ anio + "\n");
	}
	
	
	
}
