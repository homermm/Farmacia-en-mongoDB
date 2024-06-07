package modelos;

public class Cliente {
	private int idCliente;
	private String nombre;
    private String apellido;
    private String dni;
    private Domicilio domicilio;
    private ObraSocial obraSocial;
    private String numeroAfiliado;
    
	public Cliente(int idCliente, String nombre, String apellido, String dni, Domicilio domicilio,
			ObraSocial obraSocial, String numeroAfiliado) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
		this.numeroAfiliado = numeroAfiliado;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	public String getNumeroAfiliado() {
		return numeroAfiliado;
	}
	public void setNumeroAfiliado(String numeroAfiliado) {
		this.numeroAfiliado = numeroAfiliado;
	}
    
	
    
    
}
