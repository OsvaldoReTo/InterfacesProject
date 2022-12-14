
public class Trapecio implements figuraGeometrica{
	private String name;
	private double baseMenor;
	private double baseMayor;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double altura;
	
	public Trapecio(String name, double baseMenor, double baseMayor, double lado1, double lado2, double lado3,
			double lado4, double altura) {
		super();
		this.name = name;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.altura = altura;
	}

	public double calcularArea() {
		return ((getBaseMayor()+getBaseMenor())*getAltura())/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado1() + getLado2() + getLado3()+getLado4());
	}//calcularPerimetro
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", lado1=" + lado1
				+ ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + ", altura=" + altura + "]";
	}//toString
	
	
	
}//class Trapecio
