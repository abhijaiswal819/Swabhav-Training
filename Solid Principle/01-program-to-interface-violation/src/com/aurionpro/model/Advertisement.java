package com.aurionpro.model;

public class Advertisement {
	private Projector projector;
	private String message;

	public Advertisement( String message) {
		super();
		this.projector = new Projector();
		this.message = message;
	}

	public Projector getProjector() {
		return projector;
	}

	public void setProjector(Projector projector) {
		this.projector = projector;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void showAdvertisement() {
		projector.display(message);
	}

	

}
