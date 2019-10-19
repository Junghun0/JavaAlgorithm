import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        Person person = new Person(1, 2);
        Person person2 = new Person(3, 1);
        Person person3 = new Person(7, 1);
        Person person4 = new Person(2, 6);
        Person person5 = new Person(6, 1);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        for (Person value : personList) {
            System.out.println(value.age + " , "+ value.level);
        }
        System.out.println();

        Collections.sort(personList);

        for (Person value : personList) {
            System.out.println(value.age + " , "+ value.level);
        }


    }

}

class Person implements Comparable<Person>{
    int age;
    int level;

    public Person(int age, int level) {
        this.age = age;
        this.level = level;
    }

    @Override
    public int compareTo(Person o) {
        if (this.level > o.level){
            return 1;
        }else if (this.level == o.level){
            if (this.age < o.age){
                return 1;
            }
        }
        return -1;
    }
}
