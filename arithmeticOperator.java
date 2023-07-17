//input a int with three digits find1>sum and 2reverse of no 3 sum of and the reverse
package com.gurukal.day1;
import java.util.*;
public class arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number:");
    int a=sc.nextInt();
    int s1=(a/100);
//    System.out.println("Sum: "+s1);
    
    int s2=a/10%10;
        System.out.println("Sum: "+s2);
    int s3=a%10;
    
//    System.out.println("Sum: "+s3);
    int sum=s1+s2+s3;
    		System.out.println("Sum of Digits: "+sum);
    		
    int rev=s3*100+s2*10+s1;
    System.out.println("Reverse of Digits: "+rev);
    
    int add=a+rev;
    System.out.println("Sum of Input and Reverse: "+add);
	}

}
