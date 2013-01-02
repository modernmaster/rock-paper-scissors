package com.jfm.rockpaperscissors.Services;

import java.util.LinkedList;
import java.util.Random;

import com.jfm.rockpaperscissors.Builders.GestureBuilder;
import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Models.Player;

public class GestureService implements IGestureService {
	public LinkedList<Gesture> GetAllGestures() {
		GestureBuilder gestureBuilder = new GestureBuilder();
		gestureBuilder.CreateGestureCollection();
		return gestureBuilder.getGestures();
	}

	public Player GenerateGesture(Player player) {
		GestureBuilder gestureBuilder = new GestureBuilder();
		gestureBuilder.CreateGestureCollection();
		Random random = new Random();
		player.setGesture(gestureBuilder.getGestures().get(
				random.nextInt(gestureBuilder.getGestures().size())));
		return player;
	}
}
