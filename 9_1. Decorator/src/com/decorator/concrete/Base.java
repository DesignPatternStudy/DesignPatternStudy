package com.decorator.concrete;

import com.decorator.abst.IBeverage;

public class Base implements IBeverage {	

	@Override
	public int getTotalPrice() {   // component의 실질적인 인스턴스 부분
		return 0;
	}

}
