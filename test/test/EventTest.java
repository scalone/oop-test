package test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.test.*;

public class EventTest {
	private Event event;

	@Before public void setUp() {
		event = new Event();
	}

	@Test public void testGetCity() {
		assertEquals("San Diego", event.getCity());
	}

	@Test public void testSetCity() {
		String name = "Test1";
		event.setCity(name);
		assertEquals(name, event.getCity());
	}

	@Test public void testToString() {
		assertEquals("Event: RubyConf City: San Diego", event.toString());
	}
}

