import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String testCase = scanner.next().toUpperCase();
        int[] alphabetData = new int[26];
        char answer = '?';
        int max = 0;

        for (int i = 0; i < testCase.length(); i++) {
            alphabetData[testCase.charAt(i) - 65]++;
            if (alphabetData[testCase.charAt(i) - 65] > max){
                answer = testCase.charAt(i);
                max = alphabetData[testCase.charAt(i) - 'A'];
            }else if (alphabetData[testCase.charAt(i) - 'A'] == max)
                answer = '?';
        }

        System.out.println(answer);
    }
}
