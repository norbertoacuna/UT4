
/**
* Clase Test creada para poder hacer pruebas en Eclipse
* con Refractor y Git
*/


/*
* @author Norberto Acuña
* @versión 1.0 
*/


package figuras; /** Acceso al paquete figuras */

public class Test {

	public static void main(String[] args) {  /** Declaración del metodo main */
		Circunferencia c1 = new Circunferencia(5.5); /** Creación de objetos */
		Circunferencia c2 = new Circunferencia(10.1);
		Circunferencia c3 = new Circunferencia(10.9);

		if (c2.esIgual(false, c3)) /** comprobación llamando al método esIgual */
			System.out.println("c2 y c3: iguales sin considerar decimales");

		if (c2.esIgual(true, c3)) /** nueva comprobación con llamada al método */
			System.out.println("c2 y c3: iguales considerando decimales");
	}

}
