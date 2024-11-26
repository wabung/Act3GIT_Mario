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
		        
		        int menor = a < b ? a : b;
		        int mayor = a > b ? a : b;
		        
		        System.out.println("Números enteros entre " + menor + " y " + mayor + " incrementando de 7 en 7:");
		        for (int i = menor; i <= mayor; i += 7) {
		            System.out.println(i);
		        }
	}

}
