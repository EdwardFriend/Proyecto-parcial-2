package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import escuchadores.AccionPrincipal;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class VentanaPrincipal extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmEmpleado;
	private JMenuItem editarTabla;
	private JMenuItem mntmCliente;
	private JMenuItem mntmSalir;

	public VentanaPrincipal(String nombreEmpresa) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 450, 300);
		
		setTitle(nombreEmpresa);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		editarTabla = new JMenuItem("Editar Tabla");
		editarTabla.addActionListener( new AccionPrincipal(this));
		mnArchivo.add(editarTabla);
		
		mntmEmpleado = new JMenuItem("Empleado");
		mntmEmpleado.addActionListener( new AccionPrincipal(this));
		mnArchivo.add(mntmEmpleado);
		
		mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener( new AccionPrincipal(this));
		mnArchivo.add(mntmCliente);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new AccionPrincipal(this));
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

	public JMenuItem getEditarTabla() {
		return editarTabla;
	}

	public void setEditarTabla(JMenuItem editarTabla) {
		this.editarTabla = editarTabla;
	}
}
