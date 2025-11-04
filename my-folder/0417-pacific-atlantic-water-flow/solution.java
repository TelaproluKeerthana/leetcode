class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        
        // Run DFS from all ocean-bordering cells
        for (int c = 0; c < cols; c++) {
            dfs(0, c, pacific, heights[0][c], heights);
            dfs(rows - 1, c, atlantic, heights[rows - 1][c], heights);
        }
        for (int r = 0; r < rows; r++) {
            dfs(r, 0, pacific, heights[r][0], heights);
            dfs(r, cols - 1, atlantic, heights[r][cols - 1], heights);
        }

        // Collect results
        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }
        return res;
    }

    private void dfs(int row, int col, boolean[][] visit, int prevHeight, int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        // Boundary + visited + invalid height check
        if (row < 0 || row >= rows || col < 0 || col >= cols || visit[row][col] || heights[row][col] < prevHeight) {
            return;
        }

        visit[row][col] = true;
        int currHeight = heights[row][col];

        dfs(row + 1, col, visit, currHeight, heights);
        dfs(row - 1, col, visit, currHeight, heights);
        dfs(row, col + 1, visit, currHeight, heights);
        dfs(row, col - 1, visit, currHeight, heights);
    }
}

