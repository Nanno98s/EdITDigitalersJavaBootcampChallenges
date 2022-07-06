package mod005_Desafio5;

/*Dado el vector {10,20,5,15,30,20}
1. Informar el vector de la forma:
"Índice: X, Valor: Y".
2. Totalizar el vector e informar el total.
3. Informar el contenido de las posiciones
impares (por ejemplo, posiciones 1,3,5, etc.)
4. Informar el mayor número.
5. Informar cuántas veces aparece el
número 20.*/


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec = {10,20,5,15,30,20};
		int total=0;
		int mayor=vec[0];
		int n=0;
		int cont=0;
		for(n = 0; n < vec.length; n++ ) {
			if (n%2==1) {
				System.out.println("posicion impar: "+ n +"su valor es;  "+ vec[n]);
			}
			if(vec[n]>mayor) {
				mayor=vec[n];
			
			}
			if(vec[n]==20) {
				cont++;
			total=total+vec[n];	
			}
		
		}
		System.out.println("el total es: "+total);
		System.out.println("el numero 20 aparece "+ cont +" veces");
		System.out.println("el numero mayor es: "+mayor);
	}

}
