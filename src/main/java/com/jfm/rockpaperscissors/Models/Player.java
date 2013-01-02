package com.jfm.rockpaperscissors.Models;

public class Player {
	private boolean IsHuman;
	private Gesture gesture;

	public boolean getIsHuman() {
		return IsHuman;
	}

	public void setIsHuman(boolean isHuman) {
		IsHuman = isHuman;
	}

	public Gesture getGesture() {
		return gesture;
	}

	public void setGesture(Gesture gesture) {
		this.gesture = gesture;
	}

	@Override
	public boolean equals(Object obj) {
		Player player = (Player) obj;
		return player.getIsHuman() == getIsHuman()
				&& player.getGesture().getName().equals(getGesture().getName());
	}

}
