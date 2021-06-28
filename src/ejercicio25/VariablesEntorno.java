package ejercicio25;

import java.util.Map;

public class VariablesEntorno {

	public static void main(String[] args) {
		
		Map<String, String> variablesEntorno = System.getenv();
		
		for (String variable : variablesEntorno.keySet()) {
			System.out.printf("%s: %s\n", variable, variablesEntorno.get(variable));
		}
		
	}

}
