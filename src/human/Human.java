package human;

public class Human {
    public static void main(String[] args) {
        Human name1 = new Human("name", 35);
        System.out.println(name1.toString());
    }
    String name;
    int age;
    int weight;
    String address;
    String work;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Human(String name, int age, int weight) {
        this.name = "name";
        this.age = 25;
        this.weight = 65;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Human(String name, int age, String address, String work) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
