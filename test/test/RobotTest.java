package test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.test.*;

public class RobotTest {
	private Robot robot;

	@Before public void setUp() {
		robot = new Robot();
	}

	@Test public void testCalculate() {
		assertEquals(33, robot.sum(16, 17));
	}
}

