package figuras;

public class Circunferencia {
	private double radio;
	private String color;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir() {
		color = "rojo";
		double d = 2 * radio;
		System.out.println("Diametro: " + d);
		System.out.println("Color: " + color);
		final double pi = 3.1416;
		double area = calcularArea(pi);
		System.out.println(area);
	}

	private double calcularArea(final double pi) {
		double area = 2 * pi * radio * radio;
		return area;
	}

	public boolean esIgual(Circunferencia otro, boolean conDecimales) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}
}
