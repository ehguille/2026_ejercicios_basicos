
public class CuentaCorriente {
	
	private int saldo;
	
	public CuentaCorriente() {
		saldo=0;
	}
	
	public void ingresar(int cantidad) {
		saldo=saldo+cantidad;
	}
	
	public void retirar(int cantidad) {
		saldo=saldo-cantidad;
	}
	
	public int getSaldo() {
		return saldo; 
	}

}
