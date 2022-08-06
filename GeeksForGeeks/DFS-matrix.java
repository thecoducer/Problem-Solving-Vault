// https://www.geeksforgeeks.org/depth-first-traversal-dfs-on-a-2d-array/

import java.util.*;

class Solution {

    // TC: O(N * M)
    // SC: O(N * M)

    private static final int ROW = 3;
    private static final int COL = 3;
    private static final int dROW[] = { 0, 1, 0, -1 };
    private static final int dCOL[] = { -1, 0, 1, 0 };

    static class Pair {
        public int first;
        public int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // function to check if the coordinates are out of bounds
    private static boolean isValid(int row, int col) {
        if (row < 0 || row >= ROW || col < 0 || col >= COL) {
            return false;
        }

        return true;
    }

    private static List<Integer> dfs(int row, int col, int[][] matrix, boolean[][] visited) {
        Stack<Pair> stack = new Stack<>();
        List<Integer> dfs = new ArrayList<>();

        stack.push(new Pair(row, col));

        while (!stack.isEmpty()) {
            Pair element = stack.pop();

            row = element.first;
            col = element.second;

            if (isValid(row, col) && visited[row][col]) {
                continue;
            }

            visited[row][col] = true;
            dfs.add(matrix[row][col]);

            // lookup the adjacent cells 
            for (int i = 0; i < 4; i++) {
                int adjX = row + dROW[i];
                int adjY = col + dCOL[i];

                if (isValid(adjX, adjY)) {
                    stack.push(new Pair(adjX, adjY));
                }
            }
        }
        return dfs;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { -1, 2, 3 },
                { 0, 9, 8 },
                { 1, 0, 1 }
        };

        boolean[][] visited = new boolean[ROW][COL];

        dfs(0, 0, matrix, visited).forEach(data -> System.out.print(data + " "));

        System.out.println();
    }
}