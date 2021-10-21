package entities;	// pacote da classe

public class Triangle {	// nome da classe
	
	// atributos da classe
	public double a;
	public double b; 
	public double c;
	
	public double area() { // metodo area 
		double p = (a +  b + c) / 2.0; 
		return Math.sqrt(p * (p-a)*(p-b)*(p-c));	
	}
	
}
