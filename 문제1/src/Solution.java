import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentList.add(new Student("이름","no"));
        }

        while(true){
            System.out.println("계속검색? y/n");
            String command = scanner.next();
            if (command.equals("y")){
                System.out.println("찾고싶은 학생이름 입력:");
                String studentName = scanner.next();
                System.out.println(findStudentNo(studentName,studentList));
            }
            else if (command.equals("n")){
                break;
            }
        }
    }

    public static String findStudentNo(String studentName, List<Student> studentList){
        String resultNo = "";
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getName().equals(studentName)) {
                resultNo = student.getNo();
                flag = true;
            }
        }
        if (!flag){
            return "해당하는 학생 이름이 없습니다.";
        }

        return resultNo;
    }


}


class Student{

    private String name;
    private String no;

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
