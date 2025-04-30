package ar.edu.unlam.pb2.transporte;

public class Camion extends Transporte{

	public Camion(double pesoPermitido, double volumenPermitido) {
		super(16000, 20);
		this.paquetes = new Paquete[100];
	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		for (int i = 0; i < this.paquetes.length; i++) {
			if (this.paquetes[i] != null && pesoActual() <= pesoPermitido
					|| paquetes[i].getVolumen() <= volumenPermitido) {
				return true;
			}
		}
		return false;
	}

}
