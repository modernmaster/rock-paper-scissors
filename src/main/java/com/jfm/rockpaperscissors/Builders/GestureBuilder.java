package com.jfm.rockpaperscissors.Builders;

import java.util.LinkedList;

import com.jfm.rockpaperscissors.Models.Gesture;

public class GestureBuilder {
	private LinkedList<Gesture> gestures = new LinkedList<Gesture>();

	private Gesture GestureRock = new Gesture("Rock");
	private Gesture GesturePaper = new Gesture("Paper");
	private Gesture GestureScissors = new Gesture("Scissors");

	public void CreateGestureCollection() {
		LinkedList<Gesture> gestures = new LinkedList<Gesture>();
		gestures.add(GestureRock);
		gestures.add(GesturePaper);
		gestures.add(GestureScissors);
		this.gestures = gestures;
	}

	public LinkedList<Gesture> getGestures() {
		return gestures;
	}
}
