package ex_04_Operators;

public class Lab051_InstanceOf_Operator {

    public static void main (String[] args){

        String s1 = new String("Juhi");
        int a = 10;

        System.out.println(s1 instanceof String); //instaceof is a keyword
      //  System.out.println(a instanceof String); // as a is integer type this will give you an error
    }
}
