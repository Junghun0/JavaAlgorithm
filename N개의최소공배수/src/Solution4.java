import java.io.*;

public class Solution4 {
    static int[][] testCaseTmp = new int [100][100];
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] graphPosition = bufferedReader.readLine().split(" ");
        String[] conyPosition = bufferedReader.readLine().split(" ");
        int xPosition = Integer.parseInt(graphPosition[0]);
        int yPosition = Integer.parseInt(graphPosition[1]);

        int conyXposition = Integer.parseInt(conyPosition[0]);
        int conyYposition = Integer.parseInt(conyPosition[1]);

        if(conyXposition > xPosition || conyYposition > yPosition) {
            bufferedWriter.write("fail");
            return;
        }

        int sho = conyXposition + conyYposition; // 최단 거리

        long count = calCombination(conyXposition+conyYposition, conyXposition);

        bufferedWriter.write(sho + "");
        bufferedWriter.write("\r\n");
        bufferedWriter.write(count + "");
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int calCombination(int i, int j){
        if(i==j || j==0) return 1;

        if(testCaseTmp[i][j]>0) return testCaseTmp[i][j];

        testCaseTmp[i][j]= calCombination(i-1,j-1)+ calCombination(i-1,j);
        return testCaseTmp[i][j];
    }

    public static int factorial(int num) {
        int numToFactorial = 1;
        for (int i = 1; i <= num; i++) {
            numToFactorial = numToFactorial * i;
        }
        return numToFactorial;
    }


    /*
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalSeat;
        String[] seatStates;

        totalSeat = Integer.parseInt(bufferedReader.readLine());
        seatStates = bufferedReader.readLine().split(" ");
        boolean isFirstEmpty = false;
        boolean isLastEmpty = false;

        if (seatStates[seatStates.length - 1].equals("0"))
            isLastEmpty = true;

        if (seatStates[0].equals("0"))
            isFirstEmpty = true;



        int emptyDistance = 0;
        int curEmptyDistance = 0;

        for (int i = 0; i < seatStates.length; i++) {
            if (seatStates[i].equals("0") && isLastEmpty && i == seatStates.length - 1) {
                curEmptyDistance++;
                if (emptyDistance <= curEmptyDistance)
                    emptyDistance = curEmptyDistance;
            } else if (seatStates[i].equals("0")) {
                curEmptyDistance++;
            } else if (curEmptyDistance != 0) {
                if (isFirstEmpty && emptyDistance <= curEmptyDistance - 1) {
                    emptyDistance = curEmptyDistance;
                    curEmptyDistance = 0;
                    isFirstEmpty = false;
                } else if (emptyDistance <= (curEmptyDistance + 1) / 2) {
                    emptyDistance = (curEmptyDistance + 1) / 2;
                    curEmptyDistance = 0;
                }
            }
        }

        bufferedWriter.write(String.valueOf(emptyDistance));
        bufferedWriter.flush();
    * */
/*    public class Solution3 {

        public void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int inputSize;
            int[][] users;
            ArrayList<int[]> userList= new ArrayList<>();

            inputSize = Integer.parseInt(bufferedReader.readLine());
            users = new int[inputSize][2];
            for (int i = 0; i < inputSize; i++) {
                String[] inputSplit = bufferedReader.readLine().split(" ");
                users[i][0] = Integer.parseInt(inputSplit[0]);
                users[i][1] = Integer.parseInt(inputSplit[1]);
            }

            Arrays.sort(users, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {

                    if (a[0] < b[0]) {
                        return -1;
                    } else if (a[0] == b[0]) {
                        return a[1] <= b[1] ? 1 : -1;
                    }
                    return 1;
                }

            });

            userList.add(users[0]);
            for (int i = 1; i < users.length; i++) {
                if (userList.get(userList.size() - 1)[1] > users[i][0] && userList.get(userList.size() - 1)[0] <= users[i][0]) {
                    userList.add(users[i]);
                }
            }
            System.out.println(userList.size());
        }

    }*/


/*    public class Solution2 {
        public void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] inputArr = bufferedReader.readLine().split(" ");

            int index = 0;
            int max = 0;
            int min = Integer.MAX_VALUE;

            int length = Integer.parseInt(inputArr[0]);
            int consumerLength = Integer.parseInt(inputArr[1]);
            int[] consumeArr = new int[consumerLength];
            Arrays.fill(consumeArr, 0);

            for (int i = 0; i < length; i++) {
                int num = Integer.parseInt(bufferedReader.readLine());
                int j = index;
                while (true) {
                    if (consumeArr[index] > consumeArr[j]) {
                        index = j;
                        break;
                    }
                    j++;
                    if (j == consumeArr.length) {
                        j = 0;
                    }
                    if (j == index)
                        break;
                }
                if (max < consumeArr[index])
                    max = consumeArr[index];

                consumeArr[index] += num;
                if (min > consumeArr[index])
                    min = consumeArr[index];

                if (max < consumeArr[index])
                    max = consumeArr[index];
                index++;
                index %= consumerLength;
            }
            bufferedWriter.write(max + "");
            bufferedWriter.flush();
            bufferedReader.close();
            bufferedWriter.close();
        }
    }*/


}

