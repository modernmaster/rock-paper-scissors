package com.jfm.rockpaperscissors.Services;

import java.util.LinkedList;

import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Models.Player;

public interface IGestureService {

	public abstract LinkedList<Gesture> GetAllGestures();

	public abstract Player GenerateGesture(Player player);

}