package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

        // Non return type or void does not return any.
        non_return_type_func();

        String a = return_type_func();
        System.out.println(a);

        int b = return_inttype_func();
        System.out.println(b);


    }

    // Void is Non return type function does not return anything, only printing.
    static void non_return_type_func(){
        System.out.println("Hi, Non Return Type");
    }

    // any data type (i.e. int, string, boolean, float, byte,long) are Return type function, it will return a particular data type.
    static  int return_inttype_func() {
        System.out.println("Hi, Non Return Type");
        return 6;

    }
    // Return type function, it will return a particular data type.
    static  String return_type_func() {
            System.out.println("Hi, Non Return Type");
            return "pramod";

        }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }
}

