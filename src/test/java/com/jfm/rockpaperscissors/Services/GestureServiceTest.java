package com.jfm.rockpaperscissors.Services;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jfm.rockpaperscissors.Builders.PlayerBuilder;
import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Models.Player;

public class GestureServiceTest {
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void ShouldReturnAListOfGestures()
	{
		//Given
		IGestureService gestureService = new GestureService();
		//When
		LinkedList<Gesture> gestures = gestureService.GetAllGestures();	
		//Then
		Assert.assertNotNull(gestures);
		Assert.assertEquals(3,gestures.size());				
	}

	@Test
	public void ShouldReturnARandomGestureForPlayer()
	{
		//Given
		PlayerBuilder playerBuilder = new PlayerBuilder();
		playerBuilder.CreatePlayer();
		Player player1 = playerBuilder.getPlayer();
		playerBuilder = new PlayerBuilder();		
		playerBuilder.CreatePlayer();
		Player player2 = playerBuilder.getPlayer();
		playerBuilder = new PlayerBuilder();
		playerBuilder.CreatePlayer();
		Player player3 = playerBuilder.getPlayer();
		playerBuilder = new PlayerBuilder();
		playerBuilder.CreatePlayer();
		Player player4 = playerBuilder.getPlayer();
		playerBuilder = new PlayerBuilder();
		playerBuilder.CreatePlayer();
		Player player5 = playerBuilder.getPlayer();			
		IGestureService gestureService = new GestureService();		
		//When
		player1 = gestureService.GenerateGesture(player1);
		player2 = gestureService.GenerateGesture(player2);
		player3 = gestureService.GenerateGesture(player3);
		player4 = gestureService.GenerateGesture(player4);
		player5 = gestureService.GenerateGesture(player5);
		//Then
		Assert.assertFalse(player1.equals(player2)
				&& player2.equals(player3)
				&& player3.equals(player4)
				&& player4.equals(player5));				
	}	
	
}
