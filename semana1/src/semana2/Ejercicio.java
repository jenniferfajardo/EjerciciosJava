package semana2;

import java.util.*;
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		double radio,perimetro,lado,base,altura,a,b,c;
		final double pi=3.14;
		int op;
		int salir=1;
		while(salir!=0) {
			
		
		System.out.println("Bienvenido seleccione una figura y le dir� su per�metro");
		System.out.println("1. Circulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Rect�ngulo");
		System.out.println("4. Tri�ngulo");
		
		System.out.println("Seleccione una opci�n del men�");
		op=entrada.nextInt();
		
				
		switch(op) {
		case 1:
			System.out.println("Digite el valor del radio");
			radio=entrada.nextDouble();
			perimetro=2*pi*radio;
			System.out.println("El per�metro del circulo de radio "+radio+" es "+perimetro);
		break;
		
		case 2:
			System.out.println("Digite el valor del lado");
			lado=entrada.nextDouble();
			perimetro=4*lado;
			System.out.println("El per�metro del cuadrado de lado "+lado+" es "+perimetro);
		break;
		
		case 3:
			System.out.println("Digite el valor de la base");
			base=entrada.nextDouble();
			System.out.println("Digite el valor de la altura");
			altura=entrada.nextDouble();
			perimetro=2*base + 2*altura;
			System.out.println("El per�metro del rect�ngulo de base "+base+" y de altura "+altura+" es "+perimetro);
		break;
		
		case 4:
			System.out.println("Digite el valor del lado 1");
			a=entrada.nextDouble();
			System.out.println("Digite el valor del lado 2");
			b=entrada.nextDouble();
			System.out.println("Digite el valor del lado 3");
			c=entrada.nextDouble();
			perimetro=a+b+c;
			System.out.println("El per�metro del tri�ngulo es "+perimetro);
		break;
		
		
		}
		
		System.out.println("Desea escoger otra figura digite 1");
		salir=entrada.nextInt();
		
		if(salir==1) {
			continue;
		}
		else {
			System.out.println("Se termin� la ejecuci�n");
			break;
		}
		}
		
	}

}
