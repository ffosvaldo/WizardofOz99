package javabasics;

import javax.swing.JOptionPane;

public class mayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarar 2 variables con el valor que deses e indica cual es mayor de los 2 si son iguales indicar lo tambien.
		//cambiar los valores a vr si fuciona
		
	//	int x=30;
	//	int y=30;
		
		String x = JOptionPane.showInputDialog("Introduce el valor de  X");
		String y = JOptionPane.showInputDialog("Introduce el valor de  Y");	
		
		// el signo de (+) despues de las variables numero indica que vamos a agregar un comentario extra
		
		
		//una vez que usamos el parse int para reemplazar la string por enteros, vamos a poner
		// Integer.parseInt(<VARIABLE>) para que el sistema la identifique
		if (Integer.parseInt(x)>=Integer.parseInt(y)) 
		   {
			    //if anidado
			    if(Integer.parseInt(x)==Integer.parseInt(y)) 
				{
				 System.out.println(" X =" +Integer.parseInt(x)+"y  Y: "+Integer.parseInt(y)+" Son iguales");
				}//end if
				else 
				{	
			     System.out.println(" X=" +Integer.parseInt(x)+" Es mayor que  Y= "+Integer.parseInt(y));	
			    } 
		   }    //end
		else
		   {
			System.out.println("Y=" +Integer.parseInt(y)+ " Es mayor que X= "+Integer.parseInt(x));
	       }

	}
	
}
