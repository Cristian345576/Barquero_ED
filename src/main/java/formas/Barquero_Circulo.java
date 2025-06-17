package formas;

public class Barquero_Circulo {
	private int Id;
	private String Nombre;
	private double Radio;
	private String Color;
	
	
	public Barquero_Circulo() {
		super();
	}

	public Barquero_Circulo(int id, String nombre, double radio, String color) {
		super();
		Id = id;
		Nombre = nombre;
		Radio = radio;
		Color = color;
	}

	public Barquero_Circulo(String nombre, double radio, String color) {
		super();
		Nombre = nombre;
		Radio = radio;
		Color = color;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getRadio() {
		return Radio;
	}

	public void setRadio(double radio) {
		Radio = radio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Barquero_Circulo [Id=" + Id + ", Nombre=" + Nombre + ", Radio=" + Radio + ", Color=" + Color + "]";
	}
	
	//Metodos Main
	//Circulo: Barquero_Circulo [Id=1, Nombre=circulo, Radio=3.0, Color=verde]
	//Area circulo:9.42
	//Diferencia areas: -0.41999999999999993
	//Diferencia:-0.41999999999999993

	
	

}
