
public class Rombo implements figuraGeometrica{
	private String name;
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;
	public Rombo(String name, double diagonalMayor, double diagonalMenor) {
		super();
		this.name = name;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
	}
	
	public double calcularArea() {
		return (getDiagonalMayor()*getDiagonalMenor())/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return (4*getLado());
	}//calcularPerimetro
	

	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + "]";
	}//toString
	
	
	
}//class Rombo
