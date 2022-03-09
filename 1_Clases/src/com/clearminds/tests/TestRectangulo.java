package com.clearminds.tests;
import com.clearminds.conceptos.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo(10,2);//instancio rectangulo
		//r1.base=10;//antes de calc el perimetro asigno valores
		//r1.altura=2;//antes de calc el perimetro asigno valores
		int area=r1.calcularArea();//invocamos calcular area
		System.out.println("El area es:"+area);//mandamos a imprimir
		int perimetro=r1.calcularPerimetro();//invoco r1 y el resultado lo guardo en una variable de tipo enetero llamdaa perimetro
		System.out.println("El perimetro es:"+perimetro);
	
		Rectangulo r2=new Rectangulo(12,4);
		//r2.base=12;
		//r2.altura=24;
		int area2=r2.calcularArea();
		System.out.println("El area de a2 es:"+area2);
		int perimetro2=r2.calcularPerimetro();
		System.out.println("El perimetro de r2 es:"+perimetro2);
	}

}