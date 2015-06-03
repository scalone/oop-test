
package br.edu.fatecfranca.test;
import java.util.ArrayList;

public class Curriculum {
	private String personName;
	private ArrayList<Activity> activities;

	public Curriculum(String personName) {
		this.personName = personName;
		this.activities = new ArrayList<Activity>();
	}

	public Curriculum() {
		this("Thiago");
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void createActivity(Activity activity) {
		this.activities.add(activity);
	}

	public ArrayList<Activity> getActivities() {
		return this.activities;
	}

	public Activity getActivity(Activity activity) {
    for(Activity activity2: activities) {
      if (activity2.getName().equals(activity.getName())) {
        return activity2;
      }
    }

		return null;
	}

	public String release() {
		String text = "Curriculum\n";
    for(Activity activity: activities) {
			// Neste ponto ocorre o polimorfismo, aonde chamamos o método
			// toString() para qualquer objeto(Event ou Course).
      text = text.concat(activity.toString() + "\n");
    }
		return text;
	}
}

