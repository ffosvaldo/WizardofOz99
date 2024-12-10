package javabasics;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class numduplicadoenlistajavaoptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ingresar el valor
				String num = JOptionPane.showInputDialog("Introduce el numero de ID");
		
				ArrayList listado= new ArrayList();
				
				listado.add(1010);
				listado.add(2020);
		
				if (listado.contains(num))
				{
					JOptionPane.showMessageDialog(null, num+ "El id ya esta en el listado");
				} else 
				    {
					 listado.add(num);
					 JOptionPane.showMessageDialog(null, num+ "El id fue agregado correctamente");
			    	}
				
				 JOptionPane.showMessageDialog(null, "Lista:" +listado);
		
	}//main

}
