import java.util.Scanner;

public class Programmers {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {

            sb.append("*");

        }

        for (int k = 0; k < b ; k++) {

            System.out.println(sb.toString());

        }

    }
}
