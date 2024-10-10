package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.ComprasDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuIntefaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static final List<ComprasDto> LISTA_COMPRAS = new ArrayList<ComprasDto>();

	public static final List<ClienteDto> LISA_CLIENTE = new ArrayList<ClienteDto>();

	public static final String rutaCompltaLog = "C:\\Users\\agarera\\eclipse-workspace\\edu.agarera.primera.evaluacion\\src\\ficheroLog\\auditoria.txt";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MenuIntefaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();

		int opcionSeleccionada;
		boolean cerrarMenu = false;

		do {

			try {
				
				opcionSeleccionada = mi.menuPirncipal();

				switch (opcionSeleccionada) {
				case 0:
					cerrarMenu = true;
					fi.ficheroLog("Cerrar Menu");
					
					break;
				case 1:
					System.out.println("Menu empleado");
					fi.ficheroLog("Menu empleado");
					
					int opcionEmpleado;
					
					boolean cerrarEmpleado = false;
					do {

						opcionEmpleado = mi.menuEmpleado();

						switch (opcionEmpleado) {
						case 0:
							cerrarEmpleado = true;
							fi.ficheroLog("Cerrar Empleado");
							break;
						case 1:
							System.out.println("Claculo total de ventas mensuales");
							fi.ficheroLog("Claculo total de ventas mensuales");
							oi.calcularImporteMensual();
							cerrarEmpleado = true;

							break;
						case 2:
							System.out.println("Añadir compras a un cliente");
							fi.ficheroLog("Añadir compras a un cliente");
							oi.anyadirCompra();
							cerrarEmpleado = true;
							
							break;
						default:
							System.out.println("Opcion seleccionada no valida");
							fi.ficheroLog("Opcion seleccionada no valida");
							
							break;

						}

					} while (!cerrarEmpleado);
					break;
				case 2:
					System.out.println("Menu gerencia");
					fi.ficheroLog("Menu gerencia");
					
					int opcionGerencia;
					
					boolean cerrarGerencia = false;
					do {

						opcionGerencia = mi.menuGerencia();

						switch (opcionGerencia) {
						case 0:
							cerrarGerencia = true;
							fi.ficheroLog("Cerrar gerencia");
							
							break;
						case 1:
							System.out.println("Crear nuevo cliente");
							fi.ficheroLog("Crear nuevo cliente");
							oi.crearCliente();
							cerrarGerencia = true;

							break;
						default:
							System.out.println("Opcion seleccionada no valida");
							fi.ficheroLog("Opcion seleccionada no valida");
							
							break;

						}

					} while (!cerrarGerencia);
					break;
				default:
					System.out.println("Opcion seleccionada no valida");
					fi.ficheroLog("Opcion seleccionada no valida");
					
					break;

				}

			} catch (Exception e) {
				
				fi.ficheroLog("ERROR-002 " + e);

			}

		} while (!cerrarMenu);

	}

}
