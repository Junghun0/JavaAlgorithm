import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(reader.readLine());
        int num = 0;
        String sixNum = "666";
        while (input > 0) {
            num++;
            String str = Integer.toString(num);
            if (str.contains(sixNum)) {
                input--;
            }
        }
        writer.write(num+"");
        writer.flush();
        writer.close();
    }
}