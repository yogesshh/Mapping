package com.scp.mapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

   @Entity
  // @DiscriminatorValue(value="Credit")
    public class CreditCard extends Payment {
	@Column(name="credit")
    String creditCardType;

	public CreditCard(int paymentId, double amount, String creditCardType) {
		super(paymentId, amount);
		this.creditCardType = creditCardType;
	}

	public CreditCard() {
		super();
	}

	public CreditCard(int paymentId, double amount) {
		super(paymentId, amount);
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardType=" + creditCardType + "]";
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
    
}
