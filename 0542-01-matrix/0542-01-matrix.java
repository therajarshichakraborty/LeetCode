class Solution {
  public int[][] updateMatrix(int[][] mat) {
    if (mat == null || mat.length == 0 || mat[0].length == 0) {
      return new int[0][0];
    }

    int rows = mat.length;
    int cols = mat[0].length;
    int[][] dist = new int[rows][cols];
    Queue<int[]> q = new LinkedList<>();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (mat[i][j] == 0) {
          dist[i][j] = 0;
          q.offer(new int[] { i, j });
        } else {
          dist[i][j] = -1;
        }
      }
    }

    int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    int ring = 0;

    while (!q.isEmpty()) {
      int size = q.size();
      ring++;

      for (int i = 0; i < size; i++) {
        int cell[] = q.poll();

        int r = cell[0];
        int c = cell[1];

        for (int[] dir : directions) {
          int nr = r + dir[0];
          int nc = c + dir[1];
          if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && dist[nr][nc] == -1) {
            dist[nr][nc] = ring;
            q.offer(new int[] { nr, nc });
          }
        }
      }
    }

    return dist;

  }
}