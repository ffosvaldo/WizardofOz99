package javabasics;

import javax.swing.JOptionPane;

public class operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarar 2 variables que se puedan ingresar al sistema y se puedan hacer las 4 operaciones 
		
		
//		int numero1 = 24;
//		int numero2 = 7;
		
//		mamqma
				
		String numero1 = JOptionPane.showInputDialog("Introduce el numero 1");
		String numero2 = JOptionPane.showInputDialog("Introduce el numero 2");
		
		
//jOption pain es mas visual, y aqui lo que se recibe en el teclado es recibido como una cadena de texto
// el Integer.parseInt permite convertir una cadena de caracteres en enteros 
// double se utiliza para que tu numro considere los decimales
		
//		System.out.println("El Resultado de la suma es: "+  (Integer.parseInt(numero1)+Integer.parseInt(numero2)));
//		System.out.println("El Resultado de la resta es: "+  (Integer.parseInt(numero1)-Integer.parseInt(numero2)));
//		System.out.println("El Resultado de la multiplicacion es: "+  (Integer.parseInt(numero1)*Integer.parseInt(numero2)));
//		System.out.println("El Resultado de la division es: "+  (Integer.parseInt(numero1)/Integer.parseInt(numero2)));
		
		System.out.println("El Resultado de la suma es: "+  (Double.parseDouble(numero1)+Double.parseDouble(numero2)));
		System.out.println("El Resultado de la resta es: "+  (Double.parseDouble(numero1)-Double.parseDouble(numero2)));
		System.out.println("El Resultado de la multiplicacion es: "+  (Double.parseDouble(numero1)*Double.parseDouble(numero2)));
		System.out.println("El Resultado de la division es: "+  (Double.parseDouble(numero1)/Double.parseDouble(numero2)));
	}

}
