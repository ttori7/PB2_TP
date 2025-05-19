package ar.edu.unlam.pb2.transporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransporteTest {

	@Test
	void queLaBiciSoloSeMuevaDentroDeLaMismaCiudad() {
		Transporte bici = new Bicicleta();
		Paquete p1 = new Paquete(0.2, 0.1, 0.3, 5, "San Justo");
		Paquete p2 = new Paquete(0.1, 0.5, 0.4, 5, "San Justo");
		assertTrue(bici.agregarPaquete(p1));
		assertTrue(bici.agregarPaquete(p2));
	}
	@Test
	void queLaBiciSoloPuedaLlevarDosPaquetes() {
		Transporte bici = new Bicicleta();
		Paquete p1 = new Paquete(0.2, 0.1, 0.3, 5, "San Justo");
		Paquete p2 = new Paquete(0.1, 0.5, 0.4, 5, "San Justo");
		Paquete p3 = new Paquete(0.1, 0.5, 0.4, 5, "San Justo");
		assertTrue(bici.agregarPaquete(p1));
		assertTrue(bici.agregarPaquete(p2));
		assertFalse(bici.agregarPaquete(p3));
	}
	@Test
	void queLaBiciSoloPuedaLlevarPaquetesQueCumplanElVolumenYelPeso() {
		Transporte bici = new Bicicleta();
		Paquete p1 = new Paquete(0.2, 0.1, 0.3, 5, "San Justo");
		Paquete p2 = new Paquete(0.5, 0.5, 0.6, 5, "San Justo");
		Paquete p3 = new Paquete(0.1, 0.5, 0.1, 20, "San Justo");
		assertTrue(bici.agregarPaquete(p1));
		assertFalse(bici.agregarPaquete(p2));
		assertFalse(bici.agregarPaquete(p3));
	}
	@Test
	void queElAutoSoloAbarqueTresCiudades() {
		Transporte auto = new Automovil();
		Paquete p1 = new Paquete(0.2, 0.1, 0.3, 5, "San Justo");
		Paquete p2 = new Paquete(0.1, 0.5, 0.4, 5, "Virrey del Pino");
		Paquete p3 = new Paquete(0.2, 0.1, 0.3, 5, "Moron");
		Paquete p4 = new Paquete(0.2, 0.1, 0.3, 5, "Isidro Casanova");
		assertTrue(auto.agregarPaquete(p1));
		assertTrue(auto.agregarPaquete(p2));
		assertTrue(auto.agregarPaquete(p3));
		assertFalse(auto.agregarPaquete(p4));
	}
	@Test
	void queElAutoSoloPuedaLlevarPaquetesQueCumplanElVolumenYelPeso() {
		Transporte auto = new Automovil();
		Paquete p1 = new Paquete(1, 1, 1, 5, "San Justo");
		Paquete p2 = new Paquete(0.5, 1, 1, 200, "San Justo");
		Paquete p3 = new Paquete(2, 2, 1, 200, "San Justo");
		Paquete p4 = new Paquete(0.2, 1, 1, 200, "San Justo");
		Paquete p5 = new Paquete(0.3, 1, 1, 110, "San Justo");
		assertTrue(auto.agregarPaquete(p1));
		assertTrue(auto.agregarPaquete(p2));
		assertFalse(auto.agregarPaquete(p3));
		assertTrue(auto.agregarPaquete(p4));
		assertFalse(auto.agregarPaquete(p5));
	}
	@Test
	void queElCamionSoloPuedaLlevarPaquetesQueCumplanElVolumenYelPeso() {
		Transporte camion = new Camion();
	    Paquete p1 = new Paquete(2, 2.5, 2, 5000, "Rosario");
	    Paquete p2 = new Paquete(2, 2, 2, 8000, "Cordoba");
	    Paquete p3 = new Paquete(2.5, 1, 2, 4000, "Mendoza");
	    Paquete p4 = new Paquete(1.5, 1, 1, 4000, "Mendoza");
	    Paquete p5 = new Paquete(1, 0.5, 1, 1000, "Neuquen");
	    assertTrue(camion.agregarPaquete(p1));
	    assertTrue(camion.agregarPaquete(p2));
	    assertFalse(camion.agregarPaquete(p3));
	    assertFalse(camion.agregarPaquete(p4));
	    assertTrue(camion.agregarPaquete(p5));
	}
	@Test
	void queLaEmpresaPuedaAsignarPaquetes() {
		Empresa empresa = new Empresa();
		Transporte bici = new Bicicleta();
		Paquete p1 = new Paquete(0.2, 0.1, 0.3, 5, "San Justo");
		empresa.agregarTransporte(bici);
		assertTrue(empresa.asignarPaquete(p1));
		assertEquals(1, bici.getPaquetes().size());
	}
}
