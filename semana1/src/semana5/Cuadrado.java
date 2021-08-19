package semana5;

public class Cuadrado extends Figura{

	private float lado; //por defecto

	public Cuadrado() {
		
	}
	public Cuadrado(float lado) {
	
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		float area=lado*lado;
		System.out.println("El área del cuadrado de lado "+lado+" es "+area);
	}
	
}
