import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] alphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String testCase = scanner.nextLine();

        int result = 0;

        int i;
        for(i=0; i<alphabet.length; i++) {
            if(testCase.contains(alphabet[i])) {
                testCase = testCase.replaceAll(alphabet[i], "0");
            }
        }

        result = testCase.length();
        System.out.println(result);
    }
}
