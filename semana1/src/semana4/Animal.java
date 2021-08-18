package semana4;

import java.util.Scanner;

public class Animal {

	//Atributos
	
	private String nombre;
	private int edad;
	
	//Método Constructor
	public Animal() {
		
	}
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Métodos accesores
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Operaciones
	
	public void registrarAnimal(){
		Scanner entrada=new Scanner(System.in); 
		
		System.out.println("Ingresa el nombre del animal");
		nombre=entrada.nextLine();
		
		System.out.println("Ingresa la edad del animal");
		edad=entrada.nextInt();
	}
	


	public void mostrarAnimal() {
		System.out.println("El animal ingresado es "+nombre+" y su edad es "+edad);
	}
	
	public void mostrarAnimal(String nom,int e) {
		System.out.println("El animal ingresado es "+nombre+" y su edad es "+edad+"Por el método sobrecargado");
	}
	
	
	
}
