package com.aurionpro.model;

public class Advertisement {
	private String message;
	private IDisplayable display;

	public Advertisement(String mesage, IDisplayable display) {
		super();
		this.message = mesage;
		this.display = display;
	}

	public String getMesage() {
		return message;
	}

	public void setMesage(String mesage) {
		this.message = mesage;
	}

	public IDisplayable getProjector() {
		return display;
	}

	public void showAdvertisement() {
		display.display(message);
	}
}
