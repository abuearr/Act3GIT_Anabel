package Proyecto2_git;

import java.util.Scanner;

public class Proyecto2 {
	
	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int valor1 = Integer.parseInt(escaner.nextLine());
		
		System.out.println("Introduce el segundo número: ");
		int valor2 = Integer.parseInt(escaner.nextLine());
		
		System.out.println("Introduce el tercer número: ");
		int valor3 = Integer.parseInt(escaner.nextLine());
		
		escaner.close(); 
		
		if (valor1<valor2) {
			for (int i= valor1; i<valor2; i+=7) {  
				System.out.println(i);
			}
		if ((valor3>valor1) && (valor3<valor2)){
			System.out.println(valor3);
		}
		}
	}
}


