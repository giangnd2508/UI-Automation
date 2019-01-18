package com.rga.uploader.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.steps.Instrumented;

public class Start {

	public static StartBeforeLogin theUploaderUIBeforeLogin() {
		return instrumented(StartBeforeLogin.class);
	}

	public static Login theHomePageWithRoleClient() {
		return Instrumented.instanceOf(Login.class).withProperties("jame",
				"12345678");
	}

	public static Login theHomePageWithRoleTU() {
		return Instrumented.instanceOf(Login.class).withProperties("harry",
				"12345678");
	}

	public static Login theHomePageWithRoleGRDA() {
		return Instrumented.instanceOf(Login.class).withProperties("anna",
				"12345678");
	}

	public static Login theHomePageWithRoleRGA() {
		return Instrumented.instanceOf(Login.class).withProperties("john",
				"12345678");
	}


}
