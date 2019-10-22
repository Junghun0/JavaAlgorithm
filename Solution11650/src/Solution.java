import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());
        Point[] pointArray = new Point[testCase];

        for (int i = 0; i < testCase; i++) {
            String[] points = bufferedReader.readLine().split(" ");
            pointArray[i] = new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1]));
        }

        Arrays.sort(pointArray);

        for (Point point : pointArray) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point implements Comparable<Point>{
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.y < o.y){
                return -1;
            }else if (this.y == o.y){
                if (this.x < o.x){
                    return -1;
                }
            }
            return 1;
        }
    }
}

