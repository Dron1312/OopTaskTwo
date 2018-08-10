package HomeWork_3;

public class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Human() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                  + '}';
    }

    public void info(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());

    }
}
