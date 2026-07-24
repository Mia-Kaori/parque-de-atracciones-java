package paq;

import java.util.*;

public class Main {

	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static Scanner scDouble = new Scanner(System.in);

	static Atraccion tioVivo = new Atraccion("Tio Vivo", 2.5, 6, 0.8);
	static Atraccion noria = new Atraccion("Noria", 4.0, 5, 0.9);
	static Atraccion coches = new Atraccion("Coches de choque", 2.5, 10, 0.6);

	static List<Atraccion> atracciones = new ArrayList();
	static List<Feriante> feriantes = new ArrayList();
	static List<Cuadrante> cuadrantes = new ArrayList();

	static int a[][] = new int[7][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		atracciones.add(tioVivo);
		atracciones.add(noria);
		atracciones.add(coches);

		do {
			System.out.println("\nMENU");
			System.out.println("1.-Muestra de precios");
			System.out.println("2.-Introducción de feriante");
			System.out.println("3.-Eliminar feriante");
			System.out.println("4.-Asociar día con atracción y feriante (cuadrante)");
			System.out.println("5.-Muestra del cuadrante anterior");
			System.out.println("6.-Muestra de ganancias de la semana");
			System.out.println("Introduzca una opción: ");
			int opcion = scInt.nextInt();

			switch (opcion) {
			case 1:

				muestraPrecios();
				break;

			case 2:

				introduccionFeriante();
				break;

			case 3:

				eliminarFeriante();
				break;

			case 4:

				asociarDia();
				break;

			case 5:

				muestraCuadrante();
				break;

			case 6:
				muestraGanancias();
				break;
			}

		} while (true);

	}

	private static void muestraGanancias() {
		// TODO Auto-generated method stub
		System.out.println("--Máximos POR DÍA--");

		for (int i = 0; i < a.length; i++) {

			int max = a[i][0];
			String atraccion = "tiovivo";

			if (a[i][1] > max) {
				max = a[i][1];
				atraccion = "noria";
			}

			if (a[i][2] > max) {
				max = a[i][2];
				atraccion = "coches de choque";
			}

			System.out.println("Día " + (i + 1) + ": máximo del día: " + atraccion + " = " + max);
		}

		System.out.println("\nPulsa enter para continuar");
		scLine.nextLine();
	}

	private static void muestraCuadrante() {
		// TODO Auto-generated method stub

		for (Cuadrante c : cuadrantes) {
			System.out.println(c);
		}

		Random r = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = r.nextInt(400) + 100;

			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println("Día: " + (i + 1) + ", atracción tiovivo: ganancias = " + a[i][0]);

		}

		System.out.println("\n");

		for (int i = 0; i < a.length; i++) {

			System.out.println("Día: " + (i + 1) + ", atracción noria: ganancias = " + a[i][1]);

		}

		System.out.println("\n");

		for (int i = 0; i < a.length; i++) {

			System.out.println("Día: " + (i + 1) + ", atracción coches de choque: ganancias = " + a[i][2]);

		}

		System.out.println("\nPulsa enter para continuar");
		scLine.nextLine();
	}

	private static void asociarDia() {
		// TODO Auto-generated method stub
		int dia;

		do {

			System.out.println("Introduzca el dia -1 para salir: ");
			dia = scInt.nextInt();
			if (dia == -1)
				break;

			for (int i = 0; i < feriantes.size(); i++) {
				System.out.println("\n" + (i + 1) + ".-" + feriantes.get(i));
			}

			System.out.println("\nIntroduzca el feriante (el número): ");
			int opcion = scInt.nextInt() - 1;

			System.out.println("Ha seleccionado a " + feriantes.get(opcion).getNombre() + "\n");

			for (int i = 0; i < atracciones.size(); i++) {
				System.out.println((i + 1) + ".-" + atracciones.get(i));
			}
			System.out.println("Introduzca la atracción (1-3): ");
			int atraccion = scInt.nextInt() - 1;

			System.out.println("Ha seleccionado " + atracciones.get(atraccion));

			cuadrantes.add(new Cuadrante(dia, feriantes.get(opcion), atracciones.get(atraccion)));

			System.out.println("El día " + dia + " de feria se ha encargado " + feriantes.get(opcion).getNombre()
					+ " de la atracción " + atracciones.get(atraccion));
		} while (dia != -1);

		System.out.println("\nPulsa enter para continuar");
		scLine.nextLine();
	}

	private static void eliminarFeriante() {
		// TODO Auto-generated method stub

		System.out.println("--LISTADO DE FERIANTES--");
		for (int i = 0; i < feriantes.size(); i++) {
			System.out.println((i + 1) + ".-" + feriantes.get(i));
		}

		System.out.println("¿Qué feriantes quiere eliminar?");
		int opcion = scInt.nextInt() - 1;
		if (opcion >= 0 && opcion <= feriantes.size()) {
			feriantes.remove(opcion);
		}

		System.out.println("Feriante eliminado");
		System.out.println("\nPulsa enter para continuar");
		scLine.nextLine();
	}

	private static void introduccionFeriante() {
		// TODO Auto-generated method stub
		System.out.println("--INTRODUCIR FERIANTE--");
		System.out.println("Nombre: ");
		String nombre = scLine.nextLine();

		System.out.println("Apellidos: ");
		String apellidos = scLine.nextLine();

		System.out.println("Edad: ");
		int edad = scInt.nextInt();

		Feriante nuevo = new Feriante(nombre, apellidos, edad);

		feriantes.add(nuevo);

		System.out.println(nombre + " " + apellidos + " añadido");
		System.out.println("Número de feriantes: " + feriantes.size());
		System.out.println("\nPulsa enter para continuar");
		scLine.nextLine();
	}

	private static void muestraPrecios() {
		// TODO Auto-generated method stub

		System.out.println("--MUESTRA DE PRECIOS--");
		for (Atraccion a : atracciones) {
			System.out.println("Ticket " + a.getNombre() + ": " + a.getPrecioticket() + " euros");
			System.out.println("Abono ticket " + a.getNombre() + ": " + a.precioAbono() + " euros\n");
		}

		System.out.println("\nPulsa enter para continuar");
		scLine.nextLine();
	}

}
