package com.wolters.i18ndemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NSample {

	public static void main(String[] args) {

		String language = new String("de");
		String country = new String("DE");

		Locale currentLocale;
		ResourceBundle messages;

//        currentLocale = new Locale(language, country);

		// currentLocale = new Locale(System.getProperty("user.language"),
		// System.getProperty("user.country"));
		currentLocale = Locale.getDefault();
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		System.out.println(messages.getString("greetings"));
		System.out.println(messages.getString("inquiry"));
		System.out.println(messages.getString("farewell"));
	}
}