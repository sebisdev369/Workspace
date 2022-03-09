package com.clearminds.entidades;

public class Auto {
	private String marca;
	private int precio;
	private int anio;
	
	public Auto(String marca, int precio, int anio) {
		//super();
		this.marca = marca;
		this.precio = precio;
		this.anio = anio;
	}
	public Auto() {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
	
}
