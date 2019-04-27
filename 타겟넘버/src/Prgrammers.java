import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Prgrammers {

    public static void main(String[] args) {
        int[] testcase = {1, 1, 1, 1, 1};
        new Solution().solution(testcase, 3); //return 5;
        //1,2,3,4,5
    }
}

class Node{
    int val;
    Node pNode;
    Node nNode;
    Node(int val){
        this.val = val;
    }
}
class Graph{
    Node root;
    Node curP;
    Node curN;
    Graph(int val){
        root = new Node(0);
        curP = root.pNode = new Node(val);
        curN = root.nNode = new Node(-val);
    }
    void addEdge(int val){
        curN.pNode=curP.pNode = new Node(val);
        curN.nNode=curP.nNode = new Node(-val);
        curP = curP.pNode;
        curN = curN.nNode;
    }

    int target;
    int answer;
    void dfs(int target){
        this.target = target;
        answer = 0;
        dfs(root, 0);
    }
    void dfs(Node pNode, int sum){
        if(pNode.nNode==null){
            sum+=pNode.val;
            if(sum==target){
                ++answer;
            }
        }else{
            sum+=pNode.val;
            dfs(pNode.nNode, sum);
            dfs(pNode.pNode, sum);
        }
    }
}
class Solution {
    public int solution(int[] numbers, int target) {
        Graph graph = new Graph(numbers[0]);
        for(int i =1; i<numbers.length; ++i){
            graph.addEdge(numbers[i]);
        }
        graph.dfs(target);
        return graph.answer;
    }
}

/*class Solution {
    static int answer = 0;


    public int solution(int[] numbers, int target) {
        dfs(target, numbers, 0);
        return answer;
    }

    public void dfs(int target, int[] numbers, int k) {
        if (k == numbers.length) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            if (sum == target) {
                answer++;
            }
        } else {
            numbers[k] *= 1;
            dfs(target, numbers, k + 1);

            numbers[k] *= -1;
            dfs(target, numbers, k + 1);
        }
    }
}*/