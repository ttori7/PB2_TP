package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Transporte> transportes;
	
	public Empresa() {
		this.transportes = new ArrayList<Transporte>();
	}
	public void agregarTransporte(Transporte transporte) {
		transportes.add(transporte);
	}
	
	public boolean asignarPaquete(Paquete paquete) {
		for (Transporte t : transportes) {
			if (t.agregarPaquete(paquete)) {
				return true;
			}
		}
		return false;
	}
}
