package test;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.edu.fatecfranca.test.*;

public class CourseTest {
	private Course course;

	@Before public void setUp() {
		course = new Course();
	}

	@Test public void testGetField() {
		assertEquals("Information Technology", course.getField());
	}

	@Test public void testSetField() {
		String name = "Test1";
		course.setField(name);
		assertEquals(name, course.getField());
	}

	@Test public void testToString() {
		assertEquals("Course: Software Engineering Field: Information Technology", course.toString());
	}
}

