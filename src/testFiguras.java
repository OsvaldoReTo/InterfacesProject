
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Tri�ngulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Cuadrado c1",127);
		Rectangulo r1 =new Rectangulo("Rectangulo r1", 40, 20);
		Rombo romb1 = new Rombo("Rombo romb1", 20, 20);
		Romboide romboide1 = new Romboide("Romboide romboide1", 20, 30);
		Trapecio trap1 =new Trapecio("Trapecio trap1", 10, 20, 40, 50, 15, 20, 20);
		
		
		imprimirCalculo(t1); imprimirCalculo(t2); imprimirCalculo(c1);
		imprimirCalculo(r1); imprimirCalculo(romb1); imprimirCalculo(romboide1);
		imprimirCalculo(trap1);
	}
	
	public static void imprimirCalculo(figuraGeometrica t) {
		System.out.println(t);
		System.out.println("+=========================================================");
		System.out.println("|El �rea de ["+t.getName()+"] es: "+ t.calcularArea() +
				"\n" + "|El per�metro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+=========================================================");
	}

}// class testFiguras
