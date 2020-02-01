package Pruebas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Holabb extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmEmpleado;
	private JMenuItem mntmCliente;
	private JMenuItem mntmSalir;

	public Holabb() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setTitle("ELSAPITO");
		
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
}
