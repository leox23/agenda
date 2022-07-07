import java.util.Scanner;

public class ManejadorAgenda {
	private static final Scanner input = new Scanner(System.in);
	
	
	public static Contacto inputContacto(String titulo, String ext){
		String name, celphone, city;
		
		System.out.println(titulo);
		System.out.println("Ingrese nombre del contacto" + ext);
		name = input.nextLine();
		System.out.println("Ingrese el nomero de celular" + ext);
		celphone = input.nextLine();
		System.out.println("Ingrese en que ciudad vive el contacto" + ext);
		city = input.nextLine();
		
		return new Contacto(name, celphone, city);
	}
	
	public static void inputNuevoContacto() {
		Contacto c = inputContacto("Agregar nuevo contacto", "");
		Agenda.agregarContactos(c.getName(), c.getCelphone(), c.getCity());
	}
	
	public static void inputModificarContacto() {
		System.out.println("Ingrese el id del contacto a modificar");
		String id = input.nextLine();
		Contacto c = inputContacto("Ingrese los nuevos datos del contacto", "/nSino quiere modificarlo solo presione enter:");
		Agenda.modificarContacto(id, c);
	}
}

