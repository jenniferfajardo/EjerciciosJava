package introduccion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DEFIINICI�N DE VARIABLES Y CONSTANTES
		int numero=25;
		double numerod=20.5;
		String nombre="Jennifer";
		boolean estado=true;
		
		final double PI=3.14;
		
		Scanner lectura=new Scanner(System.in);
		
		//SALIDA DE DATOS EN JAVA EN CONSOLA
		
		/*System.out.println("Hola mundo");
		
		System.out.println("El n�mero definido es "+numero);*/
		
		// ENTRADA DE DATOS
		
		System.out.println("Ingrese un n�mero");
		numero=lectura.nextInt();
		System.out.println("El n�mero ingresado es "+numero);
		
		lectura.nextLine();
		
		System.out.println("Ingrese su nombre");
		nombre=lectura.nextLine();
		System.out.println("El nombre ingresado es "+nombre);
		
		
		
		
		
		
		
		
		
		
		
	}

}
