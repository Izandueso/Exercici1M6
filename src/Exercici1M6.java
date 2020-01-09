import java.io.*;
import java.util.Scanner;

public class Exercici1M6 {
	 public static void main(String [] args) throws FileNotFoundException {
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Introdueix el directori o fitxer que vols consultar:");
		  
		 String fichero = teclado.nextLine();
		 File f = new File(fichero);
		 
		 if (f.exists()){
			 if(f.isDirectory()){
				 System.out.println("Fitxers al directori actual: ");
				 String[] arxius = f.list();
				 for (int i = 0; i<arxius.length; i++){
					 if (f.isHidden()){
						 System.out.println("Esta ocult: " + arxius[i]);
					 }
					 System.out.println(arxius[i]);
				 }
			 }else if(f.isFile()){
				 System.out.println("INFORMACIÓ SOBRE EL FITXER");
				 if(f.exists()){
					 if (f.isHidden()){
						 System.out.println("Ocult: " + f.getName());
					 }
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