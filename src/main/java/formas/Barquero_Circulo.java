package formas;

/**
 * @author cristian.barquero
 * @version 1.0
 */


/**
 *Esta clase permite que creemos nuestro circulo con los atributos que deseemos  
 */


//test merge
public class Barquero_Circulo {
	private int Id;
	private String Nombre;
	private double Radio;
	private String Color;
	
	
	public Barquero_Circulo() {
		super();
	}

	/**
	 * @param id  de la figura printea id en numeros
	 * @param nombre de la figura printea nombre con texto
	 * @param radio de la figura printea radio en centimetros
	 * @param color color de la figura printea color con nombre del color
	 */
	//Constructor por defecto con todos los atributos
	public Barquero_Circulo(int id, String nombre, double radio, String color) {
		super();
		Id = id;
		Nombre = nombre;
		Radio = radio;
		Color = color;
	}
//constructor por defecto sin id
	public Barquero_Circulo(String nombre, double radio, String color) {
		super();
		Nombre = nombre;
		Radio = radio;
		Color = color;
	}

	public int getId() {
		return Id;
	}
//commit para limpiar la branchd
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

	/**
	 * @return Id, Nombre, Radio, Color
	 */
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
