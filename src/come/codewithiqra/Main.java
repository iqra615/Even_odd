package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input a number:");
       int n = io.nextInt();
         if(n % 2 ==0 ){
             System.out.println("Even");
         }
         else
         {
             System.out.println("Odd");
         }
    }
}
