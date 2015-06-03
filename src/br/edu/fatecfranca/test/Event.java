
package br.edu.fatecfranca.test;

public class Event extends Activity {
	protected String city;

	public Event(String name, String city) {
		super(name);
		this.city = city;
	}

	public Event() {
		this("RubyConf", "San Diego");
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Event: " + this.getName() + " City: " + this.getCity();
	}
}

