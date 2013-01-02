package com.jfm.rockpaperscissors.Builders;

import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Models.Player;

public class PlayerBuilder {
	private Player player = new Player();
	private Gesture gesture = new Gesture("Rock");
	private Boolean isHuman = false;

	public Player getPlayer() {
		return player;
	}

	public void CreatePlayer() {
		this.player = new Player();
		this.player.setGesture(getGesture());
		this.player.setIsHuman(getIsHuman());
	}

	private Gesture getGesture() {
		return gesture;
	}

	public void setGesture(Gesture gesture) {
		this.gesture = gesture;
	}

	private Boolean getIsHuman() {
		return isHuman;
	}

	public void setIsHuman(Boolean isHuman) {
		this.isHuman = isHuman;
	}

}
