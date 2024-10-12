package clases;

public class Cliente {
		
	private String idcliente;
	private String cia;
	private String contacto;
	private String cargo;
	private String direccion;
	private String ciudad;
	private String region;
	private String cp;
	private String pais;
	private String tlf;
	private String fax;
	
	public Cliente (String idcliente, String cia, String contacto, String cargo, String direccion, String ciudad, String region, String cp, String pais, String tlf, String fax  ) {
		
		this.idcliente = idcliente;
		this.cia = cia;
		this.contacto = contacto;
		this.cargo = cargo;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.region = region;
		this.cp = cp;
		this.pais = pais;
		this.tlf = tlf;
		this.fax = fax;
		
		
	}

	public String getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	
	
}
