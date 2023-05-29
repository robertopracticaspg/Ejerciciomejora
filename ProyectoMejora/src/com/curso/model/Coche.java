package com.curso.model;

import com.curso.interfaces.Conducible;

/**
 * Clase que representa un coche, hereda de Vehiculo e implementa la interfaz
 * Conducible.
 */
public class Coche extends Vehiculo implements Conducible {

	private String color;
	private int velocidad;
	private int espacioRecorrido;
	private long tiempoViaje;

	/**
	 * Constructor de la clase Coche.
	 * 
	 * @param matricula La matricula del coche.
	 */
	public Coche(String matricula) {
		super(matricula, 4);
	}

	/**
	 * Obtiene el color del coche.
	 * 
	 * @return El color del coche.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Establece el color del coche.
	 * 
	 * @param color El color a establecer.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Obtiene la velocidad actual del coche.
	 * 
	 * @return La velocidad actual del coche.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Obtiene el espacio recorrido por el coche.
	 * 
	 * @return El espacio recorrido por el coche.
	 */
	public int getEspacioRecorrido() {
		return espacioRecorrido;
	}

	/**
	 * Obtiene el tiempo total de viaje del coche.
	 * 
	 * @return El tiempo total de viaje del coche.
	 */
	public long getTiempoViaje() {
		return tiempoViaje;
	}

	/**
	 * Método para conducir el coche.
	 */
	@Override
	public void conducir() {
		System.out.println("Conduciendo el coche por la calle.");
	}

	/**
	 * Método para arrancar el coche.
	 */
	public void arrancar() {
		tiempoViaje = System.currentTimeMillis();
		System.out.println("Coche arrancado. Tiempo inicial del viaje: " + tiempoViaje);
	}

	/**
	 * Método para avanzar el coche una distancia determinada.
	 * 
	 * @param distancia La distancia a avanzar.
	 */
	public void avanzar(int distancia) {
		if (tiempoViaje == 0) {
			System.out.println("El coche esta parado. No se puede avanzar.");
			return;
		}

		espacioRecorrido += distancia;
		System.out.println("Coche avanzando " + distancia + " metros. Espacio recorrido: " + espacioRecorrido);

		long tiempoActual = System.currentTimeMillis();
		tiempoViaje = tiempoActual - tiempoViaje;
	}

	/**
	 * Metodo para parar el coche.
	 */
	public void parar() {
		if (tiempoViaje == 0) {
			System.out.println("El coche no ha sido arrancado. No se puede parar.");
			return;
		}

		System.out.println("Coche parado. Tiempo final del viaje: " + tiempoViaje);
		tiempoViaje = 0;
	}

}
