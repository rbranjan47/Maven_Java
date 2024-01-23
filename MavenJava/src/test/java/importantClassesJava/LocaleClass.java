package importantClassesJava;

import java.util.Locale;

import org.testng.annotations.Test;

public class LocaleClass {
	@Test
	public void testLocales() {
		//locale to get default location, address...
		Locale locales = Locale.getDefault();
		System.out.println(locales.getCountry());
		System.out.println(locales.getLanguage());
	}
}
