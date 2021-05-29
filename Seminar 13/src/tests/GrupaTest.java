package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class GrupaTest {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1086);
		assertEquals(1086, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorException() {
		assertThrows(IllegalArgumentException.class, () -> {new Grupa(900);});
	}
	
	@Test
	public void testConstructorException2() {
		assertThrows(IllegalArgumentException.class, () -> {new Grupa(1200);});
	}
	
	@Test(timeout = 500)
	public void testConstructorPersormance() {
		Grupa grupa = new Grupa(1086);
	}
	
	@Test
	public void testConstructorRange() {
		Grupa grupa = new Grupa(1001);
		assertEquals(1001, grupa.getNrGrupa());
		Grupa grupa2 = new Grupa(1099);
		assertEquals(1099, grupa2.getNrGrupa());
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1041);
		assertNotNull(grupa.getStudenti());
	}
	
}
