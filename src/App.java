import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String opcion;
		boolean activo = true;
		System.out.println("------BIENVENIDO A LA AGENDA DE CONTACTOS PARA SOFKA U------ \n"
				+ "--Men� Principal \n");
		while(activo){
			System.out.println("Selecciona una opci�n digitando el n�mero para acceder a la opci�n que deseas: \n"
					+ "1. Listar todos los contactos registrados \n"
					+ "2. Agregar nuevo contacto \n"
					+ "3. Eliminar contacto por ID \n"
					+ "4. Modificar contacto por ID \n"
					+ "5. Salir del men� \n");
			opcion = entrada.nextLine();
			switch(opcion){
				case "1": 
					Agenda.imprimirContactos();
					break;
				case "2":
					ManejadorAgenda.inputNuevoContacto();
					break;
				case "3":
					ManejadorAgenda.inputEliminarContacto();
					break;
				case "4":
					ManejadorAgenda.inputModificarContacto();
					break;
				case "5":
					activo = false;
					break;
				default:
					System.out.println("Digita un caracter v�lido para acceder \n");
					
			}

		}
		entrada.close();
		System.out.println("\n---GRACIAS POR TU TIEMPO, �HASTA PRONTO!");
		
	}

}
