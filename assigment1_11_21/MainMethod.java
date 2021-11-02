package com.technoelevate.javabasics.assigment1_11_21;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factoryClass= new Factory();
		Scanner Sc=new Scanner(System.in);
		System.out.println("1.Dhananjay\n2.Vyankatesh\n3.Nitesh\n4.Vijay");
		System.out.println("Please Enter Collegeus number");
		int num=Sc.nextInt();
		switch (num) {
		case 1:{ factoryClass.getCollegeus("Dhananjay").speciality();
					break;	
				}
		case 2:{ factoryClass.getCollegeus("Vyankatesh").speciality();
					break;	
				}
		case 3:{ factoryClass.getCollegeus("Nitesh").speciality();
					break;	
				}
		case 4:{ factoryClass.getCollegeus("Vijay").speciality();
					break;	
				}
		default:{
			System.out.println("Invalid Input");
		}
		}
	}

}
