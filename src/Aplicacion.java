
public class Aplicacion {

	public static void main(String[] args) {
	/*	Coche c=new Coche();
		Coche c2=new Coche();
		c.acelerar();
		c.imprimirVelocidad();
		c.frenar();
		c.imprimirVelocidad();
		c2.acelerar();
		c2.imprimirVelocidad();*/
		
		Mago m=new Mago("Merlín");
		Arquero a=new Arquero("Legolast");
		a.atacar(m, 10);
		m.atacar(a, 5);
		
		
	}

}
