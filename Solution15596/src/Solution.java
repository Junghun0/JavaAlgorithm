import java.io.IOException;

public class Solution {

    public long sum(int[] a) {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
