package semana2;

import java.util.*;
public class Ejercicio5 {
	
	//ESTRUCTURA CONDICIONAL MÚLTIPLE
	public static void main(String[] args) {
	
	Scanner lectura=new Scanner(System.in);
	
	double num1,num2,total;
	int op;
	
	System.out.println("Digite el número 1");
	num1=lectura.nextDouble();
	
	System.out.println("Digite el número 2");
	num2=lectura.nextDouble();
	
	System.out.println("Seleccione 1. Sumar 2. Restar");
	op=lectura.nextInt();
	
	switch(op) {
	
	case 1:
		total=num1+num2;
		System.out.println("La suma entre "+num1+" y "+num2+" es "+total);
		
	break;
	
	case 2:
		total=num1-num2;
		System.out.println("La resta entre "+num1+" y "+num2+" es "+total);
		
	break;
	
	default:
		System.out.println("La opción ingresada es válida");
	break;
	
	
	}
	}
}
