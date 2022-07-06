package mod002_Desafio2;
import java.util.Scanner;

/*Realizar un programa que permita al usuario ingresar
por consola dos números y realice las siguientes
operaciones:

1. El usuario debe poder ingresar la cantidad de
decimales que desea ver en el resultado.

2. Sacar la potencia de los números ingresados.*/

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner consola = new Scanner(System.in);
		float num1,num2;
		int decimales;
		double potencia;
		System.out.println("Ingrese primer numero: ");
		num1=consola.nextFloat();
		System.out.println("Ingrese segundo numero: ");
		num2=consola.nextFloat();
		System.out.println("Ingrese cantidad de decimales que desea: ");
		decimales=consola.nextInt();
		potencia=Math.pow(num1, num2);
		System.out.println(String.format(
				"La potencia con " + decimales + " decimales es: %." + decimales + "f ", potencia));
		consola.close();

	}

}
