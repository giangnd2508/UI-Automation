package com.rga.uploader.model;

public class FisrtCaseInformation {

	private String title;
	private String description;
	private String status;

	public FisrtCaseInformation(String title, String description, String status) {
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
