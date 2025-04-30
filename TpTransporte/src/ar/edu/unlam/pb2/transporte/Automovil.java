package ar.edu.unlam.pb2.transporte;

public class Automovil extends Transporte {
	
	private String[] destinos;

	public Automovil(double pesoPermitido, double volumenPermitido) {
		super(500, 2);
		this.paquetes = new Paquete[10];
		this.destinos = new String[3];
	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		for (int i = 0; i < this.paquetes.length; i++) {
			if (this.paquetes[i] != null && pesoActual() <= pesoPermitido || volumenActual() >= volumenPermitido) {
				if(cantDestinos()<=3 && !yaContieneDestino(paquete.getDestino()))
				return true;
			}
		}
		return false;
	}
	
	public Integer cantDestinos() {
		Integer total = 0;
		for (int i = 0; i < destinos.length; i++) {
			if(destinos[i] != null) {
				total++;
			}
		}
		return total;
	}
	public boolean yaContieneDestino(String destino) {
		for (int i = 0; i < destinos.length; i++) {
			if(destinos[i].equals(destino)) {
				return true;
			}
		}
		return false;
	}
}
