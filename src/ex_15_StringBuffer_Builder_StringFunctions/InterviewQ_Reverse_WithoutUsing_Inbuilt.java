package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {

        String input = "Pramod";
        // domarP

        for (int i= input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }

        System.out.println("");

        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}

// Interview questions can be asked in below ways

/*
- Write a program to reverse a string without using inbuilt functions. -> forloop - as above
- Write a program to reverse a string by using an inbuilt function.  -> StringBuffer.reverse()
-  Write a program to reverse a string without using a loop without using an inbuilt function. -> **recursive functions**
*/
