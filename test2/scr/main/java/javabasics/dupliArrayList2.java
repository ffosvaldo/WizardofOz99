package javabasics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//nombre de mi clase
public class dupliArrayList2 
{
	//main
	public static void main(String[] args) 
	{
		//declaro mi lista
		List<Integer> listanum= new ArrayList();
		listanum.add(1);
		listanum.add(2);
		listanum.add(2);
		listanum.add(3);
		listanum.add(4);
		
		//creo el objeto ulimo que guarda la iteracion
		
	Object ultimo= null;
	    // entero inizializado en 0
	int numCount = 0;
	    // invoco la funcion iterator
	Iterator<Integer> i= listanum.iterator();
	    //while  
	while(i.hasNext())
	  {
	Object temp = i.next();
	if(temp.equals(ultimo)) {
		i.remove();
		numCount++;
		}else 
		{		
		ultimo=temp;
		}
	  }  
	 System.out.println(numCount);
	 System.out.println(listanum);
	}
}   //fin del main