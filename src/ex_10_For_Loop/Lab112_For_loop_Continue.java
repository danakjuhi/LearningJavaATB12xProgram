package ex_10_For_Loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 50 ; i++) {
            if(i ==5){
                continue; // as we write continue keyword when i==5 it will skip the 5 (5 will not be printed)
                // and continue with the iteration
            }
            System.out.println(i);
        }
    }
}
