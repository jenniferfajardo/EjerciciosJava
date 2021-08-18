package introduccion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		double radio,area;
		final double PI=3.14;
		
		System.out.println("Digite el radio");
		radio=entrada.nextDouble();
		
		area=PI*radio*radio;
		
		System.out.println("El círculo de radio "+radio+" tiene un área de "+area);

	}

}
