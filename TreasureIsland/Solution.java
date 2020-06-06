package leetcode;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		char[][] island = new char[][]{
				{'O', 'O', 'O', 'O'},
				{'D', 'O', 'D', 'O'},
				{'O', 'O', 'O', 'O'},
				{'X', 'D', 'D', 'O'}
		};
		int result = treasureIsland(island);
		System.out.println(String.format("%s (expect 5)", result));
	}
	
	public static int treasureIsland(char[][] island) {
		
		int m = island.length;
		int n = island[0].length;
		
		boolean[][] visited = new boolean[m][n];
		int[][] directions = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
		
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0, 0});
		visited[0][0] = true;
		
		while (!queue.isEmpty()) {
			
			int[] position = queue.poll();	
			
			int x = position[0];
			int y = position[1];
			int steps = position[2];
			
			if (island[x][y] == 'X') {
				return steps;
			}
			
			for (int[] dir : directions) {
				int nextX = x + dir[0];
				int nextY = y + dir[1];
				
				if (nextX >= 0 && nextX < n && nextY >=0 && nextY < m &&
						island[nextX][nextY] != 'D' && !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					queue.add(new int[] {nextX, nextY, steps + 1});
				}
				
			}
			
		}
		
		return -1;
	}

}
