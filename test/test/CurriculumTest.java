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

	@Test public void testGetPersonName() {
		assertEquals("Thiago", curriculum.getPersonName());
	}

	@Test public void testSetPersonName() {
		String name = "Test1";
		curriculum.setPersonName(name);
		assertEquals(name, curriculum.getPersonName());
	}

	@Test public void testCreateActivity() {
		Event event   = new Event();
		Course course = new Course();
		curriculum.createActivity(event);
		curriculum.createActivity(course);
	}

	@Test public void testGetActivities() {
		Event event   = new Event();
		Course course = new Course();
		curriculum.createActivity(event);
		curriculum.createActivity(course);

		ArrayList<Activity> activities = curriculum.getActivities();

		assertEquals(event, activities.get(0));
		assertEquals(course, activities.get(1));
	}

	@Test public void testGetActivity() {
		Event event   = new Event();
		Course course = new Course();
		curriculum.createActivity(event);
		curriculum.createActivity(course);

		Activity event2 = curriculum.getActivity(event);
		assertEquals(event, event2);
	}

	@Test public void testRelease() {
		Event event   = new Event();
		Course course = new Course();
		String text   = "Curriculum\n" +
			"Event: RubyConf City: San Diego\n" +
			"Course: Software Engineering Field: Information Technology\n";

		curriculum.createActivity(event);
		curriculum.createActivity(course);

		assertEquals(text, curriculum.release());
	}
}

