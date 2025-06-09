package Practice_Tasks;

public class Task_Increment {
    public static void main(String[] args) {

        int i = 11;

        i = i++ + ++i;

        //i++ --> (i- 11) (++ - [11+1] --> 12)
        //++i --> (++ - [11+1] --> 12)
        // 12+12 = 24
        System.out.println(i);
    }
}
