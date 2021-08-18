package semana3;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		//Declarar un array
		
		//Declarando el vector
		int []vector1= {30,50,25,85,12,6,32,41,23,63};
		//Declarar un objeto del tipo array
		//vector1=new int[10];
		
		//Método en una sola
		int []vector2=new int[10];
		
		String []vector3=new String[15];
		
		//rellenar manualmente las posiciones de un vector
		//vector1[3]=85;
		//System.out.println("La posición 3 del array es "+vector1[3]);
		
		//inicializar vector desde su declaración;
		
	/*	for(int p=0;p<vector2.length;p++) {
			System.out.println("Digite la posición "+p+" del vector");
			vector2[p]=entrada.nextInt();
			
		}
		
		for(int p=0;p<10;p++) {
	
			System.out.println("El elemento ingresado en la posición "+p+" del vector es "+vector2[p]);
		}
		
		
		System.out.println("Ingrese una cantidad de notas");
		int c=entrada.nextInt();
		float notas[]=new float[c];
		*/
		//for mejorado
		
		for(int dato:vector1) {
			System.out.println(dato);
		}
		
		
		

	}

}
