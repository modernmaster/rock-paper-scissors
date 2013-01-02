package com.jfm.rockpaperscissors.Builders;

import java.util.LinkedList;

import com.jfm.rockpaperscissors.Models.Gesture;
import com.jfm.rockpaperscissors.Models.WinningCombination;

public class WinningCombinationBuilder {
	private LinkedList<WinningCombination> winningCombinations;
	private Gesture Rock;
	private Gesture Paper;
	private Gesture Scissors;

	public WinningCombinationBuilder() {
		winningCombinations = new LinkedList<WinningCombination>();
		Rock = new Gesture("Rock");
		Paper = new Gesture("Paper");
		Scissors = new Gesture("Scissors");
	}

	public void CreateWinningCombination() {
		winningCombinations.add(CreatePaperWinningCombination());
		winningCombinations.add(CreateScissorsWinningCombination());
		winningCombinations.add(CreateRockWinningCombination());
	}

	public LinkedList<WinningCombination> getWinningCombinations() {
		return winningCombinations;
	}

	public void setWinningCombinations(
			LinkedList<WinningCombination> winningCombinations) {
		this.winningCombinations = winningCombinations;
	}

	private WinningCombination CreateRockWinningCombination() {
		WinningCombination winningCombination = new WinningCombination();
		winningCombination.setWinningGesture(getRock());
		winningCombination.setLosingGesture(getScissors());
		winningCombination.setResultingAction("blunts");
		return winningCombination;
	}

	private WinningCombination CreatePaperWinningCombination() {
		WinningCombination winningCombination = new WinningCombination();
		winningCombination.setWinningGesture(getPaper());
		winningCombination.setLosingGesture(getRock());
		winningCombination.setResultingAction("wraps");
		return winningCombination;
	}

	private WinningCombination CreateScissorsWinningCombination() {
		WinningCombination winningCombination = new WinningCombination();
		winningCombination.setWinningGesture(getScissors());
		winningCombination.setLosingGesture(getPaper());
		winningCombination.setResultingAction("cuts");
		return winningCombination;
	}

	public Gesture getRock() {
		return Rock;
	}

	public void setRock(Gesture rock) {
		Rock = rock;
	}

	public Gesture getPaper() {
		return Paper;
	}

	public void setPaper(Gesture paper) {
		Paper = paper;
	}

	public Gesture getScissors() {
		return Scissors;
	}

	public void setScissors(Gesture scissors) {
		Scissors = scissors;
	}
}
