package com.rga.uploader.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.rga.uploader.model.NewCase;
import com.rga.uploader.ui.CreateCasePage;
import com.rga.uploader.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Create implements Task {

	private String description;
	private String fileUpload;
	NewCase newCase;

	public Create(NewCase newCase) {
		this.newCase = newCase;
	}

	@Step("{0} creates a new case with description '#description' and password '#fileUpload'")
	@Override
	public <T extends Actor> void performAs(T actor) {

		description = newCase.getDescription();
		fileUpload = newCase.getFileUpload();

		actor.attemptsTo(Click.on(HomePage.CREATE_CASE_BUTTON),
				Enter.theValue(description).into(CreateCasePage.DESCRIPTION),
				Enter.keyValues(fileUpload).into(CreateCasePage.FILE_UPLOAD),
				Click.on(CreateCasePage.CREATE_BUTTON));

	}

	public static Create the(NewCase newCase) {
		return instrumented(Create.class, newCase);
	}

}
