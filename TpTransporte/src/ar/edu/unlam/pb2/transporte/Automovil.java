package ar.edu.unlam.pb2.transporte;

import java.util.HashSet;
import java.util.Set;

public class Automovil extends Transporte {

	private Set<String> destinos;
	private Integer destinoMax = 3;

	public Automovil() {
		super(500, 2);
		this.destinos = new HashSet<String>();
	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		if (pesoActual() + paquete.getPeso() > pesoPermitido
				|| volumenActual() + paquete.getVolumen() > volumenPermitido) {
			return false;
		}
		if (!destinos.contains(paquete.getDestino()) && destinos.size() >= destinoMax) {
			return false;
		}
		return true;
	}

	@Override
	public boolean agregarPaquete(Paquete paquete) {
		if(puedeLlevar(paquete)) {
			destinos.add(paquete.getDestino());
			paquetes.add(paquete);
			return true;
		}
		return false;
	}
}
