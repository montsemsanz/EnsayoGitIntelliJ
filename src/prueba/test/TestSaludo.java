package prueba.test;

import prueba.modelo.Saludo;

public class TestSaludo {

	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Pepe"));
		System.out.println(saludo.saludar("Ana"));
		System.out.println(saludo.saludar("Maite"));
		

		
	}

}
