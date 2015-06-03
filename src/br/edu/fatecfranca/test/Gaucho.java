package br.edu.fatecfranca.test;

public class Gaucho extends Championship {
	public Gaucho() {
		super("Rio Grande do Sul");
	}

	@Override
	public void show() {
		String text = "Championship: " + this.getClass().getSimpleName() +
			" State: " + this.getState();
		System.out.println(text);
	}
}

