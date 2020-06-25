import java.io.Serializable;

public class Estados implements Serializable{

	private String nombre;
	private boolean estado;
	private boolean beneficioso;
	
	public Estados(String _nombre, boolean _beneficioso, boolean _estado) {
		beneficioso=_beneficioso;
		nombre=_nombre;
		estado=_estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public boolean getBeneficioso() {
		return beneficioso;
	}
	public void setBeneficioso(boolean beneficioso) {
		this.beneficioso = beneficioso;
	}
	public void mostrar() {
		if(estado) System.out.println("Esta "+nombre+".");
		else System.out.println("No esta "+nombre+".");
	}
	public void activar() {
		estado = true;
		
	}
	public void desactivar() {
		estado = false;
		
	}
}
