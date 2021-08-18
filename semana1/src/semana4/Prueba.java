package semana4;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar la clase animal
		Scanner entrada=new Scanner(System.in); 
		//Animal tigre=new Animal("Tony",5);
		/*
		tigre.nombre="Tony";
		tigre.edad=5;
		
		System.out.println("El nombre del animal es "+tigre.nombre+" y su edad es "+tigre.edad);
		
		tigre.registrarAnimal();*/
		
		/*tigre.mostrarAnimal();
		Animal panda=new Animal();
		panda.mostrarAnimal("Bambú", 10);
		
		
		tigre.setEdad(12);
		System.out.println(tigre.getEdad());*/
		
		/*Calculadora resta=new Calculadora();
		
		System.out.println("Ingrese un número");
		int n1=entrada.nextInt();
		
		System.out.println("Ingrese otro número");
		int n2=entrada.nextInt();
	
		
		int resultado=resta.restar(n1,n2);
		
		System.out.println("El resultado de la operación es "+resultado);	*/
		
		
		System.out.println("Ingrese el nombre del animal");
		String nombre=entrada.nextLine();
		
		System.out.println("Ingrese la edad de animal");
		int edad=entrada.nextInt();
		
		System.out.println("Ingrese la envergadura del animal");
		float env=entrada.nextFloat();
		
		Ave condor=new Ave(nombre,edad,env);
		condor.mostrarAnimal();
		
		
		
		
	}

}
