package com.example.strategy.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.strategy.constants.EnumStrategy;
import com.example.strategy.factorystrategy.PaymentStrategy;

@Service
//C:\Program Files\Jenkins\
/*
 * 
 * jenkins account=deepa password=deepa  port=8080/8181
 * C:\Program Files\Java\jdk-19\
 * C:\Program Files\Java\jdk-21\
 * 
Please use the following password to proceed to installation:

This may also be found at: C:\Users\kusha\.jenkins\secrets\initialAdminPassword

first admin==> user=admin password=admin

java -jar jenkins.war --httpPort=8181(run in cmd promt where that war file is located)
 */

public class ResolverService {
	
	Map<EnumStrategy, PaymentStrategy> mp=new HashMap<EnumStrategy, PaymentStrategy>();
	
	private PaymentStrategy typesofpayments;

	public ResolverService(PaymentStrategy typesofpayments) {
		super();
		this.typesofpayments = typesofpayments;
	}
	
	

}
