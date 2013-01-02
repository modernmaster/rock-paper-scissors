package com.jfm.rockpaperscissors.Services;

import com.jfm.rockpaperscissors.Models.Game;

public interface IGameService {

	public abstract Game PlayGame(Game game);

	public abstract Game CalculateResult(Game game);

}