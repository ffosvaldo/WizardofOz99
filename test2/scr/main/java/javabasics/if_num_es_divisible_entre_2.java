package javabasics;

import javax.swing.JOptionPane;

public class if_num_es_divisible_entre_2 
{

	public static void main(String[] args) 
	{
		//Ingresar el valor
		String num = JOptionPane.showInputDialog("Introduce el numero ");
		//condicion si es divisible true
		if (Integer.parseInt(num)%2 ==0) 
		{  
			JOptionPane.showMessageDialog(null, "El numero "+ num+ "Si es divisible entre 2");
		} //
		else //condicion si NO es divisible
		{
			JOptionPane.showMessageDialog(null, "El numero "+ num+ "No es divisible entre 2");
		}
		
	}

}
