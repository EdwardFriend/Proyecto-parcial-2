package clases;
/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Empleado extends Persona{
	private double sueldo_bruto;
	private Empresa miEmpresa;
	public Empleado() {
		super();
	}
	public Empleado(String nombre,int edad, double sueldo_bruto) {
		super(nombre,edad);
		this.sueldo_bruto=sueldo_bruto;
	}
	public Empresa getMiEmpresa() {
		return miEmpresa;
	}
	public void setoEmpresa(Empresa miEmpresa) {
		this.miEmpresa = miEmpresa;
	}

	public double getSueldo_bruto() {
		return sueldo_bruto;
	}
	public void setSueldo_bruto(double sueldo_bruto) {
		this.sueldo_bruto = sueldo_bruto;
	}
	@Override
	public void mostrar() {
		System.out.println("Nombre: "+getNombre()+
				           "\nEdad: "+getEdad()+
				           "\nSueldo Bruto: "+this.sueldo_bruto);
	}
	public double calcular_salario_neto() {
		return 0;
	}
}
