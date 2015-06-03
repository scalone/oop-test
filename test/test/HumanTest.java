package test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.test.*;

public class HumanTest {
	private Human human;

	@Before public void setUp() {
		human = new Human();
	}

	@Test public void testSleeping() {
		assertEquals("ZZZZzzzzZzz", human.sleeping());
	}

	@Test public void testRunning() {
		assertEquals("go go go", human.running());
	}
}

