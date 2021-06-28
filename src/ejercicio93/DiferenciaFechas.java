package ejercicio93;

import java.time.LocalDate;
import java.time.Period;

public class DiferenciaFechas {

	public static void main(String[] args) {
		
		LocalDate fechaArbitraria = LocalDate.of(2000, 1, 1);
		LocalDate fechaActual = LocalDate.now();
		
		System.out.println("Fecha Arbitraria: " + fechaArbitraria);
		System.out.println("Fecha Actual: " + fechaActual);
		
		Period diffFechas = Period.between(fechaArbitraria, fechaActual);
		System.out.println("Diferencia Entre Fecha: " + diffFechas);
		
		System.out.printf("Diferencia Entre Fecha: %s %s %s", 
				diffFechas.getYears(), diffFechas.getMonths(), diffFechas.getDays());
	}

}
