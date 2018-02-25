  package com.scp.mapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorValue(value="Payment") 
  public class Payment {
	  @Id
	  int paymentId;
	  @Column
	  double amount;
	    public Payment(int paymentId, double amount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
	}
	public Payment() {
		super();
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + "]";
	}
	  
	

}
