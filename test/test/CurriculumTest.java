package test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.test.*;

public class CurriculumTest {
	private Curriculum curriculum;

	@Before public void setUp() {
		curriculum = new Curriculum();
	}

	@Test public void testCreation() {
		assertEquals("Thiago", curriculum.getPersonName());
	}
}

