import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String testCase = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        String[] arr = testCase.split(" ");
        int length = Integer.parseInt(arr[0]);
        int jump = Integer.parseInt(arr[1]);

        Queue<Integer> data = new LinkedList<>();

        for (int i = 1; i <= length; i++) {
            data.add(i);
        }

        int calCount = 0;
        int outputOrder = 0;
        sb.append("<");
        while (outputOrder != length) {
            int pollNum = data.poll();
            calCount++;

            if (calCount == jump) {
                sb.append(pollNum + ", ");
                outputOrder++;
                calCount = 0;
            } else {
                data.add(pollNum);
            }

        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        System.out.println(sb.toString());
    }
}
