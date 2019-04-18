public class Programmers {

    public static void main(String[] args) {
//        new Solution().solution(10, 2);// [4,3]
//        new Solution().solution(8, 1);// [3,3]
//        new Solution().solution(24, 24);// [8,6]
        new Solution().solution(12, 3); // [5,3]
        new Solution().solution(12, 4); // [4,4]
    }
}

class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = {};
        int brownWidth;
        int brownHeight;
        
        int height;
        for (int i = 1; i <= red; i++) {
            height = red / i;
            if (i * height == red && i > height || i == height) {
                System.out.println("width->" + i + "height->" + height);
                brownWidth = 2 * (i + 2);
                brownHeight = 2 * height;
                System.out.println(brownWidth + "," + brownHeight);
                if (brownHeight + brownWidth == brown) {
                    System.out.println("가로" + brownWidth + "세로" + brownHeight);
                    return new int[]{i + 2, height + 2};
                }
            }
        }

        return answer;
    }
}
