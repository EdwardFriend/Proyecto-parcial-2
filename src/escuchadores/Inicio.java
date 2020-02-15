package escuchadores;
import ventanas.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Inicio implements ActionListener{
	private CrearEmpresa init;


	public Inicio(CrearEmpresa init) {
		this.init=init;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==init.getBut1()) {
			String empresa = init.getTex1().getText();
			//int pag = Integer.parseInt(init.getTex2().getText());
			VentanaPrincipal win1 = new VentanaPrincipal(empresa);
			win1.setVisible(true);
			return;
		}
		if(e.getSource() == init.getBut2()){
			init.setVisible(false);
			init.dispose();
		}
		
	}
}

