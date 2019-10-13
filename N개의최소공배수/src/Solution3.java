import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Solution3 {

    HashSet<Integer> hashSet = new HashSet<>();
    ArrayList<Integer> dataList = new ArrayList<>();
    PriorityQueue<Print> prQueue = new PriorityQueue<>();
    int counter = 0;
    int index = 1;

    public int[] solution(int[][] data) {
        int[] answer = {};

        dataList.add(data[0][0]);
        counter = data[0][1] + data[0][2];

        while (dataList.size() < data.length) {
            calc(data);
            calc2();
        }

        answer = new int[dataList.size()];

        for (int j = 0; j < dataList.size(); j++) {
            answer[j] = dataList.get(j);
        }


        return answer;

    }

    public void calc(int data[][]) {
        for (int i = index; i < data.length; i++) {
            if (!hashSet.contains(data[i][0])) {

                if (counter < data[i][1]) {
                    if (prQueue.isEmpty()) {
                        prQueue.offer(new Print(data[i][0], data[i][1], data[i][2]));
                        hashSet.add(data[i][0]);
                        index = (i + 1);
                        break;
                    }
                    index = i;
                    break;
                }

                prQueue.offer(new Print(data[i][0], data[i][1], data[i][2]));
                hashSet.add(data[i][0]);
            }
        }

    }

    // ���� �μ⹰ Ȯ��
    public void calc2() {

        if (!prQueue.isEmpty()) {
            Print print = prQueue.poll();
            counter += print.page;
            dataList.add(print.number);
        }

    }


    class Print implements Comparable<Print> {
        int number;
        int time;
        int page;

        public Print(int number, int time, int page) {
            this.number = number;
            this.time = time;
            this.page = page;
        }

        @Override
        public int compareTo(Print o) {
            if (this.page > o.page) {
                return 1;
            } else if (this.page == o.page) {
                return 0;
            }
            return -1;
        }
    }
}