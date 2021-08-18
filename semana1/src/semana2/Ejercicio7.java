package semana2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int i;
		double precio,cantidad,subtotal,total,contador;
		total=0;
		contador=0;
		int seguir;
		
		do{
			
		//cuerpo del ciclo
		System.out.println("Digite el precio del producto");
		precio=entrada.nextDouble();
		
		System.out.println("Digite la cantidad del producto");
		cantidad=entrada.nextDouble();
		
		subtotal=precio*cantidad;
		
		System.out.println("El subtotal de la compra es "+subtotal);
		
		total=total+subtotal;
		contador=contador+1;
		
		System.out.println("Para ingresar otro producto digite 1 para salir 2");
		seguir=entrada.nextInt();
		
		}while(seguir!=2);
		
		System.out.println("El total de la compra es "+total);
	}

}
