package com.jfm.rockpaperscissors.Builders;

import com.jfm.rockpaperscissors.Models.Game;
import com.jfm.rockpaperscissors.Models.Player;

public class GameBuilder {
	private Game game = new Game();
	private Player player1 = new Player();
	private Player player2 = new Player();
	private String result = "Player 1 Wins: Rock blunt Scissors";

	public Game getGame() {
		return game;
	}

	public void CreateGame() {
		this.game = new Game();
		this.game.setPlayer1(getPlayer1());
		this.game.setPlayer2(getPlayer2());
		this.game.setResult(getResult());
	}

	private Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	private Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	private String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.game.setResult(result);
	}
}
