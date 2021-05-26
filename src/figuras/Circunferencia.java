

package figuras;

public class Circunferencia { /** clase Circunferencia */
	private double radio;
	private String color;

	public Circunferencia(double radio) {  /** m�todo constructor */
		this.radio = radio;
	}

	public void imprimir() { //** m�todo imprimir caracteristicas */
		color = "rojo";
		System.out.println("Diametro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * radio * radio; /** formula para calcular el area de una circunferencia */
		double area = area1;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) { //* M�todo para ver si circunferencias son iguales */
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
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
