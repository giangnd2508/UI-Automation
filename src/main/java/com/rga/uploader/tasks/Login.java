package com.rga.uploader.tasks;

import com.rga.uploader.ui.BeforeLoginPage;
import com.rga.uploader.ui.LoginPage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {

	private final String username;
	private final String password;

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Step("{0} login with username '#username' and password '#password'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				StartBeforeLogin.theUploaderUIBeforeLogin(),
				Click.on(BeforeLoginPage.LOGIN_BTN),
				Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
				Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
				Click.on(LoginPage.LOGIN_BUTTON));

	}

	public static Login withAccount(String username, String password) {
		return Instrumented.instanceOf(Login.class).withProperties(username,
				password);
	}

}
