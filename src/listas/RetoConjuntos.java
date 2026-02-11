package listas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RetoConjuntos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		Set<Integer> lista = new HashSet<Integer>(); 
		
		System.out.println("Introduzca los números: ");
		num = sc.nextInt(); 
		
		while(!(lista.contains(num))) {
			lista.add(num); 
			num = sc.nextInt();
		}
		
		System.out.print("Los números introducidos son: ");
		for (Integer numero : lista) {
			System.out.print(numero + " ");
		}
		
		
		
		
		
		
	}
}
