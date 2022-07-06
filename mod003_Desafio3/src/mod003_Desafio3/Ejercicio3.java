package mod003_Desafio3;

/*Tomando el siguiente código:
String usuario = “Pepito”, clave= “1234”;

Informar los siguientes casos:

1. Si el usuario es ”pepito” y la clave es ”1234”
informar “¡Bienvenido pepito!”.

2. Si el usuario es ”pepito” y la clave no es
“1234” informar “Contraseña incorrecta”.

3. Si el usuario no es “pepito” y la clave es
“1234” informar “Usuario incorrecto”*/

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usuario ="Pepito", clave= "1234";
		
		if(usuario =="Pepito" & clave == "1234") {
			System.out.println("Bienvenido Pepito "); 
		}
		if(usuario =="Pepito" & clave != "1234") {
			System.out.println("Clave Incorrecta "); 
		}
		if(usuario !="Pepito" & clave == "1234") {
			System.out.println("Usuario Incorrecto "); 
		}
	}

}
