package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoneyApp2 {

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
		int sum=0,k=0,j=0;
		for (int i = 0; i < numberOfTarget; i++) {
			int flag=0; //target not achieved
			System.out.println("Enter the "+(i+1)+" Target Amount:");
			int targetAmount = sc.nextInt();// Kids Fee Amount
			for(j=0+k;j<transactionArr.length;j++) {
				sum+=transactionArr[j];
				if(sum>=targetAmount) {
					flag=1;
					sum-=targetAmount;
					k=(i+1);
					System.out.println("Target achived on "+k+" days of transaction:");
					break;
				}
			}
			if(flag==0)
				System.out.println("Sorry, This Target is not achieved");
			
		}
	}

}