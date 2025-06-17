package formas;

/**
 * @author cristian.barquero
 * @version
 */


/**
 * Esta clase nos permite hacer extraccciones de metodos.
 */


public class Principal_Barquero {






	
	





	
	

	public static void main(String[] args) {
		//instanciamos un cuadrado y un circulo
		Barquero_Circulo circulo1 = new Barquero_Circulo(1, "circulo",3, "verde");
		Barquero_Rectangulo rectangulo1 = new Barquero_Rectangulo(3, 3, 3,  "rojo");
		
		//Calcula area cuadrado LadoA * LadoB
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area1 = ladoA * ladoB;
		System.out.println("Area Cuadrado: "+area1);
		
		//Calcula area circulo pi*r2
		double radio1 = circulo1.getRadio();
		double area2 = radio1*3.14;
		System.out.println("Area circulo:"+area2);
		
		//Diferencia entre areas de cuadrado y circulo
		double diferencia = area1-area2;
		System.out.println("Diferencia areas: "+diferencia);
		
		//imprimir datos
		System.out.println("Cuadrado: "+rectangulo1);
		System.out.println("Circulo: "+circulo1);
		System.out.println("Diferencia:"+diferencia);


	}


		
		
}



		
		

