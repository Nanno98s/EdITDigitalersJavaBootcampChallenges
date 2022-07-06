package mod003_Desafio3;

/*Dado el siguiente código:
int nro1 = 100, nro2 = 500, nro3 = 250;
Informar cuál de los tres números
es mayor*/


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nro1 = 100, nro2 = 500, nro3 = 250;
		
		if (nro1 > nro2 & nro1 > nro3) {
			System.out.println("el numero "+nro1+" es mayor que "+nro2+" y "+nro3);
		}
		if (nro2 > nro1 & nro2 > nro3) {
			System.out.println("el numero "+nro2+" es mayor que "+nro1+" y "+nro3);
		}
		if (nro3 > nro2 & nro3 > nro1) {
			System.out.println("el numero "+nro3+" es mayor que "+nro2+" y "+nro1);
		}

	}

}
