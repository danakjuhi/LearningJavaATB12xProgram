package ex_05_TypeCasting;

public class Lab058_TypeCasting_1 {
    public static void main(String[] args) {

        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)b; // Widening Explicit Casting (int) - optional
    }
}
