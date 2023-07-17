package com.gurukal.day1;
import java.util.*;
public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Ammout");
    int ammount=sc.nextInt();
   
     ammount=ammount/2000;
     System.out.println("No. of 2000 note: "+ammount);
     ammount=ammount%2000;
     System.out.println("No. of 500 note: "+ammount);
     ammount=ammount/500;
     System.out.println("No. of 200 note: "+ammount);
    ammount=ammount%500;
    System.out.println("No. of 200 note: "+ammount);
    ammount=ammount%200;
	}

}
