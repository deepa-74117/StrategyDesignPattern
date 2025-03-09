package com.example.strategy.factorystrategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.strategy.constants.EnumStrategy;

@Component
@Qualifier("DEBITCARD")

public class DebitCardStrategy implements PaymentStrategy{
	
	

	@Override
	public void payAmount(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Payment using Debit card "+amt);

		
	}

	@Override
	public EnumStrategy typeOfPayment() {
		// TODO Auto-generated method stub
		return EnumStrategy.DEBIT_CARD;
	}

}
