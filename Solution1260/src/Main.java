import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String testcase = scanner.nextLine();

        String[] data = testcase.split(" ");

        int[][] dfsArr = new int[Integer.valueOf(data[0])+1][Integer.valueOf(data[0])+1];
        boolean[] check = new boolean[Integer.valueOf(data[0])+1];
        Arrays.fill(check,false);
        boolean flagData = false;

        for (int i = 0; i < Integer.valueOf(data[1]); i++) {
            String dot = scanner.nextLine();
            String[] line = dot.split(" ");
            dfsArr[Integer.valueOf(line[0])][Integer.valueOf(line[1])] = 1;
            dfsArr[Integer.valueOf(line[1])][Integer.valueOf(line[0])] = 1;
        }
        dfs(dfsArr,check,Integer.valueOf(data[2]),flagData);
        clear(check);
        bfs(dfsArr,check,Integer.valueOf(data[2]));
    }

    static void clear(boolean[] check){
        Arrays.fill(check, false);
        System.out.println();
    }

    static void dfs(int[][] a, boolean[] c, int v ,boolean flag){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int n = a.length - 1;

        stack.push(v);
        c[v] = true;

        while(!stack.isEmpty()){
            int next = stack.peek();

            flag = false;

            for (int i = 1; i <= n; i++) {

                if (a[next][i] == 1 && !c[i]){
                    stack.push(i);
                    c[i] = true;
                    flag = true;
                    break;
                }

            }
            if (!flag){
                answer.add(stack.pop());
            }
        }


        for (int i = answer.size() - 1; i >= 0 ; i--) {
            if (i != 0){
                sb.append(answer.get(i));
                sb.append(" ");
            }else{
                sb.append(answer.get(i));
            }
        }
        System.out.print(sb.toString());
    }

    static void bfs(int [][] a, boolean[] c, int v){

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        int n = a.length - 1;

        queue.add(v);
        c[v] = true;
        answer.add(v);

        while (!queue.isEmpty()){

            v = queue.poll();

            for (int i = 1 ; i <= n; i++) {

                if (a[v][i] == 1 && !c[i]){
                    queue.add(i);
                    answer.add(i);
                    c[i] = true;
                }
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            if (i != answer.size() - 1){
                sb.append(answer.get(i));
                sb.append(" ");
            }else{
                sb.append(answer.get(i));
            }
        }

        System.out.print(sb.toString());

    }
}
