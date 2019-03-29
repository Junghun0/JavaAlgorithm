import java.util.*;

public class Programmers {

    public static void main(String[] args) {

        //handshake/shake hands
//        new Solution().solution("handshake","shake hands");
//
//        new Solution().solution("FRANCE","french");
//
//
//        new Solution().solution("aa1+aa2","AAAA12");
//
//        //E=M*C^2 , e=m*c^2
//
//        new Solution().solution("E=M*C^2","e=m*c^2");

        new Solution().solution("12351","siznskd");

    }
}


class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        double result_sum = 0;
        double result_intersection = 0;

        String dataStr_1 = str1.toUpperCase();
        String dataStr_2 = str2.toUpperCase();

        ArrayList<String> interSection;
        ArrayList<String> sumSection;

        String[] subArr_1 =  new String[dataStr_1.length() - 1];
        String[] subArr_2 = new String[dataStr_2.length() - 1];

        ArrayList<String> subList_1 = new ArrayList<>();
        ArrayList<String> subList_2 = new ArrayList<>();

        for (int i = 0; i < dataStr_1.length() - 1; i++) {
            subArr_1[i] = dataStr_1.substring(i,i+2);
            if (subArr_1[i].matches("^[A-Z]+$")){
                subList_1.add(subArr_1[i]);
            }
        }


        for (int i = 0; i < dataStr_2.length() - 1; i++) {
            subArr_2[i] = dataStr_2.substring(i,i+2);
            if (subArr_2[i].matches("^[A-Z]+$")){
                subList_2.add(subArr_2[i]);
            }

        }


        interSection = getIntersectionList(subList_1,subList_2);


        double answer2 = 0.0;

        sumSection = (ArrayList<String>)getUnionList(subList_1,subList_2);

        result_sum = (double)sumSection.size();
        result_intersection = (double)interSection.size();

        answer2 = result_intersection/result_sum;


        if (interSection.size() == 0 && sumSection.size() == 0){
            answer = 1;
        }

        if (interSection.size() == sumSection.size()){
            answer = 65536;
        }else{
            answer = (int)(answer2*(double)65536);
        }



        return answer;
    }

    private static ArrayList<String> getUnionList(ArrayList<String> list1, ArrayList<String> list2) {
        list1 = (ArrayList<String>) list1.clone();
        list2 = (ArrayList<String>) list2.clone();
        ArrayList<String> unionList = new ArrayList<String>();
        for(String str : list1) {
            if(list2.contains(str)) {
                list2.remove(str);
            }
            unionList.add(str);
        }
        unionList.addAll(list2);
        return unionList;
    }


    private static ArrayList<String> getIntersectionList(ArrayList<String> list1, ArrayList<String> list2) {
        list1 = (ArrayList<String>) list1.clone();
        list2 = (ArrayList<String>) list2.clone();
        ArrayList<String> interList = new ArrayList<String>();
        for(String str : list1) {
            if(list2.contains(str)) {
                interList.add(str);
                list2.remove(str);
            }
        }
        return interList;
    }
}