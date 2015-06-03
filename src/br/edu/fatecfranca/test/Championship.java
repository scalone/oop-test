package br.edu.fatecfranca.test;

public abstract class Championship {
	private String state;

	public Championship(String state) {
		this.state = state;
	}

	public Championship() {
		this("São Paulo");
	}

	public abstract void show();

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

