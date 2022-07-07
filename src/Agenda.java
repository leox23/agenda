import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Agenda {
    
	private static ArrayList<Contacto> contactos;
	
	public static void agregarContactos(String name, String celphone, String city){
		
		leerContactos();
		int nextId =    contactos.size();
		contactos.add( new Contacto(String.valueOf(nextId), name, celphone, city));
		escribirContactos();
		
	}
	
	public static void escribirContactos(){
		File archivo;
		PrintWriter pw;
		try {
			archivo = new File("AgendaContactos.txt");
			pw = new PrintWriter(archivo, "UTF-8");
			
			for (Contacto i : contactos) {
				pw.println(i.getId() + "," + i.getName() + "," + i.getCelphone() + "," + i.getCity());
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void leerContactos(){
		
		contactos = new ArrayList<Contacto>();
		File archivo;
		FileReader fr;
		BufferedReader br;
		try{
			archivo = new File("AgendaContactos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String lineaArchivo;
			while((lineaArchivo = br.readLine()) != null ){
				String [] contacto = lineaArchivo.split(",");
				contactos.add(new Contacto(contacto[0],contacto[1],contacto[2],contacto[3]));
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void imprimirContactos(){
		leerContactos();
		for(Contacto con : contactos){
			System.out.println(con.toString());
		}
		System.out.println();
		
	}
	
	public static void eliminarContacto(String id){
		leerContactos();
		try{
			Contacto f = contactos.remove(Integer.parseInt(id));
			indexarContactos();
			escribirContactos();
			
		}catch(IndexOutOfBoundsException e){
			System.out.println("No existe ID en la agenda");
		}
		
	}
	
	public static void indexarContactos(){
		
		int index = 0;
		for(Contacto c : contactos){
			c.setId(String.valueOf(index));
			index += 1;
		}
	}
	
	
	public static void modificarContacto(String id, Contacto contactoMod){
		
		leerContactos();
		for (Contacto i : contactos) {
			if (i.getId().equals(id)) {
			System.out.println("hola desde el if");
				String name = contactoMod.getName();
				if (name != "") {
					i.setName(contactoMod.getName());
				}
				

				String celphone = contactoMod.getCelphone();
				if (celphone != "") {
					i.setCelphone(contactoMod.getCelphone());
				}

				String city = contactoMod.getCity();
				if (name != "") {
					i.setCity(contactoMod.getCity());
				}
				break;
			}
		}
		escribirContactos();
		
	}
	
	
	
}
