package com.clearminds.tests;

import com.clearminds.entidades.Persona;

public class TestPersona2{
	/* Primero Ejemplo
	public static void main(String[] args){
		int a; //creando variable de nombre a de tipo entero
		Persona p; //1) Declaro variable p de tipo Persona, clase Persona pasa a ser nuevo tipo de dato
		p =  new Persona(); //2)Instancia un objeto Persona 
		p.nombre = "Juan"; // p. te lleva a la info que esta en nombre y le asigno Juan al atributo
		System.out.println("nombre:"+p.nombre);//concateno con +
	}
	*/
	public static void main(String[] args) {
		Persona p3=new Persona();
		Persona p4=new Persona("Maria",29,1.70);
		Persona p1;//Declaro variable p1 de tipo Persona
		p1=new Persona("Sebastian");//Creo el obj Persona y lo referencio (apunto) con p1
		System.out.println("nombre:"+p1.getNombre());//veo informacion
		System.out.println("edad:"+p1.getEdad());
		System.out.println("estatura:"+p1.getEstatura());//me va a dar valores por defecto
		
		p1.setNombre("Juan"); //le paso como parametro
		p1.setEdad(20);
		p1.setEstatura(180);
		
		System.out.println("nombre:"+p1.getNombre());
		System.out.println("edad:"+p1.getEdad());
		System.out.println("estatura:"+p1.getEstatura());
		
		System.out.println("*****************************");
		Persona p2;
		p2=new Persona("Juan");
		System.out.println("nombre: "+p2.getNombre());
		p2.setNombre("Sebastian");
		System.out.println("nombre:"+p2.getNombre());
	}
}
