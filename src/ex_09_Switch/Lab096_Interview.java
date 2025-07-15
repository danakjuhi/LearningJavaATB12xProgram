package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {

        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo"); //answer will be helloooo (default) as case is not matching with either A or B.
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
