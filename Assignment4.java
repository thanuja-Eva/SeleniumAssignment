package com.HA.Assignment.day1;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int num=5;

int evenCount=0;

int oddCount=0;
		
		for (int i=1;i<=30;i++) {
			int mul=num*i;
			System.out.println(+num+"*"+i+"="+mul);
			
			if(mul%2==0) {
				System.out.println(mul+"Even number");
				
				evenCount++;
				
				
			}
			
			else {
				System.out.println("Odd number");
				oddCount++;
			}
		}
		
		System.out.println("Even number count is"+oddCount);
		
		

	}

}
