package ar.edu.unlp.objetos.uno.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class practicaMapa {
	
	private HashMap<String, Integer> prueba;
	
	@BeforeEach
	void setUp() {
		prueba = new HashMap<String, Integer>();
		prueba.put("Lionel Messi", 111);
		prueba.put("Gabriel Batistuta", 56);
		prueba.put("Kun Aguero", 42);
	}
	
	@Test
	void testEliminarTuplas() {
		assertEquals(42, prueba.remove("Kun Aguero"));
	}
	
	@Test
	void testActualizarTupla() {
		assertEquals(111,prueba.replace("Lionel Messi", 112));
	}
	
	@Test
	void testNoEsPosibleMismaClave() {
		assertEquals(56,prueba.put("Gabriel Batistuta", 65));
	}
	
	@Test
	void testTotalGoles() {
		assertEquals(209, prueba.values().stream().mapToInt(jugador -> jugador.intValue()).sum());
	}
}
