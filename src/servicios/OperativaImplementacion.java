package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ClienteDto;
import dtos.ComprasDto;

public class OperativaImplementacion implements OperativaInterfaz {

	public void crearCliente() {

		boolean cerrarCliente = false;

		do {

			Scanner sc = new Scanner(System.in);

			ClienteDto nuevo = new ClienteDto();

			System.out.println("Escriba el nombre del cliente");
			String nombreDado = sc.nextLine();

			System.out.println("Escriba los apellidos");
			String apellidosDado = sc.nextLine();

			nuevo.setNombre(nombreDado);
			nuevo.setApellido(apellidosDado);
			nuevo.setId(utilidades.Util.calcularId());

			Inicio.LISA_CLIENTE.add(nuevo);

			System.out.println("¿Desea añadir mas lientes? (Si - No)");
			if (sc.next().equals("No")) {

				cerrarCliente = true;
			}

		} while (!cerrarCliente);

	}

	public void anyadirCompra() {

		for (ClienteDto buscarClienteDto : Inicio.LISA_CLIENTE) {

			System.out.println("Id: " + buscarClienteDto.getId() + "\n" + "Nombre: " + buscarClienteDto.getNombre());
		}

		Scanner sc = new Scanner(System.in);

		ComprasDto nuevaCompra = new ComprasDto();
		
		System.out.println("Escriba el id del cliente que quiere añadir una compra");
		int idDado = sc.nextInt();
		
		for (ClienteDto buscar : Inicio.LISA_CLIENTE) {

			if (idDado == buscar.getId()) {
				
				System.out.println("Escriba el importe de la compra");
				int importeCompra = sc.nextInt();
				
				nuevaCompra.setImporte(importeCompra);
				nuevaCompra.setId(idDado);
				
				LocalDateTime fecha = LocalDateTime.now();
				nuevaCompra.setFechaCompra(fecha);
				
				Inicio.LISTA_COMPRAS.add(nuevaCompra);
				
			}
				
		}
		
		for (ComprasDto buscarClienteDto : Inicio.LISTA_COMPRAS) {

			System.out.println("Id: " + buscarClienteDto.getId() + "\n" + "Importe: " + buscarClienteDto.getImporte());
		}

		

	}
	
	public void calcularImporteMensual() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba la fecha para el calculo en formato MM-yyyy");
		String fechaDada = sc.next();
		
		int importe = 0;
		
		for(ComprasDto buscar : Inicio.LISTA_COMPRAS) {
			
			buscar.getFechaCompra();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-yyyy");
			String fechConvertida = formato.format(buscar.getFechaCompra());
			
			if(fechaDada.equals(fechConvertida)) {
				
				importe = importe + buscar.getImporte();
				
			}
		}
		System.out.println("Importe: " + importe);
		
		
		
	}

}
