package prueba.test;

import prueba.modelo.Saludo;

/**
 * Punto de entrada a la aplicación
 */
public class TestSaludo {

	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Pepe"));
		System.out.println(saludo.saludar("Ana"));
		System.out.println(saludo.saludar("Maite"));
		

		
	}

}
