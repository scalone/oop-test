package br.edu.fatecfranca.test;

public class Carioca extends Championship {
	public Carioca() {
		super("Rio de Janeiro");
	}

	@Override
	public void show() {
		String text = "Championship: " + this.getClass().getSimpleName() +
			" State: " + this.getState();
		System.out.println(text);
	}
}

