import java.util.LinkedList;
import java.util.Queue;

public class Programmers {

    public static void main(String[] args) {
        int[] testcase = {2, 1, 3, 2};
        new Solution().solution(testcase, 2); //return -> 1
    }
}

class Document {
    int name;
    int index;

    public Document(int name, int index) {
        this.name = name;
        this.index = index;
    }
}


class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<Document> list = new LinkedList<Document>();

        for (int i = 0; i < priorities.length; i++) {
            list.add(new Document(i, priorities[i]));
        }

        int answer = 1;
        Document firstDc = null;

        while(list.size()>1) {
            firstDc = list.getFirst();
            for (int i = 1; i < list.size(); i++) {
                if (firstDc.index < list.get(i).index) {
                    list.addLast(firstDc);
                    list.removeFirst();
                    break;
                }
                if (i == list.size()-1) {
                    if(firstDc.name == location) return answer;
                    list.removeFirst();
                    answer++;
                }
            }
        }
        return answer;
    }
}