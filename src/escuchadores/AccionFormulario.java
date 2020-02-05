package escuchadores;
import ventanas.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AccionFormulario implements ActionListener{
	private Formulario win3;
	public AccionFormulario(Formulario win3) {
		this.win3=win3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==win3.getBtnGuardar()) {
			String nombre = win3.getTxtNombre().getText();
			String apellido = win3.getTxtApellido().getText();
			String cedula = win3.getTxtCedula().getText();
			String edad = win3.getTxtEdad().getText();
			String direccion = win3.getTxtDireccion().getText();
			boolean supervisor = win3.getCheck1().isSelected();
			
			win3.getTxtNombre().setText(" ");
			win3.getTxtNombre().requestFocus();
			win3.getTxtApellido().setText(" ");
			win3.getTxtApellido().requestFocus();
			win3.getTxtCedula().setText(" ");
			win3.getTxtCedula().requestFocus();
			win3.getTxtDireccion().setText(" ");
			win3.getTxtDireccion().requestFocus();
			win3.getCheck1().setSelected(false);
			win3.getCheck1().requestFocus();
		}
		if(e.getSource()==win3.getBtnCancelar()) {
			win3.setVisible(false);
			win3.dispose();
		}
	}
}
