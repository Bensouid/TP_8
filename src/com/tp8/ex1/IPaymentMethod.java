package com.tp8.ex1;

public interface IPaymentMethod {
	

    boolean pay(double amount);

   
    boolean refund(double amount);

   
    String getName();
    
}
