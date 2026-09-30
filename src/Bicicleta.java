
public class Bicicleta {
	
	private int velocidad;
	
	public Bicicleta() {
		velocidad=0;
	}
	
	public void acelerar() {
		velocidad=velocidad+1;
	}
	
	public void frenar() {
		velocidad=velocidad-1;
	}
	
	public void imprimirVelocidad() {
		System.out.println("Velocidad: "+velocidad);
	}
	
	public int getVelocidad() {
		return velocidad;
	}

}
