import java.util.Arrays;

public class Programmers {

    //17 3
    //011 2
    //0 1 2 3 4 5 6 7 8 9
    public static void main(String[] args) {
        new Solution().solution(10);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        getPrime(80);

        return answer;
    }

    public void getPrime(int max) {
        int counter = 0;
        boolean[] a = new boolean[max];
        for (int i = 2; i < max; i++)
            a[i] = true;

        int to = (int) Math.sqrt(max);
        System.out.println("to-> "+to);
        for (int j = 2; j < to; j++) {
            if (a[j] == true) {
                for (int k = j; k * j < max; k++) {
                    a[j * j] = false;
                }
            }
        }

        for (int j = 2; j < max; j++) {
            if (a[j])
                System.out.println(j);
                counter++;
        }
        System.out.println(counter);
    }
}
