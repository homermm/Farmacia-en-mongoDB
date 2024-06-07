package modelos;

public class Producto {
	private int idProducto;
    private String tipo; // Medicamento o Perfumería
    private String descripcion;
    private String laboratorio;
    private int codigoNumerico;
    private double precio;
	public Producto(int idProducto, String tipo, String descripcion, String laboratorio, int codigoNumerico,
			double precio) {
		super();
		this.idProducto = idProducto;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.codigoNumerico = codigoNumerico;
		this.precio = precio;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public int getCodigoNumerico() {
		return codigoNumerico;
	}
	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
    
}
