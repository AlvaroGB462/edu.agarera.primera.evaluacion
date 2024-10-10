package servicios;

import java.io.FileWriter;

import controladores.Inicio;

public class FicheroImplementacion implements FicheroInterfaz{

	public void ficheroLog(String msg) {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(Inicio.rutaCompltaLog, true);
			
			fw.write(msg.concat("\n"));
			
			fw.close();
			
		} catch (Exception e) {
			
			System.err.println("ERROR-001: fallo en el ffichero" + e);
		}
		
	}
}
