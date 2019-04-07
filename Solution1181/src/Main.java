import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int testCase = Integer.valueOf(scanner.nextLine());

        List<String> testCaseList = new ArrayList<>();
        List<String> noDupList = new ArrayList<>();
        HashMap<String, Integer> stringHashMap = new HashMap<>();


        for (int i = 0; i < testCase; i++) {

            String testStr = scanner.nextLine();
            testCaseList.add(testStr);
        }

        for (int i = 0; i < testCaseList.size(); i++) {
            if (!noDupList.contains(testCaseList.get(i))) {
                noDupList.add(testCaseList.get(i));
                stringHashMap.put(testCaseList.get(i), testCaseList.get(i).length());
            }
        }

        Iterator it = Main.sortByValue(stringHashMap).iterator();
        while (it.hasNext()) {
            String temp = (String) it.next();
            System.out.println(stringHashMap.get(temp));
            System.out.println(temp);
        }

    }

    public static List sortByValue(final Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list, new Comparator() {

            public int compare(Object o1, Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);

                return ((Comparable) v1).compareTo(v2);
            }

        });

        return list;
    }



}
