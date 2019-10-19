import java.io.*;

public class Solution{

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = reader.readLine();
        String[] tmpArray = input.split(" ");

        if (Integer.parseInt(tmpArray[0]) > Integer.parseInt(tmpArray[1])){
            writer.write(">");
            writer.flush();
        } else if (Integer.parseInt(tmpArray[0]) < Integer.parseInt(tmpArray[1])) {
            writer.write("<");
            writer.flush();
        } else {
            writer.write("==");
            writer.flush();
        }
    }
}
