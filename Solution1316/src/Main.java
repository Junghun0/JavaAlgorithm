import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int testCase = scanner.nextInt();
        String[] datas = new String[testCase];
        int answer = testCase;

        for (int i = 0; i < testCase; i++) {
            String inputStr = scanner.next();
            datas[i] = inputStr;
        }

        for (int k = 0; k < testCase; k++) {
            boolean[] alphabets = new boolean[26];
            for (int i = 1; i < datas[k].length(); i++) {

                if (datas[k].charAt(i - 1) != datas[k].charAt(i)){
                    if (alphabets[datas[k].charAt(i) - 'a']){
                        System.out.println("여기 ?"+k);
                        answer--;
                        break;
                    }
                    alphabets[datas[k].charAt(i-1) - 'a'] = true;
                }
            }
        }

        System.out.println(answer);
    }
}
