package importantClassesJava;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class localesTimes {

	@Test
	public void localesTimeest() {
		try {
		//Locales 
		Faker us_faker = new Faker(new Locale("en-US"));
		Faker uk_faker = new Faker(new Locale("en-GB"));
		Faker in_faker = new Faker(new Locale("en-IN"));
		
		//zipcodes
		System.out.println(String.format("%s", us_faker.address().zipCode()));
		System.out.println(String.format("%s", in_faker.address().zipCode()));
		System.out.println(String.format("%s", uk_faker.address().zipCode()));
	} catch(Exception e) {
		throw e;
	}
	}
}
