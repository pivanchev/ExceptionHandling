
package exceptionhandling;

import java.util.Scanner;


public class ExceptionHandling {

   
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=1;
        
        
        do{
        try{
        System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        int sum=num1/num2;
        System.out.println(sum);
        x=2;
        
    }catch(Exception e){
            System.out.println("You can`t do that.");
    }
   } while (x==1);
    
}
}
