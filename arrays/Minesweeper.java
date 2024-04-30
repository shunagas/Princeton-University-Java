public class Minesweeper {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] grid = new char[m][n];

        for (int i = 0; i < k; i++) {
            int r, c;
            do {
                r = (int) (Math.random() * m);
                c = (int) (Math.random() * n);
            }
            while (grid[r][c] == '*');
            grid[r][c] = '*';
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') continue;
                int count = 0;
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        int ni = i + di, nj = j + dj;
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == '*') {
                            count++;
                        }
                    }
                }
                grid[i][j] = (char) ('0' + count);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}