import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());
        Person[] personArray = new Person[testCase];
        for (int i = 0; i < testCase; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            personArray[i] = new Person(Integer.parseInt(input[0]), input[1], i);
        }

        Arrays.sort(personArray);

        for (Person person : personArray) {
            bufferedWriter.write(person.age + " " + person.name);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Person implements Comparable<Person>{

        int age;
        String name;
        int index;

        Person(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }

        @Override
        public int compareTo(Person o) {
            if (this.age < o.age){
                return -1;
            }else if (this.age == o.age){
                if (this.index < o.index){
                    return -1;
                }
            }
            return 1;
        }
    }
}
