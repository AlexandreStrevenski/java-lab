package com.patterns.behavioural.state;

public class StateMain {

	public static void main(String[] args) {
		
		IState statesInADay[] = { new OpenState(), new LunchTimeState(), new OpenState(), new ClosedState() } ;
		
		CoffeShop coffeShop = new CoffeShop();
		
		for (IState oppeningStateRightNow : statesInADay) {
			
			coffeShop.setState(oppeningStateRightNow);
			
			System.out.println( coffeShop.getACoffe() );

		}
	}

}
