package com.rga.uploader.model;

import java.io.File;

public class NewCase {

	private String description;
	private String fileUpload;
	private String path = System.getProperty("user.dir") + File.separator
			+ "src" + File.separator + "test" + File.separator + "resources"
			+ File.separator;

	private String color;

	public NewCase(String description, String fileUpload) {
		this.description = description;
		this.fileUpload = path + fileUpload;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(String fileUpload) {
		this.fileUpload = fileUpload;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
