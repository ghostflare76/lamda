package section2;

import java.util.List;

public class PersonTest {
	
	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		PersonContact personContact = new PersonContact();
		
		System.out.println("20 over");
		personContact.checkYoungMan(pl);
		
		System.out.println("50 over");
		personContact.checkOld(pl);
	}
}
