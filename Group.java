package HomeWork_3;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Group {

    private Student [] students = new Student[10];

    public Group() {
        super();
    }

    public void addStudent(Student student) throws GroupOfStudentsIsOvercrowdedException {
        boolean flag = false;
        for (int i = 0; i < students.length ; i++) {

            if (students[i] == null) {
                students[i] = student;
                flag = true;
                break;
            }
        }if (flag == false){
            throw new GroupOfStudentsIsOvercrowdedException();
        }
    }

    public void removeStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }else
                if(students[i].equals(student)){
                    students[i] = null;
                }
        }
        System.out.println("The " + student + " have been removed!!!");
    }

    public void searchStudent(String surname){
        for (int i = 0; i < students.length; i++) {
            if (surname.startsWith(students[i].getSurname())){
                System.out.println(students[i]);
                break;
            } else{
                System.out.println("try again");
                break;
            }
        }

    }

    public void sort(){
        Arrays.sort(students, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ?
                                                CheckNull.checkNull(a, b) : a.getSurname().compareTo(b.getSurname()));
    }

    public void sortBy(String parametr) {
        try {
            if(parametr.equals("name")) {
                Arrays.sort(students,(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
                        ? CheckNull.checkNull(a, b) : a.getName().compareTo(b.getName()));
                return;
            }
            if(parametr.equals("age")) {
                Arrays.sort(students,(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
                        ? CheckNull.checkNull(a, b) : a.getAge() - b.getAge());
                return;
            }
            if(parametr.equals("surname")) {
                Arrays.sort(students,(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
                        ? CheckNull.checkNull(a, b) :  a.getSurname().compareTo(b.getSurname()));
                return;
            }
            if(parametr.equals("groupNumb")) {
                Arrays.sort(students,(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
                        ? CheckNull.checkNull(a, b) : a.getGroupNumb().compareTo(b.getGroupNumb()));
                return;
            }
            if(parametr.equals("progress")) {
                Arrays.sort(students, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
                        ? CheckNull.checkNull(a, b) : a.getProgress() - b.getProgress());
                return;
            }
            if(parametr.equals("sex")) {
                Arrays.sort(students, (a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL
                        ? CheckNull.checkNull(a, b) : a.getSex().compareTo(b.getSex()));
            }
        }catch(HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setStudentOnline() throws HeadlessException, GroupOfStudentsIsOvercrowdedException {

        int age;
        String name;
        String surname;
        String groupNumb;
        int progress;
        String sex;

        age = Integer.valueOf(JOptionPane.showInputDialog("Input age"));
        name = String.valueOf(JOptionPane.showInputDialog("Input name"));
        surname = String.valueOf(JOptionPane.showInputDialog("Input surname"));
        groupNumb = String.valueOf(JOptionPane.showInputDialog("Input group number"));
        progress = Integer.valueOf(JOptionPane.showInputDialog("Input progress"));
        sex = String.valueOf(JOptionPane.showInputDialog("Input group number"));

        Student student = new Student(age, name, surname, groupNumb, progress, sex);

        addStudent(student);

    }

    @Override
    public String toString() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        return "";
    }

 /*   @Override
    public Student[] moreThan18() {
        Student [] boyMoreThan18 = new Student[students.length];

        for (int i = 0; i < students.length; i++) {
                    if (students[i].getAge() > 18 && (students[i].getSex().equals("Male")) &&
                            students[i] != null) {
                        boyMoreThan18[i] = students[i];
                    }
        }
        return boyMoreThan18;
    }
    */
}