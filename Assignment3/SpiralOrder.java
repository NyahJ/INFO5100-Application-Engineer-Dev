package assignment3;

public class SpiralOrder {
	public static int[] spiralOrder(int[][] matrix) {
		int length = matrix[0].length;
		int width = matrix.length;
		int size = length * width;
		int[] result = new int[size];
		boolean[][] visited = new boolean[width][length];
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		int x = 0;
		int y = 0;
		int direction = 0;
		
		for (int i = 0; i < size; i++) {
			result[i] = matrix[y][x];
			visited[y][x] = true;
			int xx = x + dx[direction];
			int yy = y + dy[direction];
			if (xx >= 0 && xx < length && yy >= 0 && yy < width && visited[yy][xx] == false) {
				x = xx;
				y = yy;
			} else {
				direction += 1;
				direction %= 4;
				x += dx[direction];
				y += dy[direction];
			}
		}
		
		return result;
	}
}
