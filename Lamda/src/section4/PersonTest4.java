package section4;

import java.util.List;
import java.util.function.Predicate;

import section2.Person;
import section2.Person.Gender;

public class PersonTest4 {

	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		PersonContact personContact = new PersonContact();

		Predicate<Person> isOld = p -> p.getAge() >= 50;
		Predicate<Person> isYoungMan = p -> p.getAge() >= 20 && p.getAge() <= 29 && p.getGender() == Gender.MALE;
		
		System.out.println("50 over");
		personContact.checkAge(pl, isOld);
		
		System.out.println("20 over");
		personContact.checkAge(pl, isYoungMan);
	}

}
