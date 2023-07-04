package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoneyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers of Transactions/Days:");
		int days = sc.nextInt();
		int[] transactionArr = new int[days];

		for (int i = 0; i < transactionArr.length; i++) {
			System.out.println("Enter the value of Transaction");
			transactionArr[i]=sc.nextInt();
		}
		System.out.println("Enter the Number of Target");
		int numberOfTarget= sc.nextInt();
		for (int i = 0; i < numberOfTarget; i++) {
			int sum=0; 
			int flag=0; //target not achieved
			System.out.println("Enter the "+(i+1)+" Target Amount:");
			int targetAmount = sc.nextInt();// Kids Fee Amount
			for(int j=0;j<transactionArr.length;j++) {
				sum+=transactionArr[j];
				if(sum>=targetAmount) {
					flag=1;
					System.out.println("Target achived on "+(j+1)+" days of transaction:");
					break;
				}
			}
			if(flag==0)
				System.out.println("Sorry, This Target is not achieved");
			
		}
	}

}