import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test3 {

    public static void main(String[] args) {
        /*
        입력값 〉	6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
        기댓값 〉	3
        */
        new Solution().solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}});
    }

    static class Solution{

        public int solution(int n, int[][] edge) {
            int answer = 0;

            Graph graph = new Graph(n, edge);
            int max = graph.bfs(1);
            for (int i = 0; i < n; i++) {
                if (graph.nodes[i].distance == max) answer++;
            }

            return answer;
        }

        class Graph {
            Node[] nodes;
            int maxDistance;

            public Graph(int n, int[][] edge) {
                nodes = new Node[n];
                for (int i = 0; i < n; i++) {
                    nodes[i] = new Node(i + 1);
                }
                for (int i = 0; i < edge.length; i++) {
                    addEdge(edge[i][0] - 1, edge[i][1] - 1);
                }
            }

            public void addEdge(int a, int b) {
                addEdge(nodes[a], nodes[b]);
            }

            private void addEdge(Node a, Node b) {
                if (!a.adjacents.contains(b)) {
                    a.adjacents.add(b);
                }

                if (!b.adjacents.contains(a)) {
                    b.adjacents.add(a);
                }
            }

            public int bfs(int n) {
                bfs(nodes[n]);
                return maxDistance;
            }

            private void bfs(Node root) {
                Queue<Node> queue = new LinkedList<>();
                queue.add(root);
                root.visit = true;
                while (!queue.isEmpty()) {
                    Node node = queue.poll();
                    for (Node adjecent : node.adjacents) {
                        if (!adjecent.visit) {
                            adjecent.distance = node.distance + 1;
                            adjecent.visit = true;
                            maxDistance = Math.max(maxDistance, adjecent.distance);
                            queue.add(adjecent);
                        }
                    }
                }
            }

            class Node {
                int data;
                int distance;
                boolean visit;
                List<Node> adjacents;

                public Node(int data) {
                    this.data = data;
                    adjacents = new LinkedList<>();
                }
            }
        }

    }

}
