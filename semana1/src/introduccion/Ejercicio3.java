package introduccion;
import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ingreso=new Scanner(System.in);
		
		int num1,num2,aleatorio;
	
		aleatorio=1+(int)(Math.random()*2);
		System.out.println("El número egenerado es "+aleatorio);
		System.out.println("Ingrese el primer número");
		num1=ingreso.nextInt();
		
		System.out.println("Ingrese el segundo número");
		num2=ingreso.nextInt();
		
		if(num1>num2) {
			// que la condición se cumpla
			
			System.out.println("El numero "+num1+" es mayor que el número "+num2);
		}
		else if(num2>num1){
			// condición no se cumple
			System.out.println("El numero "+num2+" es mayor que el número "+num1);
		}
		
		else if(num1==num2) {
			System.out.println("Los números son iguales");
		}
		
	}

}
