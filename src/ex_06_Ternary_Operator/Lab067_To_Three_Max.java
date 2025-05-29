package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {

        int N1 = 10;
        int N2 = 20;
        int N3 = 30;

        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program
        //
        int max = (N1 > N2) ? (N1 > N3) ? N1 : N3 : ((N2 > N3) ? N2 : N3);
        System.out.println(max);
    }
}
