package com.jfm.rockpaperscissors.Services;

import java.util.LinkedList;

import com.jfm.rockpaperscissors.Builders.WinningCombinationBuilder;
import com.jfm.rockpaperscissors.Models.Game;
import com.jfm.rockpaperscissors.Models.WinningCombination;

public class GameService implements IGameService {
	private IGestureService gestureService;

	public Game PlayGame(Game game) {
		if (!game.getPlayer1().getIsHuman()) {
			game.setPlayer1(gestureService.GenerateGesture(game.getPlayer1()));
		}
		if (!game.getPlayer2().getIsHuman()) {
			game.setPlayer2(gestureService.GenerateGesture(game.getPlayer2()));
		}
		return CalculateResult(game);
	}

	public Game CalculateResult(Game game) {
		StringBuffer stringBuffer = new StringBuffer();
		if (IsDrawnGame(game)) {
			stringBuffer.append(game.getPlayer1().getGesture().getName());
			stringBuffer.append(" draws with ");
			stringBuffer.append(game.getPlayer2().getGesture().getName());
			game.setResult(stringBuffer.toString());
			game.setWinner("It's a draw!");
		} else if (IsPlayer1Winner(game)) {
			game.setWinner("Player 1 wins!");
		} else if (IsPlayer2Winner(game)) {
			game.setWinner("Player 2 wins!");
		} else {
			stringBuffer.append(game.getPlayer1().getGesture().getName());
			stringBuffer.append(" unknown winning combination with ");
			stringBuffer.append(game.getPlayer2().getGesture().getName());
			game.setResult(stringBuffer.toString());
		}
		return game;
	}

	private Boolean IsPlayer1Winner(Game game) {
		WinningCombinationBuilder winningCombinationsBuilder = new WinningCombinationBuilder();
		winningCombinationsBuilder.CreateWinningCombination();
		LinkedList<WinningCombination> winningCombinations = winningCombinationsBuilder
				.getWinningCombinations();
		for (WinningCombination winningCombination : winningCombinations) {
			if (winningCombination.getWinningGesture().equals(
					game.getPlayer1().getGesture())
					&& winningCombination.getLosingGesture().equals(
							game.getPlayer2().getGesture())) {
				game.setResult(winningCombination.toString());
				return true;
			}
		}
		return false;
	}

	private Boolean IsPlayer2Winner(Game game) {
		WinningCombinationBuilder winningCombinationsBuilder = new WinningCombinationBuilder();
		winningCombinationsBuilder.CreateWinningCombination();
		LinkedList<WinningCombination> winningCombinations = winningCombinationsBuilder
				.getWinningCombinations();
		for (WinningCombination winningCombination : winningCombinations) {
			game.setResult(winningCombination.toString());
			if (winningCombination.getWinningGesture().equals(
					game.getPlayer2().getGesture())
					&& winningCombination.getLosingGesture().equals(
							game.getPlayer1().getGesture())) {
				game.setResult(winningCombination.toString());
				return true;
			}
		}
		return false;
	}

	private Boolean IsDrawnGame(Game game) {
		return game.getPlayer1().getGesture()
				.equals(game.getPlayer2().getGesture());
	}

	public IGestureService getGestureService() {
		return gestureService;
	}

	public void setGestureService(IGestureService gestureService) {
		this.gestureService = gestureService;
	}

}
