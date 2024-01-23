package importantClassesJava;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class fakerClass {

	@Test
	public void fakeClasses() {
		// faker class allows us to user FAKE DATA CLASSES
		Faker faker = new Faker();
		
		//
		String first_name = faker.address().firstName();
		String last_name = faker.address().lastName();
		String address_name = faker.address().fullAddress();
		String street_address = faker.address().streetAddress();
		System.out.println(first_name + "\n" + last_name + "\n" + address_name + "\n" + street_address);
		
		String animal_name = faker.animal().name();
		System.out.println(animal_name);
	}
}
