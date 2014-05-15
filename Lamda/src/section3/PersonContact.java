package section3;

import java.util.List;

import section2.Person;

public class PersonContact {
	
	public void checkOld(List<Person> p1, PersonService<Person> p2) {
		for (Person p : p1) {
			if (p2.checkAge(p)) {
				call(p);
			}
		}
	}

	public void checkYoungMan(List<Person> p1, PersonService<Person> p2) {
		for (Person p : p1) {
			if (p2.checkAge(p)) {
				call(p);
			}
		}
	}

	public void call(Person p) {
		System.out.println(p.toString());
	}
}
