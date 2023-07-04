package com.greatlearning.currency;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of Currency Denominations");
		int size = sc.nextInt();
		int[] currencyArr = new int[size];
		for (int i = 0; i < currencyArr.length; i++) {
			System.out.println("Enter the Denominations Value in Random Order");
			currencyArr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting Currency: "+Arrays.toString(currencyArr));
		mergeSort(currencyArr,0,currencyArr.length-1);
		System.out.println("After Sorting Currency: "+Arrays.toString(currencyArr));
		System.out.println("Enter the Total Amount to be payed");
		int amount = sc.nextInt();
		NoteCount nc = new NoteCount();
		nc.counting(currencyArr,amount);
	}
	private static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		int i, j, k;
		i = low;
		j = mid + 1;
		k = low;
		int[] tempArr = new int[high + 1];
		while (i <= mid & j <= high) {
			if (arr[i] > arr[j])
				tempArr[k++] = arr[i++];
			else
				tempArr[k++] = arr[j++];
		}
		for (; i <= mid; i++)
			tempArr[k++] = arr[i];
		for (; j <= high; j++)
			tempArr[k++] = arr[j];
		for (i = low; i <= high; i++)
			arr[i] = tempArr[i];
		
	}

}