package escuchadores;
import ventanas.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AccionEditar implements ActionListener{
	private EditarTabla win2;
	public AccionEditar(EditarTabla win2) {
		this.win2=win2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==win2.getBtnAgregar()) {
			new Formulario(win2).setVisible(true);
		}
		if(e.getSource()==win2.getBtnSalir()) {
			win2.setVisible(false);
			win2.dispose();
		}
	}
}
