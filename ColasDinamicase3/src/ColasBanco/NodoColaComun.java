package ColasBanco;

public class NodoColaComun {
	
	
	public NodoColaComun siguiente;
	public Object elemento;
	public int indice;
	
	public NodoColaComun(Object elemento, int indice) {
		
		this.elemento=elemento;
		this.indice = indice;
	    
		siguiente=null;
	    
	}
}
