package com.rga.uploader.features;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import com.rga.uploader.interactions.Refresh;
import com.rga.uploader.questions.NewCaseForm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.rga.uploader.model.NewCase;
import com.rga.uploader.questions.FirstCase;
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
@WithTags({@WithTag("feature:smoke"),})
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
        String status = "PII EXTRACTING";

        NewCase newCase = new NewCase(description, fileUpload);
        // =========================================================

        givenThat(jame).wasAbleTo(Start.theApplication());

        when(jame).attemptsTo(Login.withClientAccount(), Create.the(newCase), Refresh.thePage());

        then(jame).should(
                seeThat(FirstCase.information(),
                        displays("description", equalTo(description))),
                seeThat(FirstCase.information(),
                        displays("status", equalTo(status))));

    }

    @Test
    public void create_case_without_description() {

        // Data test
        String description = "";
        String fileUpload = "pii-policy.csv";
        String status = "PII EXTRACTING";

        NewCase newCase = new NewCase(description, fileUpload);
        // =========================================================

        givenThat(jame).wasAbleTo(Start.theApplication());

        when(jame).attemptsTo(Login.withClientAccount(), Create.the(newCase), Refresh.thePage());

        then(jame).should(
                seeThat(FirstCase.information(),
                        displays("description", equalTo(description))),
                seeThat(FirstCase.information(),
                        displays("status", equalTo(status))));
    }

    @Test
    public void create_case_without_file_upload() {

        // Data test
        String description = "customer";
        String fileUpload = "";

        NewCase newCase = new NewCase(description, fileUpload);
        // =========================================================

        givenThat(jame).wasAbleTo(Start.theApplication());

        when(jame).attemptsTo(Login.withClientAccount(), Create.the(newCase));

        then(jame).should(seeThat(NewCaseForm.getFailedColor(), containsString("rgb(102, 102, 102)")));
    }

}
