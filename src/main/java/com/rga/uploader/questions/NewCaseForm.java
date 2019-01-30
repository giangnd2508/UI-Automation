package com.rga.uploader.questions;

import com.rga.uploader.ui.CreateCasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CSSValue;

public class NewCaseForm implements Question<String> {

    public static Question<String> getFailedColor() {
        return new NewCaseForm();
    }

    @Override
    public String answeredBy(Actor actor) {
        return CSSValue.of(CreateCasePage.DROP_ZONE)
                .named("border-color").viewedBy(actor).asString();
    }


}
