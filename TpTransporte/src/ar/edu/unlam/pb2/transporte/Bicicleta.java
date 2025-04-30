package ar.edu.unlam.pb2.transporte;

public class Bicicleta extends Transporte {

	private String destino = null;

	public Bicicleta(double pesoPermitido, double volumenPermitido) {
		super(15, 0.125);
		this.paquetes = new Paquete[2];

	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		if (destino == null) {
			destino = paquete.getDestino();
		}
		for (int i = 0; i < this.paquetes.length; i++) {
			if (this.paquetes[i] != null && pesoActual() <= pesoPermitido
					|| paquetes[i].getVolumen() <= volumenPermitido) {
				return true;
			}
		}
		return false;
	}

}
