package metodos;

import java.util.Scanner;

public class EnterosEntre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Introduce el primer número entero: ");
		        int a = scanner.nextInt();
		        
		        System.out.print("Introduce el segundo número entero: ");
		        int b = scanner.nextInt();
		        
		        if (a == b) {
		            System.out.println("Los números introducidos deben ser distintos.");
		            return;
		        }
		        
		        System.out.println("Introduce un tercer número y lo imprimiré si esta comprendido entre los dos anteriores.");
		        int c = scanner.nextInt();		        
		        
		        int menor = a < b ? a : b;
		        int mayor = a > b ? a : b;
		        
		        System.out.println("Números enteros entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
		        for (int i = menor; i <= mayor; i += 7) {
		            System.out.println(i);
		        }
		        
		        for (int i = a; i <= b; i += 1) {
		        	if (i == c) {
		        		System.out.println(c);
		        	}
		        }
	}

}
