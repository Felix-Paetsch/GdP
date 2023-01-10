// javac -cp .; "D:\\UNI\\GdP git\\Exercise #5\\gdp_stdlib.jar" "D:\\UNI\\GdP git\\Exercise #5\\src\\MazeTester.java"

import gdp.stdlib.StdDraw;

public class MazeSolver {

	public static boolean solve(int[][] maze, int row, int col) {
		// Check if the current position is the target position
		if (maze[row][col] == 3) {
			maze[row][col] = 2;
			return true;
		}
		
		// Mark the current position as visited
		maze[row][col] = 2;
		
		// Try to solve the maze by going left, right, up, and down
		if (row > 0 && maze[row-1][col] == 1 && solve(maze, row-1, col)) {
			return true;
		}
		if (col > 0 && maze[row][col-1] == 1 && solve(maze, row, col-1)) {
			return true;
		}
		if (row < maze.length-1 && maze[row+1][col] == 1 && solve(maze, row+1, col)) {
			return true;
		}
		if (col < maze[row].length-1 && maze[row][col+1] == 1 && solve(maze, row, col+1)) {
			return true;
		}
		
		// If none of the above directions lead to the target position, backtrack
		maze[row][col] = 0;
		return false;
	}
	

	public static void draw(int[][] maze) {
		/*
		Hier ist Platz für Ihre Lösung zum Anzeigen
		*/
	}
	
	/*
	Hier können Sie bei Bedarf weitere Methoden oder Konstanten
	unterbringen ...
	*/
}