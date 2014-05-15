package section2;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int age;
	private String email;

	public enum Gender {
		MALE, FEMALE
	}

	private Gender gender;

	public static class Builder {

		private String name = "";
		private int age = 0;
		private Gender gender = Gender.FEMALE;
		private String email = "";

		public Person.Builder name(String name) {
			this.name = name;
			return this;
		}

		public Person.Builder age(int age) {
			this.age = age;
			return this;
		}

		public Person.Builder gender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public Person.Builder email(String email) {
			this.email = email;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person() {
		super();
	}

	private Person(Person.Builder builder) {
		name = builder.name;
		age = builder.age;
		gender = builder.gender;
		email = builder.email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public static List<Person> createShortList(){
	    List<Person> people = new ArrayList<>();
	    
	    people.add(
	      new Person.Builder()
	            .name("Bob")	        
	            .age(8)
	            .gender(Gender.MALE)
	            .email("bob.baker@example.com")	         
	            .build() 
	      );
	    
	    people.add(
	      new Person.Builder()
	            .name("Jane")	        
	            .age(19)
	            .gender(Gender.FEMALE)
	            .email("jane.doe@example.com")	         
	            .build() 
	      ); 
	    
	    people.add(
		      new Person.Builder()
		            .name("Robort")	        
		            .age(22)
		            .gender(Gender.MALE)
		            .email("Robort.john@example.com")	         
		            .build() 
		); 
	    
	    people.add(
		      new Person.Builder()
		            .name("Jack")	        
		            .age(24)
		            .gender(Gender.MALE)
		            .email("jack.rich@example.com")	         
		            .build() 
		); 
		    
	    
	    people.add(
	      new Person.Builder()
	            .name("Phil")	         
	            .age(55)
	            .gender(Gender.MALE)
	            .email("phil.smith@examp;e.com")	          
	            .build()
	    );
	    
	    
	    return people;
	  }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", gender=" + gender + "]";
	}

	
	
}
