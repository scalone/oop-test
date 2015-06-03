
package br.edu.fatecfranca.test;

public class Course extends Activity {
	protected String field;

	public Course(String name, String field) {
		super(name);
		this.field = field;
	}

	public Course() {
		this("Software Engineering", "Information Technology");
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Course: " + this.getName() + " Field: " + this.getField();
	}
}

