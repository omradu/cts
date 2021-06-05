package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Grupa;
import mock.StudentDummy;

public class GrupaTestWithMocks {
	
	static Grupa grupa;

	@Test
	public void testAdaugaStudent() {
		Grupa grupa = new Grupa(1086);
		StudentDummy studentDummy = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(1,grupa.getStudenti().size());
	}
	
	@Test
	public void testAdaugaStudentBoundarySuperior() {
		assertEquals(35, grupa.getStudenti().size());
	}
	
	@BeforeClass
	public static void testCreareGrupa() {
		grupa = new Grupa(1086);
		for(int i = 0; i<35; i++) {
			StudentDummy studentDummy = new StudentDummy();
			grupa.adaugaStudent(studentDummy);
		}
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaStudentExceptie() {
		StudentDummy studentDummy = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		
	}

}
