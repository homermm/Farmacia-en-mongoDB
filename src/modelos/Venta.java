package modelos;

import java.time.LocalDateTime;
import java.util.List;

public class Venta {
	private int idVenta;
    private String fecha;
    private String numeroTicket;
    private double total;
    private String formaPago; // Efectivo, Tarjeta, Débito
    private Cliente cliente;
    private Empleado empleadoVendedor;
    private Empleado empleadoCajero;
    private Sucursal sucursal;
    private List<ProductoVenta> productosVendidos;
	
	public Venta(int idVenta, String fecha, String numeroTicket, String formaPago, Cliente cliente,
			Empleado empleadoVendedor, Empleado empleadoCajero, Sucursal sucursal,
			List<ProductoVenta> productosVendidos) {
		super();
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.numeroTicket = numeroTicket;
//		this.total = total;
		this.formaPago = formaPago;
		this.cliente = cliente;
		this.empleadoVendedor = empleadoVendedor;
		this.empleadoCajero = empleadoCajero;
		this.sucursal = sucursal;
		this.productosVendidos = productosVendidos;
		setTotal(calcularTotal());
	}
	
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNumeroTicket() {
		return numeroTicket;
	}
	public void setNumeroTicket(String numeroTicket) {
		this.numeroTicket = numeroTicket;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Empleado getEmpleadoVendedor() {
		return empleadoVendedor;
	}
	public void setEmpleadoVendedor(Empleado empleadoVendedor) {
		this.empleadoVendedor = empleadoVendedor;
	}
	public Empleado getEmpleadoCajero() {
		return empleadoCajero;
	}
	public void setEmpleadoCajero(Empleado empleadoCajero) {
		this.empleadoCajero = empleadoCajero;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public List<ProductoVenta> getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(List<ProductoVenta> productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
    public double calcularTotal() {
    	double total = 0;
    	for (ProductoVenta p : productosVendidos) {
    		total += p.getTotal();
    	}
    	return total;
    }
    
}
