package com.jfm.rockpaperscissors.Models;

public class Game {
	private Player Player1;
	private Player Player2;
	private String Winner;
	private String Result;

	public Player getPlayer1() {
		return Player1;
	}

	public void setPlayer1(Player player1) {
		Player1 = player1;
	}

	public Player getPlayer2() {
		return Player2;
	}

	public void setPlayer2(Player player2) {
		Player2 = player2;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public String getWinner() {
		return Winner;
	}

	public void setWinner(String winner) {
		Winner = winner;
	}
}
