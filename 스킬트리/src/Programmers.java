import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Programmers {
    public static void main(String[] args) {
        String[] testcase = {"BACDE", "CBADF", "AECB", "BDA"};
        String skill = "CBD";
        new Solution().solution(skill, testcase); //-> return 2
    }
}

class Solution {
    public int solution(String skill, String[] skill_trees) {
        HashMap<Character, Integer> map = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < skill.length(); i++) {
            map.put(skill.charAt(i), i + 1);
        }

        for (int i = 0; i < skill_trees.length; i++) {
            int[] temp = new int[skill_trees[i].length()];
            String tmp = skill_trees[i];

            for (int j = 0; j < tmp.length(); j++) {
                if (map.containsKey(tmp.charAt(j))) {
                    temp[j] = map.get(tmp.charAt(j));
                } else {
                    temp[j] = 0;
                }
            }
            int cur = 0;
            for (int j = 0; j <= tmp.length(); j++) {
                if (j == tmp.length()) {
                    answer += 1;
                    break;
                }
                if (temp[j] <= cur) {
                    continue;
                } else {
                    if (temp[j] - 1 == cur) {
                        cur = temp[j];
                        if (cur == skill.length()) {
                            answer += 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return answer;
    }

    private int checkCorrectSkill(HashMap<Character, Integer> checkMap, HashMap<Integer, Character> standMap, String skill) {
        List<Integer> keyList = new ArrayList<>();
        List<Character> valueList = new ArrayList<>();
        HashMap<Integer, Character> resultMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (Character a : checkMap.keySet()) {
            for (int i = 0; i < skill.length(); i++) {
                if (a == skill.charAt(i)) {
                    resultMap.put(checkMap.get(a), a);
                }
            }
        }
        System.out.println("resultMap->" + resultMap);

        for (int a : resultMap.keySet()) {
            keyList.add(a);
        }
        for (int i = 0; i < keyList.size(); i++) {
            valueList.add(resultMap.get(keyList.get(i)));
        }
        System.out.println(keyList);
        int count = 0;
        for (int i = 0; i < valueList.size(); i++) {
            if (skill.charAt(i) == resultMap.get(keyList.get(i)) && resultMap.get(keyList.get(0)) == skill.charAt(0) && resultMap.containsValue(standMap.get(0))) {
                count++;
            }
        }
        result.add(count);
        keyList.clear();
        valueList.clear();

        int resultanswer = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != 0) {
                resultanswer++;
            }
        }
        System.out.println(resultanswer);
        System.out.println();
        return resultanswer;
    }
}
