package modelos;

public class Empleado {
	private int idEmpleado;
    private String apellido;
    private String nombre;
    private String dni;
    private String cuil;
    private Domicilio domicilio;
    private ObraSocial obraSocial;
    private String numeroAfiliado;
    
	public Empleado(int idEmpleado, String apellido, String nombre, String dni, String cuil, Domicilio domicilio,
			ObraSocial obraSocial, String numeroAfiliado) {
		super();
		this.idEmpleado = idEmpleado;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.cuil = cuil;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
		this.numeroAfiliado = numeroAfiliado;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
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
