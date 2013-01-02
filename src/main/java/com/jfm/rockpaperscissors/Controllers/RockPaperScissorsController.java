package com.jfm.rockpaperscissors.Controllers;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jfm.rockpaperscissors.Models.Game;
import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Services.IGameService;
import com.jfm.rockpaperscissors.Services.IGestureService;

@Controller
public class RockPaperScissorsController {
	@Autowired
	private IGestureService gestureService;
	@Autowired
	private IGameService gameService;

	@RequestMapping(value = "/")
	public ModelAndView Index() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/gesture/", method = RequestMethod.GET)
	public @ResponseBody
	LinkedList<Gesture> GetGestures() {
		return gestureService.GetAllGestures();
	}

	@RequestMapping(value = "/game/", method = RequestMethod.POST)
	public @ResponseBody
	Game PlayGame(@RequestBody Game game) {
		return gameService.PlayGame(game);
	}

	public IGestureService getGestureService() {
		return gestureService;
	}

	public void setGestureService(IGestureService gestureService) {
		this.gestureService = gestureService;
	}

	public IGameService getGameService() {
		return gameService;
	}

	public void setGameService(IGameService gameService) {
		this.gameService = gameService;
	}
}