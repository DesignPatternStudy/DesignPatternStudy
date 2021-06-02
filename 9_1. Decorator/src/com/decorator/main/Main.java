package com.decorator.main;

import java.util.Scanner;

import com.decorator.abst.IBeverage;
import com.decorator.concrete.Base;
import com.decorator.concrete.Espresso;
import com.decorator.concrete.Milk;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IBeverage beverage = new Base();
		
		boolean done = false;
		while(!done) {
			System.out.println("���� ���� ���� : " + beverage.getTotalPrice());
			System.out.print("���� : 1:�� �߰� / 2:���� �߰�");
			switch(sc.nextInt()) {
			case 0: done = true;
					break;
			case 1:
					beverage = new Espresso(beverage);
					break;
			case 2: 
					beverage = new Milk(beverage);
					break;
			case 3:				// ������ �߰� �ڵ�
					beverage = new Espresso(new Milk(beverage));		
					break;
			}
		}
		System.out.println("���� ���� : "+beverage.getTotalPrice());
		sc.close();
	}

}
