package formas;

/**
 * @author cristian.barquero
 * @version 1.0
 */
/**
 * Esta clase nos permite crear nuestros rectangulos con las caracteristicas que deseemos entre los atributos disponibles
 */

/**
 * 
 */
public class Barquero_Rectangulo {
	private int Id;
	private double LadoA;
	private double LadoB;
	private String Color;
	
	
	
public Barquero_Rectangulo() {
		super();
	}
	
	

	/**
	 * @param id printea id de la figura en numeros
	 * @param ladoA printea longitud ladoA de la figura en centimetros
	 * @param ladoB printea longitud ladoB de la figura en centimetros
	 * @param color printea color de la figura dando el nombre del color
	 */
	public Barquero_Rectangulo(int id, double ladoA, double ladoB, String color) {
		super();
		Id = id;
		LadoA = ladoA;
		LadoB = ladoB;
		Color = color;
	}


	public Barquero_Rectangulo(double ladoA, double ladoB, String color) {
		super();
		LadoA = ladoA;
		LadoB = ladoB;
		Color = color;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public double getLadoA() {
		return LadoA;
	}



	public void setLadoA(double ladoA) {
		LadoA = ladoA;
	}



	public double getLadoB() {
		return LadoB;
	}



	public void setLadoB(double ladoB) {
		LadoB = ladoB;
	}



	public String getColor() {
		return Color;
	}



	public void setColor(String color) {
		Color = color;
	}


	/**
	 * @return Id, LadoA, LadoB, Color
	 */
	@Override
	public String toString() {
		return "Barquero_Rectangulo [Id=" + Id + ", LadoA=" + LadoA + ", LadoB=" + LadoB + ", Color=" + Color + "]";
	}
	
	
	//Metodos main //Area Cuadrado: 9.0
	//Cuadrado: Barquero_Rectangulo [Id=3, LadoA=3.0, LadoB=3.0, Color=rojo]
	//Diferencia areas: -0.41999999999999993
	//Diferencia:-0.41999999999999993
	
	
	
}
