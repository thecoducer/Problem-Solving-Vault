class Solution {

    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int count = 0;

        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, i, visited);
                count++;
            }
        }

        return count;
    }

    // recursive DFS
    private void dfs(int[][] M, int v, boolean[] visited) {
        for (int i = 0; i < M.length; i++) {
            if (M[v][i] == 1 && !visited[i]) {
                visited[v] = true;
                dfs(M, i, visited);
            }
        }
    }
}
