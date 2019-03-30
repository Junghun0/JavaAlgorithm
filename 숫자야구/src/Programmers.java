import java.util.ArrayList;

public class Programmers {

    public static void main(String[] args) {
        int[][] testcase = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        new Solution().solution(testcase); //return -> 2

    }
}

class Solution {
    public int solution(int[][] baseball) {
        int answer = 0;
        int checkNum = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    if (i != j && i != k && j != k){
                        System.out.println(i*100 + j*10 + k);
                        answer += checkScore(baseball, i, j, k);
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    int checkScore(int[][] baseball, int first, int second, int third) {
        int strike = 0;
        int ball = 0;
        
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> arr_numbers = new ArrayList<>();

        int hun = 0;
        int ten = 0;
        int one = 0;
        int correct = 0;

        for (int i = 0; i < baseball.length; i++) {
            correct = 0;
            numbers.add(first);
            numbers.add(second);
            numbers.add(third);

            hun = baseball[i][0] / 100;
            ten = (baseball[i][0] % 100) / 10;
            one = baseball[i][0] % 10;

            arr_numbers.add(hun);
            arr_numbers.add(ten);
            arr_numbers.add(one);

            strike = getStrikeCount(arr_numbers,numbers);
            ball = getBallCount(arr_numbers,numbers);
            if (baseball[i][1] == strike && baseball[i][2] == ball){
                correct++;
            }
            arr_numbers.clear();
            numbers.clear();
        }
        if (correct == 4){
            return 1;
        }else{
            return 0;
        }
    }

    private int getStrikeCount(ArrayList<Integer> arr_numbers, ArrayList<Integer> numbers) {
        int strikeNum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (arr_numbers.get(i) == numbers.get(i)) {
                System.out.println("strike"+arr_numbers.get(i)+","+numbers.get(i));
                strikeNum++;
            }
        }
        return strikeNum;
    }

    private int getBallCount(ArrayList<Integer> arr_numbers, ArrayList<Integer> numbers) {
        int ball = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < arr_numbers.size(); j++) {
                if (arr_numbers.get(i) == numbers.get(i) && i != j) {
                    ball++;
                }
            }
        }
        return ball;
    }
}

/*
* 다른사람풀이
* public static int solution(int[][] baseball) {
        Stack<string> stack = new Stack<>();
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                for(int k = 1; k < 10; k++) {
                    if(i != j && j != k && i != k) {
                        stack.add(String.valueOf(i * 100 + j * 10 + k));
                    }
                }
            }
        }
        Stack<string> temp = new Stack<>();
        boolean flag = true;
        while(!stack.isEmpty()) {
            String num = stack.pop();
            for(int i = 0; i < baseball.length && flag; i++) {
                int strike = strike(num, String.valueOf(baseball[i][0]));
                int ball = ball(num, String.valueOf(baseball[i][0])) - strike;
                if(strike != baseball[i][1] || ball != baseball[i][2]) {
                    flag = false;
                }
            }
            if(flag) {
                temp.add(num);
            }
            flag = true;
        }
        return temp.size();
    }

    public static int strike(String num, String target) {
        int cnt = 0;
        for(int i = 0; i < target.length(); i++) {
            cnt = num.charAt(i) == target.charAt(i) ? cnt + 1 : cnt;
        }
        return cnt;
    }

    public static int ball(String num, String target) {
        int cnt = 0;
        for(int i = 0; i < target.length(); i++) {
            cnt = num.contains(String.valueOf(target.charAt(i))) ? cnt + 1 : cnt;
        }
        return cnt;
    }
}
* */