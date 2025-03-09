package com.example.strategy.factorystrategy;

import com.example.strategy.constants.EnumStrategy;

public interface PaymentStrategy {
	
	EnumStrategy typeOfPayment();
	void payAmount(double amt);


}
