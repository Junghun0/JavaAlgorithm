import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int cardInput = Integer.parseInt(br.readLine());
        for (int i = 1; i <= cardInput; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            int last = queue.poll();
            queue.add(last);

        }

        bw.write(queue.poll()+"");
        bw.flush();
        bw.close();
    }
}
