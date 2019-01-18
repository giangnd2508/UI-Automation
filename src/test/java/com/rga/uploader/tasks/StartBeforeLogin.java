package com.rga.uploader.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.rga.uploader.ui.UploaderUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class StartBeforeLogin implements Task {

	UploaderUI theUploaderUI;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(theUploaderUI));
	}

	public static StartBeforeLogin theUploaderUIBeforeLogin() {
		return instrumented(StartBeforeLogin.class);
	}


}
