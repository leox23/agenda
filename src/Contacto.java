
public class Contacto {
	
	private String id;
	private String name;
	private String celphone;
	private String city;
	
	public Contacto(String id,String name,String celphone, String city){
		
		this.id = id;
		this.name = name;
		this.celphone = celphone;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", name=" + name + ", celphone=" + celphone + ", city=" + city + "]";
	}
	
	
	
	

}
