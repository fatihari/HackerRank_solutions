/**
 *  @author Fatih ARI - 04.09.2021
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    //Enter your code here.
    private static int B, H;
    private static boolean flag = false;
    private static Scanner input;
    static
    {
        input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        input.close();
        if(B<=0 || H<=0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else
            flag = true;
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

