import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String testCase = scanner.nextLine();

        int[] alphabets = new int[26];

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = -1;
        }

        for (int k = 0; k < testCase.length(); k++) {

            char findIdx = testCase.charAt(k);
            int index = testCase.indexOf(findIdx);
            alphabets[findIdx - 97] = index;
        }


        for (int i = 0; i < alphabets.length; i++) {
            if(i == alphabets.length - 1){
                sb.append(alphabets[i]);
            }else{
                sb.append(alphabets[i]+" ");
            }
        }

        System.out.println(sb.toString());
    }
}
