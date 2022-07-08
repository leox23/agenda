import java.util.Scanner;

public class ManejadorAgenda {

	private static final Scanner input = new Scanner(System.in);

	public static Contacto inputContacto(String titulo, String ext) {
		String name, celphone, city;
		System.out.println(titulo);
		System.out.println("Ingrese nombre del contacto:" + ext);
		name = input.nextLine();
		System.out.println("Ingrese el número de celular:" + ext);
		celphone = input.nextLine();
		System.out.println("Ingrese en que ciudad vive el contacto:" + ext);
		city = input.nextLine();

		return new Contacto(name, celphone, city);
	}

	public static void inputNuevoContacto() {
		Contacto c = inputContacto("------AGREGAR NUEVO CONTACTO EN LA AGENDA-----\n", "");
		Agenda.agregarContactos(c.getName(), c.getCelphone(), c.getCity());
	}

	public static void inputModificarContacto() {

		System.out.println("------MODIFICAR CONTACTO EN LA AGENDA-----\n");
		System.out.println("Ingrese el id del contacto a modificar:");
		String id = input.nextLine();
		Contacto encontrado = Agenda.buscarContacto(id);
		if (encontrado != null) {
			System.out.println("Se encontró el siguiente contacto: \n" );
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.printf("%5s %30s %20s %20s","ID","NOMBRE","TELEFONO","DIRECCIÓN");
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.format("%5s %30s %20s %20s",encontrado.getId(),encontrado.getName(),encontrado.getCelphone(),encontrado.getCity());
			System.out.println("\n");
			Contacto c = inputContacto("Ingrese los nuevos datos del contacto que desea modificar",
					"\nSi no quiere editarlo, solo presione enter:");
			Agenda.modificarContacto(id, c);
		} else {
			System.out.println("No se encontró el usuario con el ID "+id);

		}

	}

	public static void inputEliminarContacto() {
		System.out.println("------ELIMINAR CONTACTO DE LA AGENDA-----\n");
		System.out.println("Ingrese el id del contacto a eliminar:");
		String id = input.nextLine();
		Contacto encontrado = Agenda.buscarContacto(id);
		if (encontrado != null) {

			System.out.println("Se encontró el siguiente contacto: " + encontrado.toString());
			boolean bucle;
			do {
				bucle = false;
				System.out.println("¿Desea eliminar el contacto encontrado? Si: y / No: n");
				String seleccion = input.nextLine();
				if (seleccion.toLowerCase().equals("y")) {
					Agenda.eliminarContacto(encontrado.getId());
				} else if (seleccion.toLowerCase().equals("n")) {
					System.out.println("No se eliminó el contacto encontrado");
				} else {
					System.out.println("!Digite un caracter válido¡");
					bucle = true;
				}
			} while (bucle);

		} else {
			System.out.println("No se encontró el usuario con ID " + id);
		}

	}
}
