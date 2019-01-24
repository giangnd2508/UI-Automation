package com.rga.uploader.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BeforeLoginPage extends PageObject {

	public static Target LOGIN_BTN = Target.the("'login' button").locatedBy("#btn_login");

}
