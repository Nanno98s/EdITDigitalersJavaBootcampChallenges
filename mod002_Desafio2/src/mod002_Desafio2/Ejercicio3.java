package mod002_Desafio2;

import java.util.Scanner;

/*Se pide que ingrese por consola dos letras y realice
la siguiente operación:

1. Mostrar la representación ASCII de las letras en
minúsculas y mayúsculas.*/

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		String letra1;
		String letra2;
		char carac1;
		char carac2;
		int ascii1;
		int ascii2;
		System.out.println("ingrese primera letra: ");
		letra1=consola.next();
		System.out.println("ingrese segunda letra: ");
		letra2=consola.next();
		
		carac1=letra1.toLowerCase().charAt(0);
		ascii1=carac1;
		carac2=letra2.toLowerCase().charAt(0);
		ascii2=carac2;
		
		System.out.println("La letra minuscula de " + carac1 + " en ascii es " + ascii1);
		System.out.println("La letra minuscula de " + carac2 + " en ascii es " + ascii2);
		
		carac1=letra1.toUpperCase().charAt(0);
		ascii1=carac1;
		carac2=letra2.toUpperCase().charAt(0);
		ascii2=carac2;
		
		System.out.println("La letra mayuscula de " + carac1 + " en ascii es " + ascii1);
		System.out.println("La letra mayuscula de " + carac2 + " en ascii es " + ascii2);
		consola.close();
	}

}
