

package OperacionesMenu;

import java.util.Scanner;

import ColasBanco.ColaComun;
import ColasBanco.ColaVip;

public class Menu {
	
	Scanner leer = new Scanner(System.in);
	int opcion;
	

public void Menu() {
		

	
	ColaComun colac= new ColaComun();
	ColaVip colav= new ColaVip();
    		
		
		int opcion,opc;
		String [] cliente = {"Cliente Vip","Cliente comun"};
		int turno = 1;
		int numero = 0;
		
		
	
		do
		{
        System.out.println("****************************************** ");
		System.out.println("++++++Menu de banco(colas)+++++ ");
		System.out.println(" 1.- Nuevo Cliente ");
		System.out.println(" 2.- Pasar a Ventanilla ");
		System.out.println(" 3.- Mostrar Colas ");
		System.out.println(" 4.- Salir ");
		System.out.println("****************************************** ");
		System.out.println("Elige una opcion---->   ");
        opcion = leer.nextInt();
		
		switch (opcion) {
		case 1:
			 numero = (int)(Math.random() * 2);
			if(numero == 0)
			{
		     colav.Empujar(cliente[0], turno++);
					
			}
			else 
			{
			colac.Empujar(cliente[1],turno++);
								
			}
				colav.MostrarCola();
				colac.MostrarCola();	
		break;
		
		
		case 2:
			String []Ventanilla = new String [3];
			
			for(int i = 0; i < 3; i++ )
			{
				if(!colav.Nohaynada()) 
				{
				
				colav.SacarCola();
				}
				
				else
				{
		
				colac.SacarCola();
				}
				
			}
					
		break;
		
		
		case 3:
			
			colav.MostrarCola();
			colac.MostrarCola();
	
		break;
		
		
		case 4:
    System.out.println("Bby gracias por utilizar el mini banco :3 ");
		break;
		

		
		default:
		{
			System.out.println("Lo siento corazon opcion invalida ");
			break;
		}
	}
		
	

System.out.println("/n--Quieres seguir en el menu ingresa-- 7)si  8)no"); 
opc=leer.nextInt();
}
while(opc==7);

if(opc==8){
    System.out.println("Gracias por estar aqui");
}



}
}
