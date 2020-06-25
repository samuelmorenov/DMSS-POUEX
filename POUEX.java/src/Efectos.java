public class Efectos{
	private String nombre;
	private int valorModifica;
	private Caracteristicas caracteristicaModificada;

	public Efectos(String _nombre, int _valor, Caracteristicas _caracteristicas) {
		nombre=_nombre;
		valorModifica=_valor;
		caracteristicaModificada=_caracteristicas;
	}
	

	public void realizarEfecto() {

		
		int valorAnterior = caracteristicaModificada.getValor();
		int valorMax = caracteristicaModificada.getValoxMax();
		int valorNuevo = valorAnterior+valorModifica;
		
		if(valorNuevo > valorMax)valorNuevo=valorMax;
		if(valorNuevo < 0)valorNuevo=0;
		
		caracteristicaModificada.setValor(valorNuevo);
		System.out.println(caracteristicaModificada.getNombre()+" modificada de "+valorAnterior+ " a "+valorNuevo);
		caracteristicaModificada.comprobarTransiciones(valorAnterior, valorNuevo);
	}
}
