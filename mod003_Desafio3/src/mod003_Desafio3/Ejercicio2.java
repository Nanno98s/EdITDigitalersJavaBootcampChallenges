package mod003_Desafio3;

/*int a = 10, b=-2, c=5;
hay 2 números positivos y 1 negativo
Informar la multiplicación de los dos
números positivos.*/


public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b=-2, c=5;
		int result;
		if(a>0 & b>0) {
			result=a*b;
			System.out.println("a x b = " + result); 
		}
		if(a>0 & c>0) {
			result=a*c;
			System.out.println("a x c = " + result); 
		}
		if(b>0 & c>0) {
			result=b*c;
			System.out.println("b x c = " + result); 
		}
	}

}
