package javabasics;

public class Metodos 
{
	int numero1, numero2;

	//construcctor que se puede crear en blanco POR PARTE DE JAVA y puede tener diversos valores
	 public Metodos(int numero1, int numero2 ) 
	{
	   this.numero1=numero1;
	   this.numero2=numero2;  	
	   // un constructor que recibe ciuertos parametrs nos sirve inicializar la clase
	}
		
		
		public Metodos()
		{

		}
		
		//
	public static void main(String[] args)
	{
		//podemos crear instancias apoyadas en losmetodos
		//este contructor no esta recibiendo nada por parametros
		Metodos nombreObjeto = new Metodos(3,4);
		//este si
		Metodos nombreObjeto2 = new Metodos(9,3);
	     //
	//	System.out.println(nombreObjeto2.sumatoria());
 	//	System.out.println(nombreObjeto.sumatoria());
 		
 		nombreObjeto.mostrarMensaje();
// 		nombreObjeto.mostrarNombre();
 		String elementoGuardado = nombreObjeto.mostrarNombre("Sergio");
    //    System.out.println(elementoGuardado);
 		//metodos estaticos lo llamas sin poner la clase antes, solo cuando estas en otra clase es cuando pones la clase para mandarlo llamar,
 		Metodos.prueba();
 		
	}

	//no va a devolver nada solo ejecuta las lineas de codigo dentro del metodo y regresa
	public void mostrarMensaje()
	{
		
	//	System.out.println( "Hola Mundo");
		
	}
	// ejecuta las lineas de codigo, devuelve un tipo entero
	public int sumatoria ()
	{
		 return numero1 + numero2;
				
	}
	// ejecuta las lineas de codigo, devuelve un tipo entero
		public int sumatoria2 ()
		{
			 return numero1 + numero2;
					
		}
	// ejecuta las lineas de codigo, devuelve un tipo string
	public String mostrarNombre(String nombre)
	{
	//	System.out.println(nombre);
		 return nombre;
	}
	//metodo estatico
	
	public static void prueba () 
	{
	// System.out.println("Metodo estatico");
	
	}
}
