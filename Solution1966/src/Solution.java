import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        /*
        1 0
        5

        4 2
        1 2 3 4

        6 0
        1 1 9 1 1 1
        */

        int testCaseLength = Integer.parseInt(reader.readLine());
        PriorityQueue<Print> queue = new PriorityQueue<>();

        queue.add(new Print(0,1));
        queue.add(new Print(1,1));
        queue.add(new Print(2,9));
        queue.add(new Print(3,1));
        queue.add(new Print(4,1));
        queue.add(new Print(5,1));

        System.out.println(queue);

    }

    public static class Print implements Comparable<Print>{
        int position;
        int priority;

        public Print(int position, int priority) {
            this.position = position;
            this.priority = priority;
        }

        @Override
        public int compareTo(Print o) {
            if (this.priority < o.priority) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return "Print{" +
                    "position=" + position +
                    ", priority=" + priority +
                    '}';
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    }
}
