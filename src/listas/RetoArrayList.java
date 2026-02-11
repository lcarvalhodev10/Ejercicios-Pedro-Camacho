package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetoArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> valores = new ArrayList<>(); 
		
		System.out.print("Introduzca el número inicial: ");
		int numInicial = sc.nextInt();
		
		System.out.print("Introduzca el número final: ");  
		int numFinal = sc.nextInt(); 
		
		for (int i = numInicial; i <= numFinal; i++){
			valores.add(i); 
		}
		
		System.out.println(valores);
		
		System.out.println("Múltiplos a localizar: ");
		int multi = sc.nextInt(); 
		
		for (int i = 0; i < valores.size(); i++){
			if(!(valores.get(i) % multi == 0)) {
				valores.set(i, 0); 
			}
		}
		
		System.out.print(valores);
		
		
		
		
		
		
		
		
	}
}
