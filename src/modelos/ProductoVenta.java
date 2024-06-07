package modelos;

public class ProductoVenta {
	private int idProductoVendido;
    private Producto producto;
    private int cantidad;
    private double total;
	public ProductoVenta(int idProductoVendido, Producto producto, int cantidad) {
		super();
		this.idProductoVendido = idProductoVendido;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = calcularTotal();
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
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double calcularTotal() {
		return producto.getPrecio() * cantidad;
	}
}
