import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Agenda {
    
	private static ArrayList<Contacto> contactos;
	
	
	public static void archivo(){
		
		File archivo;
		PrintWriter pw;
		try {
			archivo = new File("AgendaContactos.txt");
			pw = new PrintWriter(archivo, "UTF-8");
			pw.println("Hola!");
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
		
	} 
	
	
}
