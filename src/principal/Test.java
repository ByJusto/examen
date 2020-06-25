package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void Main(String[] args) {
		
		
		ArrayList<String> numeros = new ArrayList<String>();
		
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
		numeros.add("5");
		
		Collections.shuffle(numeros);
		
		for(String numero : numeros) {
			
			System.out.println(numero);
			
		}
	}
}
