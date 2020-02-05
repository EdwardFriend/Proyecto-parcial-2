package escuchadores;
import ventanas.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AccionPrincipal implements ActionListener{
	private VentanaPrincipal win1;


	public AccionPrincipal(VentanaPrincipal win1) {
		this.win1=win1;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==win1.getMntmEmpleado()) {
			new EditarTabla(win1).setVisible(true);
			return;
		}
		if(e.getSource() == win1.getMntmSalir()){
			win1.setVisible(false);
			win1.dispose();
		}
		
	}
}
