import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lottoList = new ArrayList<>();

        int index = 0;

        while(true){

            String testcase = scanner.nextLine();
            String[] lotto_data = testcase.split(" ");
            lottoList.add(Integer.valueOf(lotto_data[index]));

            if (testcase.equals("0")){
                break;
            }
        }





    }
}
