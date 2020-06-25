import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel PanelAccion;
	private JPanel PanelEstados;
	private JPanel PanelFoto;
	private JPanel PanelConsola;
	private ArrayList<Acciones> acciones;
	private static ArrayList<Estados> estados;
	private static ArrayList<Caracteristicas> caracteristicas;
	private ScheduledExecutorService hiloTiempo;
	private String gameOver;
	public Interfaz(String _nombre, ArrayList<Acciones> _acciones,
			ArrayList<Estados> _estados,
			ArrayList<Caracteristicas> _caracteristicas) {

		acciones = _acciones;
		estados = _estados;
		caracteristicas = _caracteristicas;
		setTitle("POUEx " + _nombre); // Titulo de la ventana
		setBounds(0, 0, 750, 750); // Tamanho de la ventana
		setVisible(true); // Hacemos que la ventana sea visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Al cerrar la ventana se cierra el programa

		Container contenedor = getContentPane(); // Inicializacion del panel de contenido

		PanelFoto = new JPanel();
		PanelConsola = new JPanel();
		PanelAccion = new JPanel();
		PanelEstados = new JPanel();

		contenedor.add(PanelFoto, BorderLayout.NORTH);
		contenedor.add(PanelConsola, BorderLayout.SOUTH);
		contenedor.add(PanelAccion, BorderLayout.CENTER);
		contenedor.add(PanelEstados, BorderLayout.WEST);

		inicializarPanelFoto();
		inicializarPanelConsola();
		inicializarPanelAccion();
		inicializarPanelEstados();
		paintComponents(getGraphics());
	}

	private void inicializarPanelFoto() {
		JPanel panelImagen = new JPanel();
		panelImagen.setBounds(0, 0, 200, 200);
		JLabel imagen = new JLabel(new ImageIcon("pictures/POUX.gif"));
		panelImagen.add(imagen);
		PanelFoto.add(panelImagen);
	}

	private void inicializarPanelConsola() {
		// JLabel consola = new JLabel("Consola");
		// PanelConsola.add(consola);
	}

	private void inicializarPanelAccion() {
		// Separamos el panel izquierdo en 3
		int numCeldas;
		
		/** numCeldasSinAcciones */
		int n = 4;
		numCeldas = acciones.size() + n;
		PanelAccion.setLayout(new GridLayout(numCeldas, 1));

		JLabel Acciones = new JLabel("Acciones");
		Font fuente = new Font("Arial", Font.BOLD, 20);
		Map atributos = fuente.getAttributes();
		atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Acciones.setFont(fuente.deriveFont(atributos));
		Acciones.setHorizontalAlignment(SwingConstants.CENTER);// Esto pone el texto centrado
		PanelAccion.add(Acciones);

		for (int i = 0; i < numCeldas - n; i++) {
			// Aqui comprobamos que la nueva accion no es tiempo, de ser asi
			// creamos la accion especial tiempo.
			if (acciones.get(i).getNombre() != "Tiempo" && acciones.get(i).getNombre() != "tiempo") {
				Boton_Accion _Acciones = new Boton_Accion(acciones.get(i));
				_Acciones.addActionListener(this);
				PanelAccion.add(_Acciones);
			} else {
				crearAccionTiempo(acciones.get(i));
			}
		}
		
		
		inicializarPanelGuardado(PanelAccion);
	}
	@SuppressWarnings("unchecked")
	private void inicializarPanelGuardado(JPanel PanelGuardado){
		//Escribir guardado
		
		JLabel GuardarPartida = new JLabel("Guardar partida: ");
			Font fuente = new Font("Arial", Font.BOLD, 20);
			Map atributos = fuente.getAttributes();
			atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			GuardarPartida.setFont(fuente.deriveFont(atributos));
			GuardarPartida.setHorizontalAlignment(SwingConstants.CENTER);// Esto pone el texto centrado
		PanelGuardado.add(GuardarPartida);
		
		//Boton de Save
		@SuppressWarnings("serial")
		class Boton_Save extends JButton implements ActionListener {

			public Boton_Save(String nombre) {
				super(nombre);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				ObjectOutputStream archivo = null;
				
				try {
					archivo = new ObjectOutputStream(new FileOutputStream("saves/pouex.save"));
					
					try {
						archivo.writeObject(estados);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						archivo.writeObject(caracteristicas);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						archivo.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					System.out.println("Archivo creado con exito.");
					
					
				} catch (FileNotFoundException e1) {
					System.out.println("No se ha encontrado el directorio para guardar el archivo.");
					System.out.println("Por favor, cree la carpeta ''saves'' en el directorio del juego.");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				

			}
		}
		Boton_Save Save = new Boton_Save("Guardar");
		Save.addActionListener(Save);
		PanelAccion.add(Save);
		
		
		
		//Boton de Load
		@SuppressWarnings("serial")
		class Boton_Load extends JButton implements ActionListener {

			public Boton_Load(String nombre) {
				super(nombre);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
	

				ArrayList<Estados> auxE = null;
				ArrayList<Caracteristicas> auxC = null;
				ObjectInputStream ficharoLectura = null;
				
				try {
					ficharoLectura = new ObjectInputStream(new FileInputStream("saves/pouex.save"));
					

					
					try {
						auxE = (ArrayList<Estados>) ficharoLectura.readObject();
					} catch (ClassNotFoundException e3) {
						e3.printStackTrace();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						auxC = (ArrayList<Caracteristicas>) ficharoLectura.readObject();
					} catch (ClassNotFoundException e2) {
						e2.printStackTrace();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						ficharoLectura.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

					
					
					
					if(auxE != null && auxC != null){
						ponerEstadosYCaracteristicas(auxE, auxC);
						System.out.println("Archivo cargado con exito.");
					}else System.out.println("Error al cargar el fichero");

					
					mostrarCambiosEstados();
					
					
				} catch (FileNotFoundException e4) {
					System.out.println("No se ha encontrado el archivo de guardado.");
				} catch (IOException e4) {
					e4.printStackTrace();
				}
			}
		}
		Boton_Load Load = new Boton_Load("Cargar");
		Load.addActionListener(Load);
		PanelAccion.add(Load);
		
	}
	private void ponerEstadosYCaracteristicas(ArrayList<Estados> _E, ArrayList<Caracteristicas> _C){
		for (int i = 0; i < _E.size(); i++) {
			boolean estado = _E.get(i).getEstado();
			estados.get(i).setEstado(estado);
		}
		for (int i = 0; i < _C.size(); i++) {
			int valor = _C.get(i).getValor();
			caracteristicas.get(i).setValor(valor);
		}		
	}
	

	@SuppressWarnings("unchecked")
	private void inicializarPanelEstados() {
		int numCeldas;
		int numEstados;
		int numCaract;
		numEstados = estados.size();
		numCaract = caracteristicas.size();
		numCeldas = numCaract + numEstados + 2;

		PanelEstados.setLayout(new GridLayout(numCeldas, 1));

		JLabel Estados = new JLabel("Estados: "); // Texto estado subrayado y en negrita
		Font fuente = new Font("Arial", Font.BOLD, 20);
		Map atributos = fuente.getAttributes();
		atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Estados.setFont(fuente.deriveFont(atributos));

		PanelEstados.add(Estados);
		for (int i = 0; i < numEstados; i++) {
			JLabel _Estados;
			if (estados.get(i).getEstado()) {
				_Estados = new JLabel("        " + "Esta "
						+ estados.get(i).getNombre() + "        ");
			} else {
				_Estados = new JLabel("        " + "No esta "
						+ estados.get(i).getNombre() + "        ");
			}
			PanelEstados.add(_Estados);
		}

		JLabel Caract = new JLabel("Caracteristicas: ");
		Caract.setFont(fuente.deriveFont(atributos));

		PanelEstados.add(Caract);
		for (int i = 0; i < numCaract; i++) {
			JLabel _Caract = new JLabel("        "
					+ caracteristicas.get(i).getNombre() + ": "
					+ caracteristicas.get(i).getValor());
			PanelEstados.add(_Caract);
		}

	}

	private void crearAccionTiempo(Acciones _ATiempo) {
		final Acciones ATiempo = _ATiempo;
		Runnable helloRunnable = new Runnable() {
			public void run() {
				ATiempo.realizarAccion();
				mostrarCambiosEstados();
			}
		};

		hiloTiempo = Executors.newScheduledThreadPool(1);
		hiloTiempo.scheduleAtFixedRate(helloRunnable, 15, 15, TimeUnit.SECONDS);//TODO cambiar el tiempo
		;
	}


	private void mostrarCambiosEstados() {
		PanelEstados.removeAll();
		inicializarPanelEstados();
		paintComponents(getGraphics());

		String causa = hayEstadoCritico();
		if (causa != null) {
			InterfazMuerte X = new InterfazMuerte(causa);
			mostrarMascota();
			this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Al cerrar la  ventana NO se cierra el programa
			this.hide();
			this.hiloTiempo.shutdown();
		}

	}
	private void mostrarMascota() {
		System.out.println("Caracteristicas: ");
		for (int i = 0; i < caracteristicas.size(); i++) {
			System.out.print("    ");
			caracteristicas.get(i).mostrar();
		}
		System.out.println("Estados: ");
		for (int i = 0; i < estados.size(); i++) {
			System.out.print("    ");
			estados.get(i).mostrar();
		}
	}
	private static String hayEstadoCritico() {
		for (int i = 0; i < estados.size(); i++) {
			if (estados.get(i) instanceof Criticos) {
				boolean activo = estados.get(i).getEstado();
				boolean beneficioso = estados.get(i).getBeneficioso();
				String nombre = estados.get(i).getNombre();
				if (!activo && beneficioso) {
					return "no esta " + nombre;
				}
				if (activo && !beneficioso) {
					return "esta " + nombre;
				}
			}
		}
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		Boton_Accion aux = (Boton_Accion) evento.getSource();
		aux.accionar();
		mostrarCambiosEstados();

	}
}
