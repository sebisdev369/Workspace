package com.clearminds.conceptos;

public class Rectangulo {
	private int base;//en este estado nos retorna 0
	private int altura;
	
	public Rectangulo(int base, int altura){
		this.base=base;
		this.altura=altura;
	}
	public int calcularPerimetro(){
		int per=(2*base)+(2*altura);
		return per;
	}
	
	public int calcularArea(){
		int ar=base*altura;
		return ar;
	}

}
