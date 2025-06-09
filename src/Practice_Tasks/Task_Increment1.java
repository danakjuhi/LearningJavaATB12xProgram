package Practice_Tasks;

public class Task_Increment1 {
    public static void main(String[] args) {

        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        //11 + 22 + (11+1=12) + (22+1=23) + (12+1=13) + (23+1=24)

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);
    }
}
