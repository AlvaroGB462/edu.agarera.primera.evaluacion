package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuIntefaz {

	public int menuPirncipal() {

		Scanner sc = new Scanner(System.in);

		int opcion;

		System.out.println("-------------------");
		System.out.println("|0. Cerar menu    |");
		System.out.println("|1. Menu empleado |");
		System.out.println("|2. Menu gerencia |");
		System.out.println("-------------------");

		opcion = sc.nextInt();

		return opcion;
	}

	public int menuEmpleado() {

		Scanner sc = new Scanner(System.in);

		int opcion;

		System.out.println("---------------------------------------");
		System.out.println("|0. Cerar empleados                   |");
		System.out.println("|1. Calculo total de ventas mensuales |");
		System.out.println("|2. Añadir compra a un cliente        |");
		System.out.println("---------------------------------------");

		opcion = sc.nextInt();

		return opcion;
	}

	public int menuGerencia() {

		Scanner sc = new Scanner(System.in);

		int opcion;

		System.out.println("----------------------------");
		System.out.println("|0. Cerar gerencia         |");
		System.out.println("|1. Crear un nuevo cliente |");
		System.out.println("----------------------------");

		opcion = sc.nextInt();

		return opcion;
	}

}
