package com.rga.uploader.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage extends PageObject {

	public static Target LOGIN_BTN = Target.the("'login' button").locatedBy("#btn_login");

}
