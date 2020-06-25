
import java.util.ArrayList;
import java.util.Scanner;
public class Mascota {
	private String nombre;
	private boolean finDelJuego = false;
	private static ArrayList<Acciones> acciones = new ArrayList<Acciones>();
	private static ArrayList<Estados> estados = new ArrayList<Estados>();
	private static ArrayList<Caracteristicas> caracteristicas = new ArrayList<Caracteristicas>();

	public Mascota(String _nombre) {
		nombre = _nombre;
	}

	public static Mascota crearMascota() {
		// Creacion de Mascota
		Mascota M = new Mascota("Pou");

		// Creacion de estados
		Estados Muerte = new Criticos("Muerte", false, false);
		M.anhadirEstado(Muerte);
		Estados TristezaExtrema = new Criticos("TristezaExtrema", false, false);
		M.anhadirEstado(TristezaExtrema);
		Estados Feliz = new Normales("Feliz", true, false);
		M.anhadirEstado(Feliz);
		Estados Limpio = new Normales("Limpio", true, false);
		M.anhadirEstado(Limpio);
		Estados Gordo = new Normales("Gordo", false, false);
		M.anhadirEstado(Gordo);
		Estados Triste = new Normales("Triste", false, false);
		M.anhadirEstado(Triste);
		Estados Sucio = new Normales("Sucio", false, false);
		M.anhadirEstado(Sucio);
		Estados Cansado = new Normales("Cansado", false, false);
		M.anhadirEstado(Cansado);
		Estados Descansado = new Normales("Descansado", true, false);
		M.anhadirEstado(Descansado);
		Estados NoHambriento = new Normales("NoHambriento", true, false);
		M.anhadirEstado(NoHambriento);
		Estados Hambriento = new Normales("Hambriento", false, false);
		M.anhadirEstado(Hambriento);
		Estados Delgado = new Normales("Delgado", true, false);
		M.anhadirEstado(Delgado);

		// Creacion de Caracteristicas
		Caracteristicas Felicidad = new Emocionales("Felicidad", true, 4, 10);
			Transiciones TransTristezaEx = new Transiciones("TransTristezaEx", 0, TristezaExtrema);
			Felicidad.anhadirTransicion(TransTristezaEx);
			Transiciones TransFeliz = new Transiciones("TransFeliz", 7, Feliz);
			Felicidad.anhadirTransicion(TransFeliz);
			Transiciones TransTriste = new Transiciones("TransTriste", 3, Triste);
			Felicidad.anhadirTransicion(TransTriste);
		M.anhadirCaracteristica(Felicidad);	
		Caracteristicas Suciedad = new Fisicas("Suciedad", false, 4, 10);
			Transiciones TransSuciMuerto = new Transiciones("TransSuciMuerto", 9, Muerte);
			Suciedad.anhadirTransicion(TransSuciMuerto);
			Transiciones TranSuciLimpio = new Transiciones("TranSuciLimpio", 6, Limpio);
			Suciedad.anhadirTransicion(TranSuciLimpio);
			Transiciones TransSuciSuci = new Transiciones("TransSuciSuci", 3, Sucio);
			Suciedad.anhadirTransicion(TransSuciSuci);
		M.anhadirCaracteristica(Suciedad);	
		Caracteristicas MasaCorporal = new Fisicas("MasaCorporal", false, 4, 10);
			Transiciones TransMuerteMasa = new Transiciones("TransMuerteMasa", 9, Muerte);
			MasaCorporal.anhadirTransicion(TransMuerteMasa);
			Transiciones TranGordo = new Transiciones("TranGordo", 6, Gordo);
			MasaCorporal.anhadirTransicion(TranGordo);
			Transiciones TransMasaDelgado = new Transiciones("TransMasaDelgado", 3, Delgado);
			MasaCorporal.anhadirTransicion(TransMasaDelgado);
		M.anhadirCaracteristica(MasaCorporal);	
		Caracteristicas Cansancio = new Emocionales("Cansancio", false, 4, 10);
			Transiciones TranCansancioMuerte = new Transiciones("TranCansancioMuerte", 9, Muerte);
			Cansancio.anhadirTransicion(TranCansancioMuerte);
			Transiciones TransCansancioCansado = new Transiciones("TransCansancioCansado", 6, Cansado);
			Cansancio.anhadirTransicion(TransCansancioCansado);
			Transiciones TransCansadoDescansado = new Transiciones("TransCansadoDescansado", 3, Descansado);
			Cansancio.anhadirTransicion(TransCansadoDescansado);
		M.anhadirCaracteristica(Cansancio);	
		Caracteristicas Hambre = new Emocionales("Hambre", false, 4, 10);
			Transiciones TranHambreMuerto = new Transiciones("TranHambreMuerto", 9, Muerte);
			Hambre.anhadirTransicion(TranHambreMuerto);
			Transiciones TranHambreNoHambre = new Transiciones("TranHambreNoHambre", 3, NoHambriento);
			Hambre.anhadirTransicion(TranHambreNoHambre);
			Transiciones TransHambreHambriento = new Transiciones("TransHambreHambriento", 6, Hambriento);
			Hambre.anhadirTransicion(TransHambreHambriento);
		M.anhadirCaracteristica(Hambre);	

		// Creacion de Acciones
		Acciones Tiempo = new Acciones("Tiempo");
			Efectos MenosFelTiempo = new Efectos("MenosFelTiempo", -1, Felicidad);
			Tiempo.anhadirEfecto(MenosFelTiempo);
			Efectos MasCansancioTiempo = new Efectos("MasCansancioTiempo", -1, Cansancio);
			Tiempo.anhadirEfecto(MasCansancioTiempo);
			Efectos MasHambreTiempo = new Efectos("MasHambreTiempo", 1, Hambre);
			Tiempo.anhadirEfecto(MasHambreTiempo);
			Efectos MasSuciTiempo = new Efectos("MasSuciTiempo", 1, Suciedad);
			Tiempo.anhadirEfecto(MasSuciTiempo);
		M.anhadirAccion(Tiempo);
		Acciones Jugar = new Acciones("Jugar");
			Efectos MasFelJugar = new Efectos("MasFelJugar", 2, Felicidad);
			Jugar.anhadirEfecto(MasFelJugar);
			Efectos MenosMasaJugar = new Efectos("MenosMasaJugar", -1, MasaCorporal);
			Jugar.anhadirEfecto(MenosMasaJugar);
			Efectos MasCansanciojUGAR = new Efectos("MasCansanciojUGAR", 2, Cansancio);
			Jugar.anhadirEfecto(MasCansanciojUGAR);
			Efectos MasHambreJugar = new Efectos("MasHambreJugar", 1, Hambre);
			Jugar.anhadirEfecto(MasHambreJugar);
		M.anhadirAccion(Jugar);
		Acciones Comer = new Acciones("Comer");
			Efectos MenoHambreComer = new Efectos("MenoHambreComer", -3, Hambre);
			Comer.anhadirEfecto(MenoHambreComer);
			Efectos MasMasaComer = new Efectos("MasMasaComer", 2, MasaCorporal);
			Comer.anhadirEfecto(MasMasaComer);
			Efectos MasSuciComer = new Efectos("MasSuciComer", 1, Suciedad);
			Comer.anhadirEfecto(MasSuciComer);
			Efectos MasFelComer = new Efectos("MasFelComer", 1, Felicidad);
			Comer.anhadirEfecto(MasFelComer);
		M.anhadirAccion(Comer);
		Acciones Limpiar = new Acciones("Limpiar");
			Efectos MenosFelLimpiar = new Efectos("MenosFelLimpiar", -1, Felicidad);
			Limpiar.anhadirEfecto(MenosFelLimpiar);
			Efectos MenosSuciLimpiar = new Efectos("MenosSuciLimpiar", -3, Suciedad);
			Limpiar.anhadirEfecto(MenosSuciLimpiar);
			Efectos MasHambreLimpiar = new Efectos("MasHambreLimpiar", 1, Hambre);
			Limpiar.anhadirEfecto(MasHambreLimpiar);
			Efectos MasCansancioLimpiar = new Efectos("MasCansancioLimpiar", 1, Cansancio);
			Limpiar.anhadirEfecto(MasCansancioLimpiar);
		M.anhadirAccion(Limpiar);
		Acciones Dormir = new Acciones("Dormir");
			Efectos MasHambreDormir = new Efectos("MasHambreDormir", 1, Hambre);
			Dormir.anhadirEfecto(MasHambreDormir);
			Efectos MenosCansancioDormir = new Efectos("MenosCansancioDormir", -3, Cansancio);
			Dormir.anhadirEfecto(MenosCansancioDormir);
			Efectos MasSuciDormir = new Efectos("MasSuciDormir", 1, Suciedad);
			Dormir.anhadirEfecto(MasSuciDormir);
		M.anhadirAccion(Dormir);
		Acciones HacerEjercicio = new Acciones("HacerEjercicio");
			Efectos EfectHacerEjerMasaCorpo = new Efectos("EfectHacerEjerMasaCorpo", -3, MasaCorporal);
			HacerEjercicio.anhadirEfecto(EfectHacerEjerMasaCorpo);
			Efectos EfectHacerEjerFelicidad = new Efectos("EfectHacerEjerFelicidad", -2, Felicidad);
			HacerEjercicio.anhadirEfecto(EfectHacerEjerFelicidad);
			Efectos EfectHacerEjerSuciedad = new Efectos("EfectHacerEjerSuciedad", 1, Suciedad);
			HacerEjercicio.anhadirEfecto(EfectHacerEjerSuciedad);
			Efectos EfectHacerEjerHambre = new Efectos("EfectHacerEjerHambre", 1, Hambre);
			HacerEjercicio.anhadirEfecto(EfectHacerEjerHambre);
			Efectos EfectHacerEjercicioCansancio = new Efectos("EfectHacerEjercicioCansancio", 1, Cansancio);
			HacerEjercicio.anhadirEfecto(EfectHacerEjercicioCansancio);
		M.anhadirAccion(HacerEjercicio);

		M.igualarEstadosCaracteristicas();

		return M;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<Acciones> getAcciones() {
		return acciones;
	}

	public static void setAcciones(ArrayList<Acciones> acciones) {
		Mascota.acciones = acciones;
	}

	public static ArrayList<Estados> getEstados() {
		return estados;
	}

	public static void setEstados(ArrayList<Estados> estados) {
		Mascota.estados = estados;
	}

	public static ArrayList<Caracteristicas> getCaracteristicas() {
		return caracteristicas;
	}

	public static void setCaracteristicas(
			ArrayList<Caracteristicas> caracteristicas) {
		Mascota.caracteristicas = caracteristicas;
	}

	public void anhadirAccion(Acciones _A) {
		acciones.add(_A);
	}

	public void anhadirCaracteristica(Caracteristicas _C) {
		caracteristicas.add(_C);

	}

	public void anhadirEstado(Estados _E) {
		estados.add(_E);

	}

	public void igualarEstadosCaracteristicas() {
		for (int i = 0; i < caracteristicas.size(); i++) {
			caracteristicas.get(i).ejecutarTodasLasTransiciones();
		}

	}

	public void ejecutarInterfazGrafica(){
		Interfaz I = new Interfaz(getNombre(), getAcciones(), getEstados(), getCaracteristicas());
	}
	

	public static void main(String [] args) {
		Mascota M = crearMascota();
		M.ejecutarInterfazGrafica();
	}
}
