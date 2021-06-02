package com.decorator.concrete;

import com.decorator.abst.AbstAdding;
import com.decorator.abst.IBeverage;

public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;
	
	public Espresso(IBeverage base) {
		super(base);
	}
	
	public int getTotalPrice() {
		return super.getTotalPrice()+getAddPrice();
	}
	
	private static int getAddPrice() {
		espressoCount +=1;
		int addPrice = 100;
		
		if(espressoCount > 1) {
			addPrice = 70;
		}
		return addPrice;
	}
}
