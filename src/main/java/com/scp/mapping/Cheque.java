  package com.scp.mapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

  @Entity
 // @DiscriminatorValue(value="cheque")
  public class Cheque extends Payment {
	  @Column(name="cheque")
	  String chequeType;

	public Cheque(int paymentId, double amount, String chequeType) {
		super(paymentId, amount);
		this.chequeType = chequeType;
	}

	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cheque(int paymentId, double amount) {
		super(paymentId, amount);
		// TODO Auto-generated constructor stub
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

	@Override
	public String toString() {
		return "Cheque [chequeType=" + chequeType + "]";
	}
	
	

}
