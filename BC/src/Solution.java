import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("main test");
        new Solution().solution(new int[]{1, 2, 2, 2, 2, 2, 5}, new int[]{4, 4, 4, 4, 5, 6, 7});
    }

    class Pair {
        Pair(int number, int pairCount) {
            this.number = number;
            this.pairCount = pairCount;
        }
        int number;
        int pairCount;
    }

    public Pair checkArray(int arr[]) {
        int array[] = new int[14];
        int number = 0;
        int pairCount = 0;
        for (int i = 0; i < arr.length; i++) {
            array[arr[i]]++;
            System.out.println(Arrays.toString(array));
            if (pairCount < array[arr[i]] && array[arr[i]] > 1) {
                number = arr[i];
                pairCount = array[arr[i]];
            }
        }
        return new Pair(number, pairCount >= 5 ? 4 : pairCount);
    }

    public int solution(int arr1[], int arr2[]) {
        Pair a = checkArray(arr1);
        Pair b = checkArray(arr2);
        if(a.number==0 && b.number == 0)
            return 0;
        else if (a.pairCount == b.pairCount) {
            if(a.number < b.number)
                return 2;
            else
                return 1;
        }
        else if (a.pairCount > b.pairCount)
            return 1;
        else
            return 2;
    }



}

