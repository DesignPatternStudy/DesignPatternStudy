package com.decorator.concrete;

import com.decorator.abst.IBeverage;

public class Base implements IBeverage {	

	@Override
	public int getTotalPrice() {   // component�� �������� �ν��Ͻ� �κ�
		return 0;
	}

}
