package com.programs;

import java.util.Scanner;

public class sumofsquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i*i;
			System.out.println(sum);
		
		
		}

	}

}