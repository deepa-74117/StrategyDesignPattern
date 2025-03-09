package com.example.strategy.factorystrategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.strategy.constants.EnumStrategy;

@Component
@Qualifier("PAYPAL")

public class PayPalStrategy implements PaymentStrategy {

	@Override
	public void payAmount(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Payment using Pay pal "+amt);

	}

	@Override
	public EnumStrategy typeOfPayment() {
		// TODO Auto-generated method stub
		return EnumStrategy.PAY_PAL;
	}

}
