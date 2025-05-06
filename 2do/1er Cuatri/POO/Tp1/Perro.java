public class Perro {

	private String raza;
	private String nombre;
	private int edad;
	
	public Perro() {
		this("nn");
	}
	
	public Perro(String nombre) {
		this(nombre,"pp",1);
	}

	

	public Perro(String nombre, String raza, int edad) {
		this.setNombre(nombre);
		this.raza = raza;
		this.edad= edad;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nn) {
	if ((nn!=null)&&(nn.length()>0)) {	
		nombre = nn.toUpperCase();
	} else {
		nombre = "nn";
	}
	
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}
	
	
	
	
}
