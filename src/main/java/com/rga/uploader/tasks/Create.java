package com.rga.uploader.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.rga.uploader.model.NewCase;
import com.rga.uploader.ui.CreateCasePage;
import com.rga.uploader.ui.HomePage;
import com.rga.uploader.ui.UploaderUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Create implements Task {

	NewCase newCase;

	public Create(NewCase newCase) {
		this.newCase = newCase;
	}

	UploaderUI uploaderUI;

	@Step("{0} creates a new case")
	@Override
	public <T extends Actor> void performAs(T actor) {

		String description = newCase.getDescription();
		String fileUpload = newCase.getFileUpload();

		actor.attemptsTo(Click.on(HomePage.CREATE_CASE_BUTTON),
				Enter.theValue(description).into(CreateCasePage.DESCRIPTION),
				Enter.keyValues(fileUpload).into(CreateCasePage.FILE_UPLOAD),
				Click.on(CreateCasePage.CREATE_BUTTON));
	}

	public static Create the(NewCase newCase) {
		return instrumented(Create.class, newCase);
	}

}
