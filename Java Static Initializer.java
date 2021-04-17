// Question Link : - https://www.hackerrank.com/challenges/java-static-initializer-block/problem
//P.S. Sometime its hard to understand hakerrank UI becasue in this solution some part was not non editiable they should improve on that 
// Solution :-
import java.io.*;
import java.util.*;

public class Solution {
// Form here I started my soulution 
static boolean flag;
static int B,H;

static{
    Scanner io = new Scanner(System.in);
    B = io.nextInt();
    H = io.nextInt();
    if(B>0 && H>0)
    {
        flag = true;
    }
    else
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
// Here it ends other than this default & can't be editabale in there complier :| hope they will improve it!
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

