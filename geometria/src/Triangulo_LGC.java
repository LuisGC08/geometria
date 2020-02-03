/**
 * 
 * @author Luis García Clavel
 * @version 1.2
 *
 */
public class Triangulo_LGC extends FiguraGeometrica_LGC {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * @param lado indica los lados del triángulo
	 */
	public Triangulo_LGC(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
/**
 * @return devuelve los lados del triángulo
 */
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
	/**
	 * @param semiPerimetro indica el valor del semiperímetro
	 * @return devuelve el valor del cuadrado de la multiplicación de cada semiperímetro restándole su lado
	 */
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	
}
