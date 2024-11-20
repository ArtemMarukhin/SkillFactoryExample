package programmer;

public class Programmer {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("name", "comp");
        System.out.println(programmer.toString());
        System.out.println(programmer.work());
        System.out.println(programmer.work());
        System.out.println(programmer.toString());
    }
    String name;
    String company;
    String position = "intern";

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return position;
    }
    public String work(){
        switch (position){
            case "intern":
                return this.position = "junior";
            case "junior":
                return this.position =  "middle";
            case "middle":
                return this.position =  "senior";
            case "senior":
                return this.position =  "lead";
            default:
                System.out.println("Error");
        }
        return position;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
