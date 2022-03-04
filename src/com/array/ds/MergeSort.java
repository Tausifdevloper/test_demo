package com.array.ds;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int arr[],int aux[],int low,int high){
		
		if(high == low)
		{
			return;
		}
		
		int mid = (low + high)/2;
		
		mergeSort(arr,aux,low,mid);
		mergeSort(arr,aux,mid+1,high);
		merge(arr,aux,low,mid,high);
		
	}

	private static void merge(int[] arr, int[] aux, int low, int mid, int high) {
	
		int k = low, i = low, j = mid + 1;

		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				aux[k++] = arr[i++];
			}
			else {
				aux[k++] = arr[j++];
			}
		}
		while (i <= mid) {
			aux[k++] = arr[i++];
		}

		for (i = low; i <= high; i++) {
			arr[i] = aux[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21,12,10,9,1,3,34};
		int aux[] = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(aux));
		mergeSort(arr, aux, 0, arr.length - 1);
		
		
		System.out.println((Arrays.toString(arr)));
	}

}
