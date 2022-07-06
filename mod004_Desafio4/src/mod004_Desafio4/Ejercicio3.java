package mod004_Desafio4;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int sumpar=0;
		while (num <=25) {
			if (num%2==0) {
				sumpar=sumpar+num;
			}
		num++;	
		}
		System.out.println("La suma de pares del 1 al 25 es:" + sumpar);
	}

}
