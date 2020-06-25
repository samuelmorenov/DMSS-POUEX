import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Boton_Accion extends JButton implements ActionListener {
	Acciones A;

	public Boton_Accion(Acciones _A) {
		super(_A.getNombre());
		A = _A;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		A.realizarAccion();
	}

	public void accionar() {
		A.realizarAccion();
	}
}
