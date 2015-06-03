
package br.edu.fatecfranca.test;

public abstract class Activity {
	private String name;

	public Activity(String name) {
		this.name = name;
	}

	public Activity() {
		this("Activity");
	}

	public abstract String toString();

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

