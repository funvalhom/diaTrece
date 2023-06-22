package diaTrece;

import java.util.Scanner;



public class Cociente {
	
	//primer metodo
	
	public static float numeroDado1() {
		Scanner dato = new Scanner(System.in);
		float num1;
		
		do {
			
			System.out.print(" Por favor ingrese el primer valor entre 3 y 17: ");
			num1 = dato.nextFloat();
			
				
		} while (num1 <3 || num1 > 17);
		
		dato.close();
		
		return num1;
	}
	//segundo metodo
	
	public static float numeroDado2() {
		Scanner dato = new Scanner(System.in);
		float num2;
		
		do {
			
			System.out.print(" Por favor ingrese el segundo valor entre 3 y 17: ");
			num2 = dato.nextFloat();
			
				
		} while (num2 <3 || num2 > 17);
		
		dato.close();
		
		return num2;
	}

	public static void main(String[] args) {
		float valor1 = numeroDado1();
		float valor2 = numeroDado2();
		
		float cociente = valor1 / valor2;
		
		System.out.print("El cociente es : " + cociente);
		
		
		
	
		
	
		
	}

}
