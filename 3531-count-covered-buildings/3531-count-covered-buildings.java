import java.util.*;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {

        int[] xmin = new int[n + 1];
        int[] xmax = new int[n + 1];
        int[] ymin = new int[n + 1];
        int[] ymax = new int[n + 1];

        Arrays.fill(xmin, n + 1);
        Arrays.fill(ymin, n + 1);

        for (int[] element : buildings) {
            int x = element[0];
            int y = element[1];

            xmin[y] = Math.min(xmin[y], x);
            xmax[y] = Math.max(xmax[y], x);

            ymin[x] = Math.min(ymin[x], y);
            ymax[x] = Math.max(ymax[x], y);
        }

        int ans = 0;

        for (int[] element : buildings) {
            int x = element[0];
            int y = element[1];

            boolean rowInside = xmin[y] < x && x < xmax[y];
            boolean colInside = ymin[x] < y && y < ymax[x];

            if (rowInside && colInside) ans++;
        }

        return ans;
    }
}
