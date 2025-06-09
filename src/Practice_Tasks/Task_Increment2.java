package Practice_Tasks;

public class Task_Increment2 {
    public static void main(String[] args) {

        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;


        // i = (1-1) 0
        // j = (2-1) 1
        // k = (3-1) 2

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

    }
}
