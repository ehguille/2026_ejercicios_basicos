
public class Coche {
	
	private int velocidad;
	
	public Coche() {
		System.out.println("Se crea un coche.");
		velocidad=0;
	}
	
	public void acelerar() {
		System.out.println("El coche acelera.");
		velocidad=velocidad+20;
	}
	
	public void frenar() {
		System.out.println("El coche frena.");
		velocidad=velocidad-20;
	}
	
	public void imprimirVelocidad() {
		System.out.println("Velocidad: "+velocidad);
	}
	
	public int getVelocidad() {
		return velocidad;
	}

}
