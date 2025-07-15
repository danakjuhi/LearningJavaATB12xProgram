package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {

        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII"); // output will be Match ASCII, as ch (characters) are also integer.
                break;
            default:
                System.out.println("No Match");
        }
    }
}
