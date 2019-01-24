package com.rga.uploader.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.rga.uploader.ui.UploaderUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Start implements Task{
	
	UploaderUI theUploaderUI;

	@Step("{0} open the page Started")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(theUploaderUI));
	}

	public static Start theApplication() {
		return instrumented(Start.class);
	}


}
