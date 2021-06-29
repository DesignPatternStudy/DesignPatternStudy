package com.design.state;

public class Light {
	
	protected LightState lightState;		// context
	
	private LightState offState = new LightState() {	// 객체로 off상태 정의
		
		@Override
		public void on() {		// 액션
			System.out.println("Light ON");	
			lightState = onState;
		}
		
		@Override
		public void off() {
			System.out.println("Nothing");						
		}
	};
	
	private LightState onState = new LightState() {		// 객체로 on상태 정의
		
		@Override
		public void on() {
			System.out.println("Nothing");
		}
		
		@Override
		public void off() {		// 액션
			System.out.println("Light OFF");			
			lightState = offState;
		}
	};

	public Light() {
		lightState = offState;		// 기본적으로 꺼져있는 상태 
	}
	
	public void on() {
		lightState.on();
	}
	
	public void off() {
		lightState.off();
	}
}

interface LightState {	// 두가지 상태
	
	void on();
	void off();
}
