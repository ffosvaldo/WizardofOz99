package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class metodosY 


{
	metodosY objeto = new metodosY();


	
	private List<Integer> listaNumerosY()
	
	{
		List<Integer> listaNumerosY = new ArrayList<>();
		 listaNumerosY.add(2);
		 listaNumerosY.add(4);
		 listaNumerosY.add(8);
		 listaNumerosY.add(16);
		 listaNumerosY.add(32);
		 listaNumerosY.add(64);
		 
		return listaNumerosY;
	}
	List<Integer> listaNumerosY = objeto.listaNumerosY();
	{
	
//	Collections.sort(listaNumerosY);
//	System.out.println(listaNumerosY);
	
	//Collections.sort(listaNumeros, Collections.reverseOrder());
//	System.out.println(listaNumerosY);
	
	Object last = null;
	
	
	int numCount = 0;
	
	Iterator<Integer> i= listaNumerosY.iterator();
	
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
	
	 System.out.println(numCount);
	 System.out.println(listaNumerosY);	
	
	}
	
}
}
