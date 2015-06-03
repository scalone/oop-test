package br.edu.fatecfranca.test;

public class Paulista extends Championship {
	public Paulista() {
		super("São Paulo");
	}

	@Override
	public void show() {
		String text = "Championship: " + this.getClass().getSimpleName() +
			" State: " + this.getState();
		System.out.println(text);
	}
}