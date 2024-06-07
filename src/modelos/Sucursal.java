package modelos;

import java.util.List;

public class Sucursal {
	private int idSucursal;
    private Domicilio domicilio;
    private Empleado encargado;
    private List<Empleado> empleados;
    private String puntoVenta; // Identificador de 4 dígitos
	public Sucursal(int idSucursal, Domicilio domicilio, Empleado encargado, List<Empleado> empleados,
			String puntoVenta) {
		super();
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
		this.encargado = encargado;
		this.empleados = empleados;
		this.puntoVenta = puntoVenta;
	}
	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public Empleado getEncargado() {
		return encargado;
	}
	public void setEncargado(Empleado encargado) {
		this.encargado = encargado;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public String getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(String puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
    
    
}
