package ar.edu.unlam.pb2.transporte;

public class Paquete {

	private double alto;
	private double ancho;
	private double profundidad;
	private double peso;
	private String destino;

	public Paquete(double alto, double ancho, double profundidad, double peso, String destino) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.destino = destino;
	}
	
	public double getVolumen() {
		return alto * ancho * profundidad;
	}
	
	public String getDestino() {
		return destino;
	}

	public double getPeso() {
		return peso;
	}
}
