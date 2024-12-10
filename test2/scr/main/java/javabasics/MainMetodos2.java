package javabasics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Iterator;

//import java.util.List;
//import java.util.stream.Collectors;

public class MainMetodos2 
{

	public static void main(String[] args)
	
	{
		//podemos crear instancias apoyadas en losmetodos
		//este contructor no esta recibiendo nada por parametros
		Metodos nombreObjeto = new Metodos(3,4);
		//este si
		Metodos nombreObjeto2 = new Metodos(9,3);
		metodos2 objeto = new metodos2();
		
	     //
	//	System.out.println(nombreObjeto2.sumatoria());
 	//	System.out.println(nombreObjeto.sumatoria());
 		
 		nombreObjeto.mostrarMensaje();
 		
 	//	nombreObjeto.mostrarNombre();
		String elementoGuardado = nombreObjeto.mostrarNombre("Sergio");
//        System.out.println(elementoGuardado);
 		//metodos estaticos lo llamas sin poner la clase antes, solo cuando estas en otra clase es cuando pones la clase para mandarlo llamar,
 		Metodos.prueba();
 		
 		
 		List<String> listaNombres = objeto.listaDeNombres();
 		List<Integer>listaNumeros = objeto.listaNumeros();
 		
 		//vamos a crear un ciclo for para recorrer esto. de forma simplificada
 		
 		for (String nombre: listaNombres)			
 		{
 			System.out.println(nombre);
 
 		}
 	//	System.out.println("for con puntos");
 		
 		//vieja forma
 		for (int indice=0; indice<listaNombres.size(); indice++)
 		{	
 	//		System.out.println(listaNombres.get(indice));
 			
 		}
 	//	System.out.println("for con index");
 		
		for (int numero : listaNumeros) 
		{	
		//	System.out.println(numero);
		}	
	     
	//	List<String> nombresSinElementosDuplicados = listaNombres.stream()
	//			.distinct()
	//			.collect(Collectors.toList());
			
	//	Collections.sort(nombresSinElementosDuplicados, Collections.reverseOrder());
	//		System.out.println(nombresSinElementosDuplicados);
		
			
			List nombresSinElementosDuplicados=listaNombres
					.stream()
					.distinct()
					.collect(Collectors.toList());
			
			System.out.println(nombresSinElementosDuplicados);
			
			Collections.sort(nombresSinElementosDuplicados, Collections.reverseOrder());
				System.out.println(nombresSinElementosDuplicados);
				
				
		//	System.out.println(Collections.max(listaNumeros));
		//	System.out.println(Collections.min(listaNumeros));
			
			Collections.sort(listaNumeros);
			System.out.println(listaNumeros);
			
			//Collections.sort(listaNumeros, Collections.reverseOrder());
			//System.out.println(listaNumeros);
			
			Object last = null;
			
			
			int numCount = 0;
			
			Iterator<Integer> i= listaNumeros.iterator();
			
			while(i.hasNext()) 
			{
			Object temp = i.next();
			if(temp.equals(last)) {
				i.remove();
				numCount++;
				}else 
				
				{
					
				last=temp;
				
				}
			
			}
			
			 System.out.println(numCount);
			 System.out.println(listaNumeros);			
				
   }// fin del main

}
