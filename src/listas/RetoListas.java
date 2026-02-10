package listas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RetoListas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> listaNombres; 
		
		System.out.print("Introduzca una lista de nombre con espacios: ");
		String [] nombres;
		nombres = sc.nextLine().split(" ");
		
		listaNombres = Arrays.asList(nombres); 
		
		System.out.print("Introduce un nombre a buscar: ");
		String nombreBuscado = sc.next(); 
		
		if(listaNombres.contains(nombreBuscado)) {
			System.out.printf("El nombre está en la posición: %s%n", 
					listaNombres.indexOf(nombreBuscado));
		} else {
			System.out.println("El nombre no está en la lista");
		}
		
		
		
		
		
	}
}