
package br.edu.fatecfranca.test;

public class Curriculum {
	private String personName;

	public Curriculum(String personName) {
		this.personName = personName;
	}

	public Curriculum() {
		this("Thiago");
	}

	public String getPersonName() {
		return this.personName;
	}
}

