package ejercicio36;

import java.util.Enumeration;
import java.util.Properties;

public class PropiedadesSistema {

	public static void main(String[] args) {
		
		Properties prop =  System.getProperties();
		
		Enumeration<Object> keys = prop.keys();

		while (keys.hasMoreElements()) {
		   Object key = keys.nextElement();
		   System.out.println(key + " = "+ prop.get(key));
		}

	}

}
