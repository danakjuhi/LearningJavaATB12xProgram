package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {

        long phone_no = 9876543210l;
//        short s = phone_no; // Narrowing - implicit is not possible
        short s = (short) phone_no; // Narrowing - Explicit is possible
        System.out.println(s); // 5866
    }
}
