/**
 *  @author Fatih ARI - 09.09.2021
 */


import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
    public static <T> void printArray(T [] inputArray)
    {
        for(T i : inputArray)
            System.out.println(i);
    }
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer(); //It can be Printer.printArray() since static method.
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
