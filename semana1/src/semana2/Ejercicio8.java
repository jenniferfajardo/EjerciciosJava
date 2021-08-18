package semana2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		double dinero,alcancia=0;
		char op;
		do {
		
		System.out.println("Ingrese el dinero");
		dinero=entrada.nextDouble();
		
		entrada.nextLine();
		alcancia=alcancia+dinero;
		
		System.out.println("Si desea ingresar más dinero a la alcancía digite S para terinar digite N");
		op=entrada.nextLine().charAt(0);
		
		
		}while(op=='S' || op=='s');
		
		System.out.println("Usted ha ahorrado un total de "+alcancia);
		

	}

}
