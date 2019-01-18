package com.rga.uploader.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

	public static Target USERNAME_FIELD = Target.the("'username' field")
			.locatedBy("#username");
	public static Target PASSWORD_FIELD = Target.the("'password' field")
			.locatedBy("#password");
	public static Target LOGIN_BUTTON = Target.the("'login' button")
			.locatedBy("#kc-login");
}
