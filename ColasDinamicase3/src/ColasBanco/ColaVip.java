package ColasBanco;

import java.util.Scanner;

public class ColaVip {
	
	public  NodoColaVip fin,cima;
	public  int tamanio;
	
	public boolean Nohaynada()
	{
		return cima == null;
	}
	
	public void Empujar(String elemento, int indice)
	{
		NodoColaVip nodo = new NodoColaVip(elemento,indice);
		if(Nohaynada()) 
		{
			cima = nodo;
		}
		else 
		{
		fin.siguiente =  nodo;
		}
		
		fin = nodo;
		tamanio++;
	}
	
	public String SacarCola()
	{
		if(!Nohaynada())
		{
			cima = cima.siguiente;
			tamanio--;
		}
		else
		{
			System.out.println("No hay nada en el a cola vip");
		}
		
		return null;
	}
	
	
	public void MostrarCola()
	{
	NodoColaVip recorre = cima;
		if(!Nohaynada()) 
		{
			while(recorre!=null)
			{
			System.out.print("[Cliente: "+recorre.elemento +" Turno: "+ recorre.indice+" ] ");
			recorre = recorre.siguiente;
			}
			
		}
		else
		{
			System.out.println("La cola comun esta vacía");
		}
		

	}
	
	
	public String SacarUnElemento() 
	{
		String v = null;
		NodoColaVip recorre = cima;
		if(!Nohaynada()) 
		{
			
		v= ("[Cliente: "+recorre.elemento +" Turno: "+ recorre.indice+" ] ");
		return v;
			
		}
		
		else
		{
			System.out.println("La cola comun esta vacía");
			
		}
		
		return v;
	}
	
	

}