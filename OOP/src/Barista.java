
public class Barista {
	private String name;
	private char gender;
	
	public Barista() {
		this.name = "";
		this.gender = ' ';
	}
	public Barista(String name,char gender) {
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getgenderName() {
		return (gender+"").equalsIgnoreCase("m")? "Male" :
			(gender+"").equalsIgnoreCase("f") ? "Female":" " ;
	}
}
