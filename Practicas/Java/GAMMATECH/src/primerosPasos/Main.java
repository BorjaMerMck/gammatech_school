package primerosPasos;

import java.util.ArrayList;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {

		
		// Coche coche1 = new Coche("Ferreri","0211","2012");
		// coche1.impirmirInfo();
		
		
		ArrayList<Coche> coches = new ArrayList<>();
		
		coches.add(new Coche("ferrari","A0231","2012"));
		coches.add(new Coche("Mercedes","F1231","2025"));
		coches.add(new Coche("Audi","A1211","1923"));
		
		Iterator<Coche> iterator = coches.iterator();
		
		while (iterator.hasNext())
		{
			Coche coche = iterator.next();
            coche.imprimirInfo(); 
            
		}
		
	}

}
