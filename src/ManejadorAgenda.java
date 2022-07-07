import java.util.Scanner;

public class ManejadorAgenda {
	private static final Scanner input = new Scanner(System.in);
	
	
	public static void inputNuevoContacto(){
		String name, celphone, city;
		
		System.out.println("Nuevo contacto");
		System.out.println("Ingrese nombre del contacto");
		name = input.nextLine();
		System.out.println("Ingrese el nomero de celular");
		celphone = input.nextLine();
		System.out.println("Ingrese en que ciudad vive el contacto");
		city = input.nextLine();
		
		Agenda.agregarContactos(name, celphone, city);
	}
	
}
