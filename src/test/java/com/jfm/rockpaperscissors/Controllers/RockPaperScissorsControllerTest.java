package com.jfm.rockpaperscissors.Controllers;

import java.util.LinkedList;

import org.easymock.EasyMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jfm.rockpaperscissors.Builders.GameBuilder;
import com.jfm.rockpaperscissors.Builders.GestureBuilder;
import com.jfm.rockpaperscissors.Models.Game;
import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Services.IGameService;
import com.jfm.rockpaperscissors.Services.IGestureService;

public class RockPaperScissorsControllerTest {
	
	private IGameService gameService;
	private IGestureService gestureService;	

	@Before
	public void setUp() throws Exception {
		gameService = EasyMock.createMock(IGameService.class);		
		gestureService = EasyMock.createMock(IGestureService.class);
	}
	
	@Test
	public void ShouldReturnAResultOfAGame() {
		//Given
		GameBuilder gameBuilder = new GameBuilder();
		gameBuilder.CreateGame();
		Game game = gameBuilder.getGame(); 
		RockPaperScissorsController rockPaperScissorsController= new RockPaperScissorsController();
		expect(gameService.PlayGame(game)).andReturn(gameBuilder.getGame()).times(1);
		rockPaperScissorsController.setGameService(gameService);
		replay(gameService);
		//When
		Game outcomeFromGame = rockPaperScissorsController.PlayGame(game);
		//Then
		verify(gameService);
		Assert.assertNotNull(outcomeFromGame);		
	}
	
	@Test
	public void ShouldReturnAListOfAvailableGestures() {
		GestureBuilder gestureBuilder = new GestureBuilder();
		gestureBuilder.CreateGestureCollection();
		RockPaperScissorsController rockPaperScissorsController= new RockPaperScissorsController();
		expect(gestureService.GetAllGestures()).andReturn(gestureBuilder.getGestures()).times(1);
		rockPaperScissorsController.setGestureService(gestureService);
		replay(gestureService);
		//When
		LinkedList<Gesture> gestures = rockPaperScissorsController.GetGestures();
		//Then
		verify(gestureService);
		Assert.assertNotNull(gestures);
		Assert.assertEquals(3,gestures.size());
   }		
}
