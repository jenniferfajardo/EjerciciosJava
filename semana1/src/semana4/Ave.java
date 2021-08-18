package semana4;

public class Ave extends Animal {
	
	//atributo
	
	private float envergadura;

	public Ave() {
		
		// TODO Auto-generated constructor stub
	}

	public Ave(String nombre, int edad,float envergadura) {
		super(nombre, edad);
		this.envergadura=envergadura;
		// TODO Auto-generated constructor stub
	}
	
	
	public void mostrarAnimal() {
		System.out.println("El nombre del animal es "+getNombre()+ " y la edad es "+getEdad()+" y su envergadura es "+envergadura);
	}


	
	//constructor de una subclase
	
	

}
