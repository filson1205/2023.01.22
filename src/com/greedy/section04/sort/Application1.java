package com.greedy.section04.sort;

import java.util.Iterator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 변수의 두 값 변경하기 */
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int[] arr= {2, 1, 3};
		
		int temp2;
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
// 알고리즘에 정렬 문제 많이나옴(순차정렬, 버블정렬, 삽입정렬, 선택정렬 등등등)