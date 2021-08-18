package semana2;

import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		//FOR
		/*int i;
		for(i=1;i<=4;i++) {
			//cuerpo del ciclo
			System.out.println("Repetición No "+i);
		}*/
		
		/*ACUMULADORES Y CONTADORES
		 * Son variables de proceso, numéricas
		 * Su valor es inicial es 0
		 * ACUMULADOR Aumenta su valor en un valor variable mientras que un contador trabaja con valores constantes
		 * Siempre están dentro de un ciclo
		 * */
		
		int i;
		double precio,cantidad,subtotal,total,contador;
		total=0;
		contador=0;
		for(i=1;i<=5;i++) {
			//cuerpo del ciclo
			System.out.println("Digite el precio del producto");
			precio=entrada.nextDouble();
			
			System.out.println("Digite la cantidad del producto");
			cantidad=entrada.nextDouble();
			
			subtotal=precio*cantidad;
			
			System.out.println("El subtotal de la compra es "+subtotal);
			
			total=total+subtotal;
			contador=contador+1;
			
			
			
		}
		
		System.out.println("El total de la compra es "+total);
		
		
		
		
		
		
		
	}
	
}
