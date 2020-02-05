package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class VentanaPrincipal extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmEmpleado;
	private JMenuItem mntmCliente;
	private JMenuItem mntmSalir;

	public VentanaPrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 450, 300);
		
		setTitle("Sistema");
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmEmpleado = new JMenuItem("Empleado");
		mnArchivo.add(mntmEmpleado);
		
		mntmCliente = new JMenuItem("Cliente");
		mnArchivo.add(mntmCliente);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JMenu getMnArchivo() {
		return mnArchivo;
	}

	public void setMnArchivo(JMenu mnArchivo) {
		this.mnArchivo = mnArchivo;
	}

	public JMenuItem getMntmEmpleado() {
		return mntmEmpleado;
	}

	public void setMntmEmpleado(JMenuItem mntmEmpleado) {
		this.mntmEmpleado = mntmEmpleado;
	}

	public JMenuItem getMntmCliente() {
		return mntmCliente;
	}

	public void setMntmCliente(JMenuItem mntmCliente) {
		this.mntmCliente = mntmCliente;
	}

	public JMenuItem getMntmSalir() {
		return mntmSalir;
	}

	public void setMntmSalir(JMenuItem mntmSalir) {
		this.mntmSalir = mntmSalir;
	}
}
