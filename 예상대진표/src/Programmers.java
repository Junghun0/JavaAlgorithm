import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Programmers {
    public static void main(String[] args) {
        new Solution().solution(30, 4, 7); //return 3
//        new Solution().solution(16, 2, 9); //return 3
    }
}

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;

        List<Integer> teamList = new ArrayList<>();

        for (int i = 1; i <= n; i = i+2) {
            if (teamList.size()%2 == 0 && teamList.contains(b) && teamList.size() == (teamList.size()&-teamList.size())){
                break;
            }else{
                teamList.add(i);
                teamList.add(i+1);
            }
        }
        System.out.println(teamList);

        for (int k = 0; k < teamList.size() - 1; k++) {
            for (int i = 1; i <= teamList.size(); i = i+2) {
                if (teamList.get(i- 1) == a || teamList.get(i-1) == b){
                    teamList.remove(i);
                    teamList.add(i, 0);
                }else if (teamList.get(i) == b || teamList.get(i) == a){
                    teamList.remove(i-1);
                    teamList.add(i-1, 0);
                }else if (teamList.get(i-1) != 0){
                    teamList.remove(i-1);
                    teamList.add(i-1,0);
                }
                System.out.println(teamList);
            }
            clearListValue(teamList);
            answer++;
            System.out.println(teamList+"answer"+answer);
        }

        return answer;

    }

    public List<Integer> clearListValue(List<Integer> data){
        List<Integer> zeroList = new ArrayList<>();
        zeroList.add(0);
        data.removeAll(zeroList);
        return data;
    }
}
