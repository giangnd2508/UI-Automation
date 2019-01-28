package com.rga.uploader.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CaselistComponent extends PageObject {
	
	public static Target FIST_ITEM_TITLE = Target.the("'title' label")
			.locatedBy("//*[@id='case_list_item_0']/div/div[1]/span[1]");
	
	public static Target FIST_ITEM_DESCRIPTION = Target.the("'description' field")
			.locatedBy("#case_list_item_0 div.description");
	
	public static Target FIST_ITEM_STATUS = Target.the("'status' label")
			.locatedBy("//*[@id='case_list_item_0']/div/div[1]/span[2]/span");
	
	

}
