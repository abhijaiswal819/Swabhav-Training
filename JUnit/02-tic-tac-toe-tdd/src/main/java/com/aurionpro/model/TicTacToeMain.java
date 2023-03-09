package com.aurionpro.model;

import java.util.Scanner;

public class TicTacToeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe Game");
		System.out.println("Enter name of Player 1 :");
		String playerOneName = sc.nextLine();
		System.out.println("\nEnter name of Player 2 :");
		String playerTwoName = sc.nextLine();
		Player[] players = { new Player(playerOneName), new Player(playerTwoName) };
		//Board board = new Board();
		

		Game game = new Game(players);
		ResultAnalyzer analyzer =game.getAnalyser();
		Board board=analyzer.getBoard();

		printBoard(board);

		while (true) {
			System.out.println("Player :" + " (" + game.getCurrentPlayer().getName() + ")");
			System.out.println("Enter location number between 0-8 :");
			int loc = sc.nextInt();
			game.play(loc);
			printBoard(board);
			if (analyzer.getResult() != ResultType.PROGRESS) {
				break;
			}
		}
	}

	private static void printBoard(Board board) {
		Cell[] cells = board.getCells();
		System.out.println();
		for (int i = 0; i < 9; i++) {
			String temp = cells[i].getMark() == MarkType.EMPTY ? (i + "") : cells[i].getMark().toString();
			System.out.print(temp + "  | ");
			if ((i + 1) % 3 == 0) {
				System.out.println("\n--------------");
			}
		}
		System.out.println();

	}

}
