package ar.edu.unlam.pb2.transporte;

public abstract class Transporte {

	protected Paquete[] paquetes;
	protected double pesoPermitido;
	protected double volumenPermitido;

	public Transporte(double pesoPermitido, double volumenPermitido) {
	}

	public double pesoActual() {
		double total = 0;
		for (int i = 0; i < paquetes.length; i++) {
			if (paquetes[i] != null) {
				total += paquetes[i].getPeso();
			}
		}
		return total;
	}

	public double volumenActual() {
		double total = 0;
		for (int i = 0; i < paquetes.length; i++) {
			if (paquetes[i] != null) {
				total += paquetes[i].getVolumen();
			}
		}
		return total;
	}

	public abstract boolean puedeLlevar(Paquete paquete);

	public boolean agregarPaquete(Paquete paquete) {
		for (int i = 0; i < paquetes.length; i++) {
			if (paquetes[i] != null && puedeLlevar(paquete) == true) {
				paquetes[i] = paquete;
			}
		}
		return false;
	}
}
