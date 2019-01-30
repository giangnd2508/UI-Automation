package com.rga.uploader.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateCasePage extends PageObject {

    public static Target DESCRIPTION = Target.the("'DESCRIPTION' field").locatedBy("//*[@id='cc_description']/div[2]/div[1]");
    public static Target FILE_UPLOAD = Target.the("'FILE_UPLOAD' field").locatedBy("//*[@id='cc_dropzone']/input");
    public static Target CREATE_BUTTON = Target.the("'CREATE_BUTTON' button").locatedBy("#btn_cc_create");
    public static Target DROP_ZONE = Target.the("'DROP_ZONE' filed").locatedBy("#cc_dropzone");
}
