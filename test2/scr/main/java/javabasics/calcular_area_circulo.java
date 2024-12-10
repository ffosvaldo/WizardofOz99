package javabasics;

import javax.swing.JOptionPane;

public class calcular_area_circulo 
{
	//el area se calcula como PI * radio al cuadrado
	public static void main(String[] args) 
	{
	//	String radio = JOptionPane.showInputDialog("Introduce el radio ");
	//	double pi = 3.1416;
	//	double rac = (Integer.parseInt(radio))*(Integer.parseInt(radio));
		
	//	JOptionPane.showMessageDialog(null,"El Resultado del calculo del area es: "+  (pi)*(rac));
		
	
	//otra forma de hacerlo pero la morra lo hizo mal
		
    //    final double PI = 3.1416;
	//	double area;
		
	    // solicitar el valor de el radio
	//	String r = JOptionPane.showInputDialog("Introduce el valor de el radio = ");
	//	double radio = Double.parseDouble(r);
		
	//	area = PI * Math.pow(radio, 2);
		
	//	JOptionPane.showMessageDialog(null, "El area del circulo con radio = "+radio+" es =" +area);
		
		
	// la que hizo Sergio cooltesters
		String valor = JOptionPane.showInputDialog("Introduce el radio ");
		double radio = Double.parseDouble(valor);
		double area = Math.PI* Math.pow(radio, 2);
		JOptionPane.showMessageDialog(null, "El area del circulo con radio = "+radio+" es =" +area);
		
	}

}
