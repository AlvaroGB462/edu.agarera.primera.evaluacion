package utilidades;

import controladores.Inicio;
import dtos.ClienteDto;

public class Util {

	/*
	 * Metodo para calcular el id
	 * agb-10/10/2024
	 */
	
	public static int calcularId() {
		
		if(Inicio.LISA_CLIENTE.isEmpty()) {
			
			return 1;
		}
		
		int id = 0;
		
		for(ClienteDto buscar : Inicio.LISA_CLIENTE) {
			
			if (buscar.getId() > id) {
				
				id = buscar.getId();
			}
		}
		
		return id +1;
	}
}
