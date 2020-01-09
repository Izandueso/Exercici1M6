import java.io.*;
import java.util.Scanner;

public class Exercici1M6 {
	 public static void main(String [] args) throws FileNotFoundException {
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Introdueix el directori o fitxer que vols consultar:");
		 String fichero = teclado.nextLine();
		 File fitxer = new File(fichero);
		 Scanner scan = new Scanner(fitxer);
		 
		 if (fitxer.exists()){
			 if(fitxer.isDirectory()){
				 System.out.println("Fitxers al directori actual: ");
				 File f = new File(".");
				 String[] arxius = f.list();
				 for (int i = 0; i<arxius.length; i++){
					 System.out.println(arxius[i]);
				 }
			 }else if(fitxer.isFile()){
				 System.out.println("INFORMACIÓ SOBRE EL FITXER");
				 File f = new File("javi");
				 if(f.exists()){
					 System.out.println("Nom del fitxer : "+f.getName());
					 System.out.println("Ruta           : "+f.getPath());
					 System.out.println("Ruta absoluta  : "+f.getAbsolutePath());
					 System.out.println("Es pot escriure: "+f.canRead());
					 System.out.println("Es pot llegir  : "+f.canWrite());
					 System.out.println("Grandaria      : "+f.length());
					 System.out.println("Es un directori: "+f.isDirectory());
					 System.out.println("Es un fitxer   : "+f.isFile());
				 }
			 }
		 }
		  	 
	 }

}