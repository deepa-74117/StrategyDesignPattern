package com.example.strategy.factorystrategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.strategy.constants.EnumStrategy;

@Component
@Qualifier("CREDITCARD")

public class CreditCardStrategy implements PaymentStrategy{

	@Override
	public void payAmount(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Payment using Credit card "+amt);
		
	}

	@Override
	public EnumStrategy typeOfPayment() {
		// TODO Auto-generated method stub
		return EnumStrategy.CREDIT_CARD;
	}

}
