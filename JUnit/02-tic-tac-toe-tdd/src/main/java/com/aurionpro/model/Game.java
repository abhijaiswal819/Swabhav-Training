package com.aurionpro.model;

public class Game {

	private Player currentPlayer;
	private Player[] players = new Player[2];
	private ResultAnalyzer analyser;
	private Board board;

	public Game(Player[] players) {
		super();
		this.currentPlayer = players[0];
		this.players = players;
		this.analyser = new ResultAnalyzer();
		this.board = analyser.getBoard();
		players[0].setMark(MarkType.X);
		players[1].setMark(MarkType.O);
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public ResultAnalyzer getAnalyser() {
		return analyser;
	}

	public void setAnalyser(ResultAnalyzer analyser) {
		this.analyser = analyser;
	}

	public void play(int loc) {
		try {
			board.setCellMark(loc, currentPlayer.getMark());
			ResultType result = analyser.analyzeResult();
			if (result == ResultType.PROGRESS) {
				switchPlayer();
			}
			if (result == ResultType.WIN) {
				System.out.println(currentPlayer.getName() + " Win's!!");
			}

			if (result == ResultType.DRAW) {
				System.out.println(" Draw!!");
			}
		} catch (CellAlreadyMarkedException e) {
			System.out.println(e.getMessage());
		} catch (InvalidLocationException e) {
			System.out.println(e.getMessage());
		}
	}

	private void switchPlayer() {
		if (currentPlayer == players[0]) {
			currentPlayer = players[1];
		} else
			currentPlayer = players[0];
	}
}
