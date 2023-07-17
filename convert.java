package com.gurukal.day1;
import java.util.*;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter km");
    double a=sc.nextDouble();
    double meter,cm,inches,feet;
     meter=a*1000;
     cm=meter*100;
    inches=cm/2.54;
     feet= inches/12;
    System.out.println("Meter :"+meter);
    System.out.println("Centemeters: "+cm);
    System.out.println("Inches:"+inches);
    System.out.println("feet:"+feet);
    
    
    
	}

}
