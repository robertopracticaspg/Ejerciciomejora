package com.curso.directora;

import com.curso.model.*;

/**
 * Clase principal que ejecuta el programa.
 */
public class Principal {

	/**
	 * Metodo principal que inicia la ejecucion del programa.
	 */
	public static void main(String[] args) {

		// Creacion de un objeto de tipo Coche
		Coche miCoche = new Coche("1111");
		miCoche.setColor("Rojo");
		miCoche.arrancar();
		miCoche.avanzar(50);
		miCoche.parar();
		miCoche.conducir();

		System.out.println("Velocidad: " + miCoche.getVelocidad());
		System.out.println("Tiempo de viaje: " + miCoche.getTiempoViaje());

		// Creacion de un objeto de tipo Moto
		Moto miMoto = new Moto("2222");
		miMoto.setColor("Verde");
		miMoto.arrancar();
		miMoto.avanzar(50);
		miMoto.parar();
		miMoto.conducir();

		System.out.println("Velocidad: " + miMoto.getVelocidad());
		System.out.println("Tiempo de viaje: " + miMoto.getTiempoViaje());

		// Creacion de un objeto de tipo Camion
		Camion miCamion = new Camion("3333");
		miCamion.setColor("Amarillo");
		miCamion.arrancar();
		miCamion.avanzar(50);
		miCamion.parar();
		miCamion.conducir();

		System.out.println("Velocidad: " + miCamion.getVelocidad());
		System.out.println("Tiempo de viaje: " + miCamion.getTiempoViaje());

		// Creacion de un objeto de tipo Barco
		Barco miBarco = new Barco("4444");
		miBarco.setColor("Azul");
		miBarco.arrancar();
		miBarco.avanzar(50);
		miBarco.parar();
		miBarco.conducir();

		System.out.println("Velocidad: " + miBarco.getVelocidad());
		System.out.println("Tiempo de viaje: " + miBarco.getTiempoViaje());
	}
}
