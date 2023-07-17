package com.gurukal.day1;
import java.util.*;
public class areaofequitraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Side Of an Equilateral Triangle :");
    double a=sc.nextDouble();
    double area=Math.sqrt(3)/4 * Math.pow(a, 2);
    System.out.println(area);
	}

}
