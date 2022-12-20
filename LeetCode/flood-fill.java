class Solution {

    // DFS approach

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // if the color of the starting pixel is already same as the desired color
        if (image[sr][sc] == color) {
            return image;
        }

        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        // checks for array out of bounds and also for unequal color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor) {
            return;
        }

        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, oldColor, newColor);
        fill(image, sr - 1, sc, oldColor, newColor);
        fill(image, sr, sc + 1, oldColor, newColor);
        fill(image, sr, sc - 1, oldColor, newColor);
    }
}
