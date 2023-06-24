import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/3085
 */
public class Problem_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        char[][] board = new char[n][n];
        int candyMaxCount = 1;

        // Init Data
        for (int i = 0; i < n; i++) {
            String candies = reader.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = candies.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Right Swap
                if (j + 1 < n) {
                    swap(board, i, j, false);
                    int candyCount = getCandyMaxCount(board, i, i, j, j + 1);
                    if (candyCount > candyMaxCount) candyMaxCount = candyCount;
                    swap(board, i, j, false);
                }

                // Bottom Swap
                if (i + 1 < n) {
                    swap(board, i, j, true);
                    int candyCount = getCandyMaxCount(board, i, i + 1, j, j);
                    if (candyCount > candyMaxCount) candyMaxCount = candyCount;
                    swap(board, i, j, true);
                }
            }
        }
        System.out.println(candyMaxCount);

        reader.close();
    }

    public static void swap(char[][] board, int row, int col, boolean isRow) {
        char candy = board[row][col];
        if (isRow) {
            board[row][col] = board[row + 1][col];
            board[row + 1][col] = candy;
        } else {
            board[row][col] = board[row][col + 1];
            board[row][col + 1] = candy;
        }
    }

    public static int getCandyMaxCount(char[][] board, int startRow, int endRow, int startCol, int endCol) {
        int n = board.length;
        int maxCount = 1;

        // Row Counting
        for (int i = startRow; i <= endRow; i++) {
            int count = 1;

            for (int j = 1; j < n; j++) {
                if (board[i][j - 1] == board[i][j]) {
                    count++;
                } else {
                    count = 1;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }

        // Col Counting
        for (int i = startCol; i <= endCol; i++) {
            int count = 1;

            for (int j = 1; j < n; j++) {
                if (board[j - 1][i] == board[j][i]) {
                    count++;
                } else {
                    count = 1;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }

        return maxCount;
    }
}
