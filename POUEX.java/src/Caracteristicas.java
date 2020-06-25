import java.io.Serializable;
import java.util.ArrayList;

/**clase catacteristicas*/
public class Caracteristicas implements Serializable{
	
	private String nombre;
	private int valor;
	private int valoxMax;
	private boolean Beneficioso;
	private ArrayList<Transiciones> transiciones = new ArrayList<Transiciones>();
	
	public Caracteristicas(String _nombre, boolean _beneficioso, int _valor, int _max) {
		nombre=_nombre;
		valor=_valor;
		valoxMax=_max;
		Beneficioso=_beneficioso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValoxMax() {
		return valoxMax;
	}

	public void setValoxMax(int valoxMax) {
		this.valoxMax = valoxMax;
	}


	public void anhadirTransicion(Transiciones cambioSucio) {
		transiciones.add(cambioSucio);
		
	}
	public void mostrar() {
		System.out.println(nombre+": "+valor);
	}

	/**
	 * Este metodo sirve para poner todos los estados acorde a las caracteristicas
	 */
	public void ejecutarTodasLasTransiciones() {

		for (int i = 0; i < transiciones.size(); i++) {
			int valorCambio = transiciones.get(i).getValorCambio();
			boolean caract = Beneficioso;
			boolean estado = transiciones.get(i).getEstadoBeneficioso();
			boolean nuevoEstado = false;
			if (valor > valorCambio) {
				if (caract && estado) {
					nuevoEstado = true;
				}
				if (caract && !estado) {
					nuevoEstado = false;
				}
				if (!caract && estado) {
					nuevoEstado = false;
				}
				if (!caract && !estado) {
					nuevoEstado = true;
				}
			} else {
				if (caract && estado) {
					nuevoEstado = false;
				}
				if (caract && !estado) {
					nuevoEstado = true;
				}
				if (!caract && estado) {
					nuevoEstado = true;
				}
				if (!caract && !estado) {
					nuevoEstado = false;
				}
			}
			transiciones.get(i).forzarTransicion(nuevoEstado);
		}
	}


	public void comprobarTransiciones(int valorAnterior, int valorNuevo){
		
		for (int i = 0; i < transiciones.size(); i++) {
			int valorCambio = transiciones.get(i).getValorCambio();
			boolean caract = Beneficioso;
			boolean estado = transiciones.get(i).getEstadoBeneficioso();
			boolean nuevoEstado = false;
			if(hayTransicion(valorAnterior, valorNuevo, valorCambio)){
				if(valorNuevo>valorCambio){
					if(caract && estado) nuevoEstado=true;
					if(caract && !estado)nuevoEstado=false;
					if(!caract && estado)nuevoEstado=false;
					if(!caract && !estado)nuevoEstado=true;
				}
				else{
					if(caract && estado)nuevoEstado=false;
					if(caract && !estado)nuevoEstado=true;
					if(!caract && estado)nuevoEstado=true;
					if(!caract && !estado)nuevoEstado=false;
				}

				transiciones.get(i).causarTransicion(nuevoEstado);
			}
		}
	}

	private boolean hayTransicion(int anterior, int nuevo, int cambio) {
		boolean hay = false;
		if(anterior> cambio && nuevo==cambio)hay=true;
		if(anterior<=cambio && nuevo> cambio)hay=true;
		/*
		//Explicacion:
		if(anterior>cambio){
			if(nuevo==cambio)hay=true;
			if(nuevo>cambio)hay=false;
			if(nuevo<cambio)hay=false;
		}
		if(anterior<cambio){
			if(nuevo==cambio)hay=false;
			if(nuevo>cambio)hay=true;
			if(nuevo<cambio)hay=false;
			
		}
		if(anterior==cambio){
			if(nuevo==cambio)hay=false;
			if(nuevo>cambio)hay=true;
			if(nuevo<cambio)hay=false;
		}
		*/
		return hay;
	}
}
