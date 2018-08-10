package HomeWork_3;

import java.util.Objects;

public class Student extends Human {
    private String surname;
    private String groupNumb;
    private int progress;
    private String sex;

    public Student(int age, String name, String surname, String groupNumb, int progress, String sex) {
        super(age, name);
        this.surname = surname;
        this.groupNumb = groupNumb;
        this.progress = progress;
        this.sex = sex;
    }

    public Student(){
        super();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroupNumb() {
        return groupNumb;
    }

    public void setGroupNumb(String groupNumb) {
        this.groupNumb = groupNumb;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(surname, student.surname) &&
                Objects.equals(groupNumb, student.groupNumb) &&
                Objects.equals(progress, student.progress) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        Integer progress = this.progress;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((groupNumb == null) ? 0 : groupNumb.hashCode());;
        result = prime * result + ((progress == 0) ? 0 : progress.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        return result;
    }

    @Override
    public void info(){
        System.out.println("Age: " + super.getAge());
        System.out.println("Name: " + super.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("progress: " + this.getProgress());
        System.out.println("sex: " + this.getSex());

    }

    @Override
    public String toString() {
        return "Student{" +
                " name='" + getName() + '\'' +
                " surname='" + surname + '\'' +
                " age='" + getAge() + '\'' +
                ", groupNumb='" + groupNumb + '\'' +
                ", progress='" + progress + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
