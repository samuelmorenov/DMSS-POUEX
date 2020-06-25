
import java.util.ArrayList;

/**clase acciones*/
public class Acciones {
	private String nombre;
	private ArrayList<Efectos> efectos = new ArrayList<Efectos>();
	

	public Acciones(String _nombre){
		nombre=_nombre;
	}
	

	public void realizarAccion(){
		System.out.println("Pou realiza la accion "+nombre+" y esto causa: ");
		for (int i = 0; i < efectos.size(); i++) {
			efectos.get(i).realizarEfecto();
		}
	}

	public void anhadirEfecto(Efectos e) {
		efectos.add(e);
		
	}

	public String getNombre() {
		return nombre;
	}


	
}
