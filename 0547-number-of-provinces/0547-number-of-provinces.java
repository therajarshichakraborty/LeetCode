class Solution {

  private void bfs(int node, boolean[] visited, int[][] isConnected) {
    Queue<Integer> q = new LinkedList<>();
    q.add(node);
    visited[node] = true;

    while (!q.isEmpty()) {
      int current = q.remove();
      for (int i = 0; i < isConnected[current].length; i++) {
        if (isConnected[current][i] == 1 && !visited[i]) {
          visited[i] = true;
          q.add(i);
        }
      }
    }
    return;
  }

  private void dfs(int node, boolean[] visited, int[][] isConnected) {
    int n = isConnected.length;
    visited[node] = true;

    for(int j=0;j<n;j++){
      if(isConnected[node][j] == 1 && visited[j] == false){
        dfs(j,visited,isConnected);
      }
    }
  }

  public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    boolean visited[] = new boolean[n];


    int counter = 0;

    for (int i = 0; i < n; i++) {
      if (visited[i] == false) {
        counter++;
        // bfs(i, visited, isConnected);
        dfs(i, visited, isConnected);
      }
    }
    return counter;
  }
}