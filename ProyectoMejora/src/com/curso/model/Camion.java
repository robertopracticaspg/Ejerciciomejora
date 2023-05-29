package com.curso.model;

import com.curso.interfaces.Conducible;

/**
 * Clase que representa un camion. Extiende la clase Vehiculo e implementa la
 * interfaz Conducible.
 */
public class Camion extends Vehiculo implements Conducible {
	private String color;
	private int velocidad;
	private int espacioRecorrido;
	private long tiempoViaje;

	/**
	 * Constructor de la clase Camion.
	 * 
	 * @param matricula La matricula del camion.
	 */
	public Camion(String matricula) {
		super(matricula, 6);
	}

	/**
	 * Metodo para obtener el color del camion.
	 * 
	 * @return El color del camion.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo para establecer el color del camion.
	 * 
	 * @param color El color del camion.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo para obtener la velocidad del camion.
	 * 
	 * @return La velocidad del camion.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Metodo para obtener el espacio recorrido por el camion.
	 * 
	 * @return El espacio recorrido por el camion.
	 */
	public int getEspacioRecorrido() {
		return espacioRecorrido;
	}

	/**
	 * Metodo para obtener el tiempo de viaje del camion.
	 * 
	 * @return El tiempo de viaje del camion.
	 */
	public long getTiempoViaje() {
		return tiempoViaje;
	}
	/**
	 * Metodo para conducir el camion.
	 * 
	 * @return Mensaje
	 */
	public void conducir() {
		System.out.println("Conduciendo el camion a 90 km/h.");
	}

	/**
	 * Metodo para arrancar el camion. Establece el tiempo inicial del viaje.
	 */
	public void arrancar() {
		tiempoViaje = System.currentTimeMillis();
		System.out.println("Camion arrancado. Tiempo inicial del viaje: " + tiempoViaje);
	}

	/**
	 * Metodo para avanzar el camion.
	 * 
	 * @param distancia La distancia a avanzar.
	 */
	public void avanzar(int distancia) {
		if (tiempoViaje == 0) {
			System.out.println("El camion esta parado. No se puede avanzar.");
			return;
		}

		espacioRecorrido += distancia;
		System.out.println("camion avanzando " + distancia + " metros. Espacio recorrido: " + espacioRecorrido);

		long tiempoActual = System.currentTimeMillis();
		tiempoViaje = tiempoActual - tiempoViaje;
	}

	/**
	 * Metodo para parar el camion. Establece el tiempo final del viaje.
	 */
	public void parar() {
		if (tiempoViaje == 0) {
			System.out.println("El camion no ha sido arrancado. No se puede parar.");
			return;
		}

		System.out.println("camion parado. Tiempo final del viaje: " + tiempoViaje);
		tiempoViaje = 0;
	}
}
