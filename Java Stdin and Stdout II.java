  
//Question Link:
//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
//Solution :-

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =scan.nextDouble();
        scan.nextLine();    // recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
        String s=scan.nextLine();
         
      

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
