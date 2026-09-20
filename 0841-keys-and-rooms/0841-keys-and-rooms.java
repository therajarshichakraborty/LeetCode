class Solution {

    private void bfs(int start,List<List<Integer>> adj, boolean[] visited){
      Queue<Integer> q = new LinkedList<>();
      q.add(start);

      while(q.size() > 0){
        int front = q.remove();

        for(int x: adj.get(front)){
          if(visited[x] == false){
            visited[x] = true;
            q.add(x);
          }
        }
      }

      return;
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean [] visited = new boolean[n];
        visited[0] = true;

        bfs(0, adj, visited);

        for(boolean element : visited){
          if(element == false){
            return false;
          }
        }

        return true;
    }
}