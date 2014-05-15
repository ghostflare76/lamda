package section2;

import java.util.List;

import section2.Person.Gender;

public class PersonContact {

	public void checkOld(List<Person> p1) {
		for (Person p : p1) {
			if (isOver50Age(p)) {
				call(p);
			}
		}
	}

	public void checkYoungMan(List<Person> p1) {
		for (Person p : p1) {
			if (isOver20AndMan(p)) {
				call(p);
			}
		}
	}
	
	public boolean isOver50Age(Person p) {
		return p.getAge() >= 50;
	}
	
	public boolean isOver20AndMan(Person p) {
		return p.getAge() >= 20 && p.getAge() <= 29 && p.getGender() == Gender.MALE;
			
	}

	public void call(Person p) {
		System.out.println(p.toString());
	}
}
