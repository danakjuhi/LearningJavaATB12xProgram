package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            // outputs will be different based on where you put print statement
            // System.out.println(i); output - 0,1,2,3,4,5
            if (i == 5) {
                break;
                // System.out.println(i); output - 5
            }
            System.out.println(i); // output - 0,1,2,3,4
        }
    }
}
