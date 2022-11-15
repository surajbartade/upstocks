package SELENIUM;

import java.util.Scanner;

public class Enter_no_for_reverse {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no for reverse");
	
	int num=s.nextInt();
	int c;
	
	while(num>0) {
		c=num%10;
		
		num=num/10;
		System.out.println(c);
	}
}
}
