package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {

        String name = "Pramod"; // SCP - String Constant Pool
        name.toUpperCase();
        System.out.println(name);
        //The output will be Pramod (in small letters,
        // as Strings are immutable and can not be changes even when we use toUpperCase function.

    }
}
