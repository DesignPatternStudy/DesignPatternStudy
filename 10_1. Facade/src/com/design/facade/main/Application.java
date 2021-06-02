package com.design.facade.main;

import com.design.facade.system.Facade;

public class Application {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.process();
	}
}
