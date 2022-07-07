
public class Contacto {
	
	private String id;
	private String name;
	private String celphone;
	private String city;
	
	public Contacto(String id,String name,String celphone, String address){
		
		this.id = id;
		this.name = name;
		this.celphone = celphone;
		this.city = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCelphone() {
		return celphone;
	}

	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}

	public String getAddress() {
		return city;
	}

	public void setAddress(String address) {
		this.city = address;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", name=" + name + ", celphone=" + celphone + ", address=" + city + "]";
	}
	
	
	
	

}
