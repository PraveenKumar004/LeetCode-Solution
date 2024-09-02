import java.util.ArrayList;
import java.util.List;

public class SnakeMatrix {

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr = new int[n][n];
        int k = 0;
        int x = 0, y = 0; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = k;
                k++;
            }
        }

        for (String command : commands) {
            switch (command) {
                case "RIGHT":
                    if (y + 1 < n) {
                        y++;
                    }
                    break;

                case "LEFT":
                    if (y - 1 >= 0) {
                        y--;
                    }
                    break;

                case "UP":
                    if (x - 1 >= 0) {
                        x--;
                    }
                    break;

                case "DOWN":
                    if (x + 1 < n) {
                        x++;
                    }
                    break;

                default:
                    break;
            }
        }

        return arr[x][y];
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("RIGHT");
        s.add("DOWN");
        int n = 2;

        System.out.println(finalPositionOfSnake(n, s)); 

    }
}
