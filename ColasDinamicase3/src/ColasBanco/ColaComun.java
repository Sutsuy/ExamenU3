package ColasBanco;

public class ColaComun {
	public  NodoColaComun cima,fin;
	public  int tamanio;
	
	public boolean Nohaynada() 
	{
	return cima == null;
		
	}
	
	
	public void Empujar(String elemento, int indice)
	{
	NodoColaComun nodo = new NodoColaComun(elemento,indice);
		if(Nohaynada())
		{
			cima = nodo;
		}
		else 
		{
			fin.siguiente = nodo;
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
			System.out.println("No hay clientes comunes en la cola");
		}
		return null;
		
	}
	
	
	public void MostrarCola() 
	{
		NodoColaComun recorre = cima;
		if(!Nohaynada()) 
		{
			while(recorre!=null) 
	    {
				System.out.print(" [ Cliente : "+recorre.elemento +", turno: "+ recorre.indice+ " ] ");
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
		NodoColaComun recorre = cima;
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
