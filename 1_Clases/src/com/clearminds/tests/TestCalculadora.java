package com.clearminds.tests;
import com.clearminds.entidades.Calculadora;
import com.clearminds.entidades.Persona;

public class TestCalculadora {
	public static void main(String[] args) {
		/*
		int resultado=0;
		Calculadora calcu=new Calculadora(); // aqui hacemos lo que haciamos en dos lineas antes, declaro var y asignado al obj calcualdaora
		resultado=calcu.sumar(8, 5);//debe coincidir la cantidad de param que declaramos
		//^^^^^^^retorno del resultado lo guardo en una var llamada resultado
		*/
		//ejercicio en dos pasos, mejor practiva de programacion xq es mas eficiente que el codigo de arriba
		Calculadora c=new Calculadora();//instancia (obj)
		int resultado=c.sumar(5, 8);
		System.out.println("resultado:"+resultado);
		double resultado1=c.restar(1.23,2.14);
		double resultado2=c.multiplicar(3.3, 5.5);
		System.out.println("resultado:"+resultado1);
		System.out.println("resultado:"+resultado2);
		
		c.imprimir();//llamo al metodo imprimir
		
		Persona p;
	}

}
