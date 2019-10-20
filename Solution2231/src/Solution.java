import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        int inputNum = Integer.parseInt(input);
        int result = 0;

        for (int i = 1; i < inputNum ; i++) {
            int sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                sum += Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)));
            }

            if (i + sum == inputNum){
                result = i;
                break;
            }
        }

        if (result == 0){
            writer.write(0+"");
        }else{
            writer.write(result+"");
        }
        writer.flush();
        writer.close();
    }
}
