package ar.edu.unlam.pb2.transporte;

import java.util.LinkedList;
import java.util.List;

public abstract class Transporte {

	protected List<Paquete> paquetes;
	protected double pesoPermitido;
	protected double volumenPermitido;

	public Transporte(double pesoPermitido, double volumenPermitido) {
		this.paquetes = new LinkedList<Paquete>();
		this.pesoPermitido = pesoPermitido;
		this.volumenPermitido = volumenPermitido;
	}

	public double pesoActual() {
		double total = 0;
		for (Paquete p : paquetes) {
			if (p != null) {
				total += p.getPeso();
			}
		}
		return total;
	}

	public double volumenActual() {
		double total = 0;
		for (Paquete p : paquetes) {
			if (p != null) {
				total += p.getVolumen();
			}
		}
		return total;
	}

	public abstract boolean puedeLlevar(Paquete paquete);

	public abstract boolean agregarPaquete(Paquete paquete);

	public List<Paquete> getPaquetes() {
		return paquetes;
	}

	
}
