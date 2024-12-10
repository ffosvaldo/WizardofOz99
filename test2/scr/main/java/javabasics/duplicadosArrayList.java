package javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class duplicadosArrayList {

	public static void main(String[] args) 
	{
	
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese un numero de identificacion");
		int dni = leer.nextInt();
		
//    public List<Integer> listado()
		
		ArrayList listado= new ArrayList();
			
			
			listado.add(1010);
			listado.add(2020);
			listado.add(3030);
			
			
			
	//		return listados;
		
		if (listado.contains(dni))
		{
			System.out.println("El id ya esta en el listado");
		} else 
		    {
			 listado.add(dni);
			System.out.println("El id fue ingresado correctamente");
			
	    	}
		
			System.out.println("Lista:" +listado);

	}  //main

}
