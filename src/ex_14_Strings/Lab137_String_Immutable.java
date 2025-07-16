package ex_14_Strings;

public class Lab137_String_Immutable {
    public static void main(String[] args) {

        String s1 = "Hello";
        s1  = s1.concat("World");
        System.out.println(s1);
        // The output will be Hello World as we're doing concatenation and a new string will get created as Hello (s1) + "World"
        //That's how the value of s1 will be "Hello World"
    }
}
