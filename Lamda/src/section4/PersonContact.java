package section4;

import java.util.List;
import java.util.function.Predicate;

import section2.Person;

public class PersonContact {
	
	public void checkAge(List<Person> p1, Predicate<Person> pred) {
		for (Person p : p1) {
			if (pred.test(p)) {
				call(p);
			}
		}
	}



	public void call(Person p) {
		System.out.println(p.toString());
	}
}
