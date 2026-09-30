
public class Arquero {
	
	private int puntosVida;
	private String nombre;
	
	public Arquero(String nombre) {
		System.out.println("Se crea al arquero "+nombre);
		this.nombre=nombre;
		puntosVida=150;
	}
	
	public void atacar(Mago m, int dano) {
		System.out.println(nombre+" ataca al mago "+m.getNombre()+" con "+dano+" puntos de daño");
		m.bajarVida(dano);
		//Tiene que bajar la vida del mago
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
