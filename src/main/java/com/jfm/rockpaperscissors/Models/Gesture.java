package com.jfm.rockpaperscissors.Models;

public class Gesture {
	private String name;

	public Gesture() {
		this.name = "";
	}

	public Gesture(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (Gesture.class.equals(obj.getClass())) {
			Gesture gesture = (Gesture) obj;
			return gesture.name.equals(name);
		}
		return false;
	}
}
