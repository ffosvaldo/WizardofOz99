package javabasics;

import javax.swing.JOptionPane;


public class mensaje_de_bienvenida 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduce el nombre");
		System.out.println("Bienvenido "+ nombre);
	
	}

}
