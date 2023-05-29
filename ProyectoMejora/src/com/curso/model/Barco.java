package com.curso.model;

import com.curso.interfaces.Conducible;

/**
 * Clase que representa un barco. Extiende la clase Vehiculo e implementa la
 * interfaz Conducible.
 */
public class Barco extends Vehiculo implements Conducible {
	private String color;
	private int velocidad;
	private int espacioRecorrido;
	private long tiempoViaje;

	/**
	 * Constructor de la clase Barco.
	 * 
	 * @param matricula La matricula del barco.
	 */
	public Barco(String matricula) {
		super(matricula, 0); // Los barcos no tienen ruedas
	}

	/**
	 * Metodo para obtener el color del barco.
	 * 
	 * @return El color del barco.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo para establecer el color del barco.
	 * 
	 * @param color El color del barco.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo para obtener la velocidad del barco.
	 * 
	 * @return La velocidad del barco.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Metodo para obtener el espacio recorrido por el barco.
	 * 
	 * @return El espacio recorrido por el barco.
	 */
	public int getEspacioRecorrido() {
		return espacioRecorrido;
	}

	/**
	 * Metodo para obtener el tiempo de viaje del barco.
	 * 
	 * @return El tiempo de viaje del barco.
	 */
	public long getTiempoViaje() {
		return tiempoViaje;
	}
	/**
	 * Metodo para conducir el barco.
	 * 
	 * @return Mensaje.
	 */
	public void conducir() {
		System.out.println("Conduciendo el barco por el mar");
	}

	/**
	 * Metodo para arrancar el barco. Establece el tiempo inicial del viaje.
	 */
	public void arrancar() {
		tiempoViaje = System.currentTimeMillis();
		System.out.println("Barco arrancado. Tiempo inicial del viaje: " + tiempoViaje);
	}

	/**
	 * Metodo para avanzar el barco.
	 * 
	 * @param distancia La distancia a avanzar.
	 */
	public void avanzar(int distancia) {
		if (tiempoViaje == 0) {
			System.out.println("El barco no ha sido arrancado. No se puede avanzar.");
			return;
		}

		espacioRecorrido += distancia;
		System.out.println("Barco avanzando " + distancia + " metros. Espacio recorrido: " + espacioRecorrido);

		long tiempoActual = System.currentTimeMillis();
		tiempoViaje = tiempoActual - tiempoViaje;
	}

	/**
	 * Metodo para parar el barco. Establece el tiempo final del viaje.
	 */
	public void parar() {
		if (tiempoViaje == 0) {
			System.out.println("El barco no ha sido arrancado. No se puede parar.");
			return;
		}

		System.out.println("Barco parado. Tiempo final del viaje: " + tiempoViaje);
		tiempoViaje = 0;
	}
}
