package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {


        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001"); // in JDK > 13 -> sign works is 'break' keyword, no need to write break keyword.
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
