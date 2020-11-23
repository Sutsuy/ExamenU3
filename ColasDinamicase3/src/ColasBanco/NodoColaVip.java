package ColasBanco;

public class NodoColaVip {
	
	
	NodoColaVip siguiente;
	public String elemento;
	public int indice; 
	
	public NodoColaVip(String elemento, int indice) {
		this.elemento=elemento;
		this.indice=indice;
	    siguiente=null;
	    
	}
}
