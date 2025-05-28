package ex_06_Ternary_Operator;

public class Lab063_TO_P1 {
    public static void main(String[] args) {

        int number = 5;
        String result = number > 0 ? "positive" : "negative";
        // data type of expression 1 ("positive") is string so variable(result)data type should be String only
//        int result = number > 0 ? "positive" : "negative"; // this is wrong
        System.out.println(result);

    }
}
