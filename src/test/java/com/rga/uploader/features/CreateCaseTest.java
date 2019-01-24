package com.rga.uploader.features;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.rga.uploader.model.NewCase;
import com.rga.uploader.tasks.Create;
import com.rga.uploader.tasks.Login;
import com.rga.uploader.tasks.Start;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@WithTags({
    @WithTag("feature:smoke"),
})
public class CreateCaseTest {

	@Managed
	public WebDriver hisBrowser;

	Actor jame = Actor.named("James - A client");

	@Before
	public void jameCanBrowseTheWeb() {
		jame.can(BrowseTheWeb.with(hisBrowser));
	}

	@Test
	public void create_case_success() {

		// Data test
		String description = "new customer";
		String fileUpload = "pii-policy.csv";

		NewCase newCase = new NewCase(description, fileUpload);

		/*
		 * Test case: create a new case success with description "new customer"
		 * and fileUpload "pii-policy.csv"
		 */

		givenThat(jame).wasAbleTo(Start.theApplication());

		when(jame).attemptsTo(
				Login.withClientAccount(), 
				Create.the(newCase));

		/*
		 * then(jame).should( seeThat(CaseListDescription.items,
		 * hasItem(description)));
		 */
	}

}
