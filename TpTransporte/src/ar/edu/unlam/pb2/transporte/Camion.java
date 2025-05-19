package ar.edu.unlam.pb2.transporte;

public class Camion extends Transporte{

	public Camion() {
		super(16000, 20);
	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		if (pesoActual() + paquete.getPeso() > pesoPermitido
				|| volumenActual() + paquete.getVolumen() > volumenPermitido) {
			return false;
		}
		return true;
	}

	@Override
	public boolean agregarPaquete(Paquete paquete) {
		if(puedeLlevar(paquete)) {
			paquetes.add(paquete);
			return true;
		}
		return false;
	}
}
