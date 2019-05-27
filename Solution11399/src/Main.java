import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseLength = scanner.nextInt();
        Map<Integer , Integer> map = new HashMap<>();
        List<Map<Integer,Integer>> mapList = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= testCaseLength; i++) {
            map.put(i,scanner.nextInt());
        }
        mapList.add(map);
        for (Object o : sortByValue(mapList.get(0))) {
            int temp = (int) o;
            answerList.add(map.get(temp));
        }

        int sum = 0;
        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < i+1; j++) {
                sum += answerList.get(j);
            }
        }
        System.out.println(sum);


    }
    public static List sortByValue(final Map map){
        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list,new Comparator(){
            public int compare(Object o1,Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable) v1).compareTo(v2);
            }
        });
        return list;
    }
}
