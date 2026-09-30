
public class Mago {
	
	private int puntosVida;
	private String nombre;
	
	public Mago(String nombre) {
		System.out.println("Se crea al mago "+nombre);
		this.nombre=nombre;
		puntosVida=100;
	}
	
	public void atacar(Arquero a, int dano) {
		System.out.println("El mago "+nombre+" ataca al arquero "+a.getNombre()+" con "+dano+" puntos de daño");
		a.bajarVida(dano);
	}
	
	public int consultarPuntosVida() {
		return puntosVida;
	}
	
	public void bajarVida(int dano) {
		System.out.println("La vida de "+nombre+" baja "+dano+" puntos");
		puntosVida=puntosVida-dano;
	}
	
	public String getNombre() {
		return nombre;
	}

}
