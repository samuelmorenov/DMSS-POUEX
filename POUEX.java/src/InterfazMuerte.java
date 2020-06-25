import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InterfazMuerte extends JFrame implements ActionListener{

	public InterfazMuerte(String causa) {
		setTitle("Fin del juego"); // Titulo de la ventana
		setBounds(0, 0, 400, 400); // Tamanho de la ventana
		setVisible(true); // Hacemos que la ventana sea visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al cerrar la ventana se cierra el programa

		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(2, 1));
		
		JPanel PanelFoto = new JPanel();
			JPanel panelImagen = new JPanel();
			panelImagen.setBounds(0, 0, 200, 200);
				JLabel imagen = new JLabel(new ImageIcon("pictures/POUX_Death.jpg"));
				panelImagen.add(imagen);
			PanelFoto.add(panelImagen);
		
		JPanel PanelTextoYBoton = new JPanel();
		PanelTextoYBoton.setLayout(new GridLayout(3, 1));
			JLabel texto = new JLabel("Tu mascota "+causa+" :(");
				texto.setHorizontalAlignment(SwingConstants.CENTER);
			JLabel texto2 = new JLabel("--GAME OVER--");
				texto2.setHorizontalAlignment(SwingConstants.CENTER);
			
			JButton X = new JButton("Cerrar el Juego.");
				X.addActionListener(this);
		
				PanelTextoYBoton.add(texto);
				PanelTextoYBoton.add(texto2);
				PanelTextoYBoton.add(X);
				
		contenedor.add(panelImagen);
		contenedor.add(PanelTextoYBoton);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); 
	}

}
