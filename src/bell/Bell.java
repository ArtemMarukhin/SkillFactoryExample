package bell;

public class Bell {
    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        Bell bell1 = new Bell();
        bell1.sound();
    }

    static int i = 0;
    public void sound(){
        if (i % 2 == 0) System.out.println("Ding");
        else System.out.println("Dong");
        i++;
    }
}
