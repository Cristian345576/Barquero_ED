package formas;

public class Barquero_Rectangulo {
	private int Id;
	private double LadoA;
	private double LadoB;
	private String Color;
	
	
	
public Barquero_Rectangulo() {
		super();
	}
	
	

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



	@Override
	public String toString() {
		return "Barquero_Rectangulo [Id=" + Id + ", LadoA=" + LadoA + ", LadoB=" + LadoB + ", Color=" + Color + "]";
	}
	
	
	//Metodos main //Area Cuadrado: 9.0
	//Cuadrado: Barquero_Rectangulo [Id=3, LadoA=3.0, LadoB=3.0, Color=rojo]
	//Diferencia areas: -0.41999999999999993
	//Diferencia:-0.41999999999999993
	
	
	
}
