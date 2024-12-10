package javabasics;

import java.util.Scanner;

public class LOGIN_usando_func_scanner 
//logueo con user y password
{

	public static void main(String[] args)

	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su usuario: ");
		String usuario = scanner.nextLine(); System.out.print("Ingrese su contraseña: ");
		String contraseña = scanner.nextLine();
		
			// Simulamos una autenticación (en un escenario real, aquí se haría una petición a un servidor) 
			if (usuario.equals("admin") && contraseña.equals("password"))
			{ System.out.println("Login exitoso!");
			// Redirigir a la página principal 
			} else 
			{ 
				System.out.println("Credenciales incorrectas");
			} scanner.close();
     } 
}