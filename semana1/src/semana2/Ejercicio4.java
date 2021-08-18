package semana2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Condición compuesta
		
		Scanner lectura=new Scanner(System.in);
		
		/* Solicitar edad de una persona menor edad 0 a 17
		 * 18 a 40 años es un adulto
		 * 40 y 65 te estás haciendo viejo
		 * >65 tercera edad 
		 */
		
		System.out.println("Ingrese su edad");
		
		int edad=lectura.nextInt();
		/*if(edad<0) {
			System.out.println("La edad digitada no es válida");
		}*/
		if(edad>=0 && edad<=17) {
			System.out.println("Usted es menor de edad");
		}
		else if(edad>=18 && edad<=40) {
			System.out.println("Usted es un adulto");
		}
		
		else if(edad>40 && edad<=65) {
			System.out.println("Usted se está haciendo viejito");
		}
		else if(edad>65) {
			System.out.println("Usted se de la tercera edad");
		}
		else {
			System.out.println("La edad digitada no es válida");
		}
		
		
		
		
	}

}
