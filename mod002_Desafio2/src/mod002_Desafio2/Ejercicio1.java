package mod002_Desafio2;

import java.util.Scanner;

/*generar un programa que permita al usuario ingresar
por consola en la misma línea el primer nombre y
primer apellido y realice las siguientes operaciones:

1. Mostrar el nombre y apellido por separado.

2. Mostrar las iniciales en mayúsculas.*/

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		System.out.println("ingrese nombre y Apellido: ");
		String nom;
		String apell;
		nom= name.next();
		apell= name.nextLine();
		System.out.println("ingreso como nombre: "+ nom);
		System.out.println("ingreso como apellido: "+ apell);
		System.out.println("iniciales en mayuscula "+ nom.toUpperCase().charAt(0) +" "+ apell.toUpperCase().charAt(1));
		name.close();
	}

}
