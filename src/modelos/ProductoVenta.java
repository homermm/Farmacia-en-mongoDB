package modelos;

public class ProductoVenta {
	private int idProductoVendido;
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private double total;
	public ProductoVenta(int idProductoVendido, Producto producto, int cantidad, double precioUnitario, double total) {
		super();
		this.idProductoVendido = idProductoVendido;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.total = total;
	}
	public int getIdProductoVendido() {
		return idProductoVendido;
	}
	public void setIdProductoVendido(int idProductoVendido) {
		this.idProductoVendido = idProductoVendido;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
    
}
