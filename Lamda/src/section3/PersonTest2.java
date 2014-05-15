package section3;

import java.util.List;

import section2.Person;
import section2.Person.Gender;

public class PersonTest2 {
	
	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		PersonContact personContact2 = new PersonContact();

		System.out.println("20 over");
		
		personContact2.checkOld(pl, new PersonService<Person>() {
			@Override
			public boolean checkAge(Person p) {				
				return p.getAge() >= 50;
			}			
		});		
	
		System.out.println("50 over");
		
		personContact2.checkYoungMan(pl, new PersonService<Person>() {
			@Override
			public boolean checkAge(Person p) {				
				return p.getAge() >= 20 && p.getAge() <= 29 && p.getGender() == Gender.MALE;
			}			
		});
		
	}
}
