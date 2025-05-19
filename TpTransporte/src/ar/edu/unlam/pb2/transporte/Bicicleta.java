package ar.edu.unlam.pb2.transporte;

public class Bicicleta extends Transporte {

	private String destino = null;
	private Integer paquetesMax = 2;

	public Bicicleta() {
		super(15, 0.125);
	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		if (paquetes.size() >= paquetesMax) {
			return false;
		}

		if (pesoActual() + paquete.getPeso() > pesoPermitido
				|| volumenActual() + paquete.getVolumen() > volumenPermitido) {
			return false;
		}
		return true;
	}

	@Override
	public boolean agregarPaquete(Paquete paquete) {
		if (puedeLlevar(paquete)) {
			if (destino == null) {
				destino = paquete.getDestino();
			}
			paquetes.add(paquete);
			return true;
		}
		return false;
	}
}
