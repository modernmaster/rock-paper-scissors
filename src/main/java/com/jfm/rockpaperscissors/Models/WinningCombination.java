package com.jfm.rockpaperscissors.Models;

public class WinningCombination {
	private Gesture winningGesture;
	private Gesture losingGesture;
	private String resultingAction;

	public Gesture getWinningGesture() {
		return winningGesture;
	}

	public void setWinningGesture(Gesture player1) {
		this.winningGesture = player1;
	}

	public Gesture getLosingGesture() {
		return losingGesture;
	}

	public void setLosingGesture(Gesture player2Gesture) {
		this.losingGesture = player2Gesture;
	}

	public String getResultingAction() {
		return resultingAction;
	}

	public void setResultingAction(String resultingAction) {
		this.resultingAction = resultingAction;
	}

	@Override
	public boolean equals(Object obj) {
		if (Gesture.class.equals(obj.getClass())) {
			Gesture winningCombinationGesture = (Gesture) obj;
			return winningGesture.getName().equals(
					winningCombinationGesture.getName());
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(winningGesture.getName());
		stringBuilder.append(" ");
		stringBuilder.append(resultingAction);
		stringBuilder.append(" ");
		stringBuilder.append(losingGesture.getName());
		return stringBuilder.toString();
	}
}
