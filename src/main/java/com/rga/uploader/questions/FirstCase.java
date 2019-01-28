package com.rga.uploader.questions;

import com.rga.uploader.model.FisrtCaseInformation;
import com.rga.uploader.ui.CaselistComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FirstCase implements Question<FisrtCaseInformation> {

	@Override
	public FisrtCaseInformation answeredBy(Actor actor) {
		String title = Text.of(CaselistComponent.FIST_ITEM_TITLE)
				.viewedBy(actor).asString();
		
		String description= "";
		
		try {
			description = Text.of(CaselistComponent.FIST_ITEM_DESCRIPTION)
					.viewedBy(actor).asString();
		} catch (Exception e) {
			
		}

		String status = Text.of(CaselistComponent.FIST_ITEM_STATUS)
				.viewedBy(actor).asString();

		return new FisrtCaseInformation(title, description, status);
	}

	public static FirstCase information() {
		return new FirstCase();
	}

}
