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
			System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
			System.out.print("선택 : 1:샷 추각 / 2:우유 추가");
			switch(sc.nextInt()) {
			case 0: done = true;
					break;
			case 1:
					beverage = new Espresso(beverage);
					break;
			case 2: 
					beverage = new Milk(beverage);
					break;
			case 3:				// 덕성님 추가 코드
					beverage = new Espresso(new Milk(beverage));		
					break;
			}
		}
		System.out.println("음료 가격 : "+beverage.getTotalPrice());
		sc.close();
	}

}
