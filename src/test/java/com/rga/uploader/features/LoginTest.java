package com.rga.uploader.features;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.rga.uploader.tasks.Login;
import com.rga.uploader.tasks.Start;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed
	public WebDriver hisBrowser;

	Actor jame = Actor.named("James - A client");

	@Before
	public void jameCanBrowseTheWeb() {
		jame.can(BrowseTheWeb.with(hisBrowser));
	}

	@Test
	public void should_login_success() {
		givenThat(jame).wasAbleTo(Start.theUploaderUIBeforeLogin());
		when(jame).attemptsTo(Login.withAccount("jame", "12345678"));
	}
	
	@Test
	public void get_into_home_page() {
		givenThat(jame).wasAbleTo(Start.theHomePageWithRoleClient());
	}

}
