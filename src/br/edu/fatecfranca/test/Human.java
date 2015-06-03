
package br.edu.fatecfranca.test;

public class Human implements Sleep, Run {
	public String running() {
		return "go go go";
	}

	public String sleeping() {
		return "ZZZZzzzzZzz";
	}
}

