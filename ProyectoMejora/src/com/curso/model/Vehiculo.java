package com.curso.model;

import com.curso.interfaces.Conducible;

/**
 * Clase abstracta que representa un vehiculo. Implementa la interfaz
 * Conducible.
 */
public abstract class Vehiculo implements Conducible {

	private final String matricula;
	private final int numRuedas;
	private int parado = 0;

	/**
	 * Constructor de la clase Vehiculo.
	 * 
	 * @param matricula La matricula del vehiculo.
	 * @param numRuedas El numero de ruedas del vehiculo.
	 */
	public Vehiculo(String matricula, int numRuedas) {
		this.matricula = matricula;
		this.numRuedas = numRuedas;

		if (numRuedas == 4) {
			System.out.println("Es un coche.");
		} else {
			System.out.println("No es un coche.");
		}
	}

	/**
	 * Metodo para obtener la matricula del vehiculo.
	 * 
	 * @return La matricula del vehiculo.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Metodo para obtener el numero de ruedas del vehiculo.
	 * 
	 * @return El numero de ruedas del vehiculo.
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * Metodo para obtener el estado de parado del vehiculo.
	 * 
	 * @return El estado de parado del vehiculo.
	 */
	public int getParado() {
		return parado;
	}

	/**
	 * Metodo para establecer el estado de parado del vehiculo.
	 * 
	 * @param parado El estado de parado del vehiculo.
	 */
	public void setParado(int parado) {
		this.parado = parado;
	}

	/**
	 * Metodo para calcular la velocidad del vehiculo.
	 */
	public void velocidad() {

	}

	/**
	 * Metodo para calcular el espacio recorrido por el vehiculo.
	 */
	public void espacioRecorrido() {

	}

	/**
	 * Metodo para obtener el tiempo de viaje del vehiculo.
	 */
	public void tiempoViaje() {
		if (parado == 0) {
			System.out.println("Esta parado");
		} else {
			System.out.println("Se esta moviendo");
		}
	}

	/**
	 * Metodo para conducir el vehiculo. Implementación especifica para conducir un
	 * vehiculo.
	 */
	@Override
	public void conducir() {

	}

	/**
	 * Metodo para avanzar el vehiculo. Implementacion especifica para avanzar un
	 * vehiculo.
	 */
	@Override
	public void avanzar() {

	}

	/**
	 * Metodo para retroceder el vehiculo. Implementacion especifica para retroceder
	 * un vehiculo.
	 */
	@Override
	public void retroceder() {

	}

	/**
	 * Metodo para parar el vehiculo. Implementacion especifica para parar un
	 * vehiculo.
	 */
	@Override
	public void parar() {

	}
}