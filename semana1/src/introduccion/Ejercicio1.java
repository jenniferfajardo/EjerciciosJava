package introduccion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DEFIINICIÓN DE VARIABLES Y CONSTANTES
		int numero=25;
		double numerod=20.5;
		String nombre="Jennifer";
		boolean estado=true;
		
		final double PI=3.14;
		
		Scanner lectura=new Scanner(System.in);
		
		//SALIDA DE DATOS EN JAVA EN CONSOLA
		
		/*System.out.println("Hola mundo");
		
		System.out.println("El número definido es "+numero);*/
		
		// ENTRADA DE DATOS
		
		System.out.println("Ingrese un número");
		numero=lectura.nextInt();
		System.out.println("El número ingresado es "+numero);
		
		lectura.nextLine();
		
		System.out.println("Ingrese su nombre");
		nombre=lectura.nextLine();
		System.out.println("El nombre ingresado es "+nombre);
		
		
		
		
		
		
		
		
		
		
		
	}

}
