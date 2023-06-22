package diaTrece;

import java.util.Scanner;

public class Operaciones {
	
	public static void main(String[] args) {
		
		
        
        double resultado1 = operacion1();
        System.out.println("Resultado de la expresión 1: " + resultado1);

       
        
        
        double resultado2 = operacion2();
        System.out.println("Resultado de la expresión 2: " + resultado2);

        
        
       
        double resultado3 = operacion3();
        System.out.println("Resultado de la expresión 3: " + resultado3);

        
        
        
        double resultado4 = operacion4();
        System.out.println("Resultado de la expresión 4: " + resultado4);
    }

	//metodo1
	
    public static double operacion1() {
    	Scanner dato = new Scanner(System.in);
    	
    	System.out.println("Los datos que ingrese seguiran este orden de operaciones: -n,+n,/n ");
    	
    	System.out.print("Por favor ingrese el primer valor: ");
    	double num1 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el segundo valor: ");
    	double num2 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el tercer valor: ");
    	double num3 = dato.nextDouble();
    	
    	
    	
        double resultado = -num1 + num2 / num3;
        
        dato.close();
        
        return resultado;
    }

//metodo 2
    
    public static double operacion2() {
    	
    	Scanner dato = new Scanner(System.in);
    	
    	System.out.println("Los datos que ingrese seguiran este orden de operaciones: (n-n)%n ");
    	
    	System.out.print("Por favor ingrese el primer valor: ");
    	double num1 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el segundo valor: ");
    	double num2 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el tercer valor: ");
    	double num3 = dato.nextDouble();
    			
    			
        double resultado = (num1 - num2) % num3;
        
        dato.close();
        
        return resultado;
    }
                                        //Metodo 3
    
    public static double operacion3() {
    	
    	Scanner dato = new Scanner(System.in);
    	
    	System.out.println("Los datos que ingrese seguiran este orden de operaciones: (n+n)/(n-n) ");
    	
    	System.out.print("Por favor ingrese el primer valor: ");
    	double num1 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el segundo valor: ");
    	double num2 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el tercer valor: ");
    	double num3 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el  cuarto valor: ");
    	double num4 = dato.nextDouble();
    	
    	
        double resultado = (num1 + num2) / (num3 - num4);
        
        dato.close();
        return resultado;
    }

                             // ultimo 
    
    public static double operacion4() {
    	
Scanner dato = new Scanner(System.in);
    	
System.out.println("Los datos que ingrese seguiran este orden de operaciones: n-n/n*n+n%n ");

    	System.out.print("Por favor ingrese el primer valor: ");
    	double num1 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el segundo valor: ");
    	double num2 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el tercer valor: ");
    	double num3 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el cuarto valor: ");
    	double num4 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el quinto valor: ");
    	double num5 = dato.nextDouble();
    	
    	System.out.print("Por favor ingrese el sexto valor: ");
    	double num6 = dato.nextDouble();
    	
        double resultado = num1 - num2 / num3 * num4 + num5 % num6;
        
        dato.close();
        
        return resultado;
    }
}


