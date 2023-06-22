package diaTrece;

import java.util.Scanner;

public class TresEnteros {
	
	public static int valorUno() {
		Scanner dato = new Scanner(System.in);
		int valor1;
		
		System.out.print("Por favor ingrese el primer valor: ");
		valor1 = dato.nextInt();
		
		dato.close();
		
		return valor1;
		
	}
	//valor dos
	
	public static int valorDos() {
		Scanner dato = new Scanner(System.in);
		int valor2;
		
		System.out.print("Por favor ingrese el segundo valor: ");
		valor2 = dato.nextInt();
		
		dato.close();
		
		return valor2;
		
	}
	
	// valor tres
	
	public static int valorTres() {
		Scanner dato = new Scanner(System.in);
		int valor3;
		
		System.out.print("Por favor ingrese el tercer valor: ");
		valor3 = dato.nextInt();
		
		dato.close();
		
		return valor3;
		
	}
	
	//tercero
	
	public static void main(String[] args) {
		
		int num1 = valorUno();
		int num2 = valorDos();
		int num3 = valorTres();
		
		int producto = num1 * num2 * num3;
		
		System.out.print("El producto de los numeros es: " + producto);
		
		
	}

}
