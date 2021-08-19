package semana5;

import java.util.*;

public class Carisellazo implements Juego {
	
	private int moneda;
	private String jugador;
	private int eleccion;
	
	Scanner entrada=new Scanner(System.in);

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el nombre del jugador");
		jugador=entrada.next();
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		Random aleatorio=new Random();
		moneda=aleatorio.nextInt(2)+1;
		System.out.println(jugador+ "La moneda est� girando que quieres elegir 1. Cara 2. Sello");
		eleccion=entrada.nextInt();
	}

	@Override
	public void finalizar() {
		// TODO Auto-generated method stub
		if(moneda==1 && eleccion==1) {
			System.out.println("Cay� Cara, usted escogi� Cara y GANASTE "+jugador);
		}
		else if(moneda==2 && eleccion==2) {
			System.out.println("Cay� Sello, usted escogi� Sello y GANASTE "+jugador);
		}
		else if(moneda==1 && eleccion==2) {
			System.out.println("Cay� Cara, usted escogi� Sello y PERDISTE "+jugador);
		}
		else if(moneda==2 && eleccion==1) {
			System.out.println("Cay� Sello, usted escogi� Cara y PERDISTE "+jugador);
		}
	}

}
