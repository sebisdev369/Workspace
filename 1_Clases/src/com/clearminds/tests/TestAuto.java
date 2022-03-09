package com.clearminds.tests;
import com.clearminds.entidades.Auto;

public class TestAuto {
	public static void main(String[] args) {
		Auto a3 = new Auto("toyota",12000,2010);
		Auto a1;
		a1=new Auto();
		System.out.println("marca:"+a1.getMarca());
		System.out.println("anio:"+a1.getAnio());
		System.out.println("precio:"+a1.getPrecio());
		
		a1.setMarca("Chevrolet");
		a1.setAnio(2010);
		a1.setPrecio(12000);
		
		System.out.println("marca:"+a1.getMarca());
		System.out.println("anio:"+a1.getAnio());
		System.out.println("precio:"+a1.getPrecio());
		
		System.out.println("*********************");
		Auto a2;
		a2=new Auto();
		a2.setMarca("Kia");
		a2.setAnio(2011);
		a2.setPrecio(13000);
		System.out.println("marca:"+a2.getMarca());
		System.out.println("anio:"+a2.getAnio());
		System.out.println("precio"+a2.getPrecio());
	}
}
