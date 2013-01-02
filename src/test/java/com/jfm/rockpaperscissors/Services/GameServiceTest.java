package com.jfm.rockpaperscissors.Services;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.jfm.rockpaperscissors.Builders.GameBuilder;
import com.jfm.rockpaperscissors.Builders.GestureBuilder;
import com.jfm.rockpaperscissors.Builders.PlayerBuilder;
import com.jfm.rockpaperscissors.Models.Game;

public class GameServiceTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ShouldCalculateASuccessfulResultOfGame()
	{
		//Given
		GestureBuilder gestureBuilder = new GestureBuilder();
		gestureBuilder.CreateGestureCollection();			
		PlayerBuilder player1Builder = new PlayerBuilder();
		player1Builder.setIsHuman(true);		
		player1Builder.setGesture(gestureBuilder.getGestures().get(0));
		player1Builder.CreatePlayer();
		PlayerBuilder player2Builder = new PlayerBuilder();
		player2Builder.setIsHuman(true);
		player2Builder.setGesture(gestureBuilder.getGestures().get(1));
		player2Builder.CreatePlayer();				
		GameBuilder gameBuilder = new GameBuilder();
		gameBuilder.setPlayer1(player1Builder.getPlayer());
		gameBuilder.setPlayer2(player2Builder.getPlayer());
		gameBuilder.CreateGame();	
		Game newGame = gameBuilder.getGame();		
		
		GameService rockPaperScissorsService = new GameService();
		//When
		Game afterGame = rockPaperScissorsService.CalculateResult(newGame);		
		//Then		
		String calculatedResult = afterGame.getResult();
		Assert.assertNotNull(calculatedResult);
		Assert.assertEquals("Paper wraps Rock", calculatedResult);		
	}
	
	@Test
	public void ShouldCalculateADrawnfGame()
	{
		//Given
		GestureBuilder gestureBuilder = new GestureBuilder();
		gestureBuilder.CreateGestureCollection();			
		PlayerBuilder player1Builder = new PlayerBuilder();
		player1Builder.setIsHuman(true);		
		player1Builder.setGesture(gestureBuilder.getGestures().get(0));
		player1Builder.CreatePlayer();
		PlayerBuilder player2Builder = new PlayerBuilder();
		player2Builder.setIsHuman(true);
		player2Builder.setGesture(gestureBuilder.getGestures().get(0));
		player2Builder.CreatePlayer();				
		GameBuilder gameBuilder = new GameBuilder();
		gameBuilder.setPlayer1(player1Builder.getPlayer());
		gameBuilder.setPlayer2(player2Builder.getPlayer());
		gameBuilder.CreateGame();	
		Game newGame = gameBuilder.getGame();		
		
		GameService rockPaperScissorsService = new GameService();
		//When
		Game afterGame = rockPaperScissorsService.CalculateResult(newGame);		
		//Then		
		String calculatedResult = afterGame.getResult();
		Assert.assertNotNull(calculatedResult);
		Assert.assertEquals("Rock draws with Rock", calculatedResult);		
	}	
}
