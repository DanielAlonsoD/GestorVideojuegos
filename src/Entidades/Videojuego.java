package Entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
//@Table (name="otroNombre")
public class Videojuego implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String desarrollador;
	private int anyoLanzamiento;
	
	public Videojuego() {
	}

	public Videojuego(String nombre, String desarrollador, int anyoLanzamiento) {
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.anyoLanzamiento = anyoLanzamiento;
	}

	public Videojuego(int id, String nombre, String desarrollador, int anyoLanzamiento) {
		this.id = id;
		this.nombre = nombre;
		this.desarrollador = desarrollador;
		this.anyoLanzamiento = anyoLanzamiento;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesarrollador() {
		return desarrollador;
	}
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}
	public int getAnyoLanzamiento() {
		return anyoLanzamiento;
	}
	public void setAnyoLanzamiento(int anyoLanzamiento) {
		this.anyoLanzamiento = anyoLanzamiento;
	}
	
}
