package com.curso.model;

import com.curso.interfaces.Conducible;

/**
 * Clase que representa una moto. Extiende la clase Vehiculo e implementa la
 * interfaz Conducible.
 */
public class Moto extends Vehiculo implements Conducible {
	private String color;
	private int velocidad;
	private int espacioRecorrido;
	private long tiempoViaje;

	/**
	 * Constructor de la clase Moto.
	 * 
	 * @param matricula La matricula de la moto.
	 */
	public Moto(String matricula) {
		super(matricula, 2);
	}

	/**
	 * Metodo para obtener el color de la moto.
	 * 
	 * @return El color de la moto.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo para establecer el color de la moto.
	 * 
	 * @param color El color de la moto.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo para obtener la velocidad de la moto.
	 * 
	 * @return La velocidad de la moto.
	 */
	public int getVelocidad() {
		return velocidad;
	}
	/**
	 * Metodo para conducir la moto.
	 * 
	 * @return Mensaje.
	 */
	public void conducir() {
		System.out.println("Conduciendo la moto con el manillar");
	}

	/**
	 * Metodo para obtener el espacio recorrido por la moto.
	 * 
	 * @return El espacio recorrido por la moto.
	 */
	public int getEspacioRecorrido() {
		return espacioRecorrido;
	}

	/**
	 * Metodo para obtener el tiempo de viaje de la moto.
	 * 
	 * @return El tiempo de viaje de la moto.
	 */
	public long getTiempoViaje() {
		return tiempoViaje;
	}

	/**
	 * Metodo para arrancar la moto. Establece el tiempo inicial del viaje.
	 */
	public void arrancar() {
		tiempoViaje = System.currentTimeMillis();
		System.out.println("Moto arrancada. Tiempo inicial del viaje: " + tiempoViaje);
	}

	/**
	 * Metodo para avanzar la moto.
	 * 
	 * @param distancia La distancia a avanzar.
	 */
	public void avanzar(int distancia) {
		if (tiempoViaje == 0) {
			System.out.println("La moto esta parada. No se puede avanzar.");
			return;
		}

		espacioRecorrido += distancia;
		System.out.println("Moto avanzando " + distancia + " metros. Espacio recorrido: " + espacioRecorrido);

		long tiempoActual = System.currentTimeMillis();
		tiempoViaje = tiempoActual - tiempoViaje;
	}

	/**
	 * Metodo para parar la moto. Establece el tiempo final del viaje.
	 */
	public void parar() {
		if (tiempoViaje == 0) {
			System.out.println("La moto no ha sido arrancada. No se puede parar.");
			return;
		}

		System.out.println("Moto parada. Tiempo final del viaje: " + tiempoViaje);
		tiempoViaje = 0;
	}
}
