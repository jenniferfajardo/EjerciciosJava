package semana5;

import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lado;
		
		/*Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese el lado del cuadrado");
		lado=entrada.nextFloat();
		
		Cuadrado c1=new Cuadrado(lado);
		c1.calcularArea();*/
		
		Carisellazo j1=new Carisellazo();
		
		j1.iniciar();
		j1.jugar();
		j1.finalizar();
	}

}
