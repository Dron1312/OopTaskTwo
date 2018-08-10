package HomeWork_3;

public class Main {
    public static void main(String[] args) {

        Group group = new Group();

        Student student1 = new Student(18, "Ivan", "Ivanov", "4M", 3, "Male");
        Student student2 = new Student(19, "Stepan", "Stepanov", "1M", 4, "Male");
        Student student3 = new Student(20, "Bob", "Bobov", "4M", 5, "Male");
        Student student4 = new Student(21, "Ivan", "Kokov", "4M", 8,"Male");
        Student student5 = new Student(22, "Ivan", "Lopov", "4M", 5,"Male");
        Student student6 = new Student(21, "Revan", "Popov", "4M", 3,"Male");
        Student student7 = new Student(21, "Olga", "Popova", "4M", 6,"Female");

        try {
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
        } catch (GroupOfStudentsIsOvercrowdedException e) {
            e.printStackTrace();
        }

        group.sortBy("progress");
        System.out.println(group);

    //    try {
    //        group.setStudentOnline();
    //    } catch (GroupOfStudentsIsOvercrowdedException e) {
    //        e.printStackTrace();
    //    }

        System.out.println(group);
        System.out.println();

        System.out.println("REMOVE STUDENT");
        group.removeStudent(student2);
        System.out.println(group);
        System.out.println();

        System.out.println("Find student");
        group.searchStudent("Bobov");
        System.out.println();

        student6.info();

        System.out.println(group.moreThan18());


    }
}
