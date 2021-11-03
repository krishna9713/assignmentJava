package com.technoelevate.javabasic.assignment3;

import java.util.Scanner;

public class MainMethodMarriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarriageCheck marriageCheck= new MarriageCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int a = sc.nextInt();
		MarriageCheck.marriageCheck(a);
	}

}

