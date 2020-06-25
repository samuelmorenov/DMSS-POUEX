import java.io.Serializable;

public class Transiciones implements Serializable{


	private String nombre;
	/** El valor de cambio es el valor a partir del cual cambiaria
	 * es decir, si el valor del cambio es 10, de 0 a 10 seria un estado
	 * y de 11 en adelante otro*/
	private int valorCambio;
	private Estados estadoModificado;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** El valor de cambio es el valor a partir del cual cambiaria
	 * es decir, si el valor del cambio es 10, de 0 a 10 seria un estado
	 * y de 11 en adelante otro*/
	public int getValorCambio() {
		return valorCambio;
	}


	public void setValorCambio(int valorCambio) {
		this.valorCambio = valorCambio;
	}

	public Transiciones(String _nombre, int _valor, Estados _estado) {
		nombre=_nombre;
		valorCambio=_valor;
		estadoModificado=_estado;
	}


	public void forzarTransicion(boolean b){
		if(b) estadoModificado.activar();
		else estadoModificado.desactivar();
	}
	public void causarTransicion(boolean b) {
		if(b){
			estadoModificado.activar();
			System.out.println("La mascota ahora esta "+estadoModificado.getNombre());
		}
		else{
			estadoModificado.desactivar();
			System.out.println("La mascota ya no esta "+estadoModificado.getNombre());
		}
		
	}


	public boolean getEstadoBeneficioso() {
		return estadoModificado.getBeneficioso();
	}
}
