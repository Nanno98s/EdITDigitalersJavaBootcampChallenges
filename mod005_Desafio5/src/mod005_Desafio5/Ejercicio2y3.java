package mod005_Desafio5;

//Ejercicio2

/*Considerar el vector de inflación:
{0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9}

Cada ítem del vector representa la inflación
de un mes, de tal manera que el primer ítem
del vector, que es 0.8, representa la inflación
de enero y el último ítem del vector, que es 0.9,
representa la inflación de diciembre.
Con estos datos, se pide:

1. Informar la inflación anual.

2. Informar la inflación más baja junto con el
número de mes. Por ejemplo: Mes 2 = 0.1

3. Informar la inflación más alta junto con el
número de mes. Por ejemplo: Mes 12 = 0.9

4. Informar el promedio de inflación
(inflación total / 2)*/

//Ejercicio 3

/*Agregar los cambios que resulten necesarios al
ejercicio anterior para que en los puntos B y C se
informe la inflación junto con el nombre del mes.*/

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vec= {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		String[] mes= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		String mesmin="",mesmax="";
		int n;
		double anual=0,infBaja=vec[0],infAlta=vec[0];
		for(n=0;n<vec.length;n++) {
		anual=anual+vec[n];
		  if(vec[n]<infBaja) {
		  infBaja=vec[n];
			mesmin=mes[n];
		}
		  if(vec[n]>infAlta) {
		  infAlta=vec[n];
			mesmax=mes[n];
		}
		
		}
		System.out.println("Inflacion Anual: " + anual);
		System.out.println("Promedio: " + anual/12 + "%");
		System.out.println("Minima inflacion: " + infBaja +"% mes:"+ mesmin);
		System.out.println("Maxima inflacion: " + infAlta +"% mes:"+ mesmax);
	}

}
