package com.sathya.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Payment_tabs")

@Inheritance(strategy=InheritanceType.JOINED)
 public abstract class Payments
{
	@Id

	private int txId;
	private double amount;
	@Temporal(TemporalType.DATE)

	private Date txDate;

	public Payments()
	{
		
	}
	public Payments(int txId,double amount,Date txDate)

	{
		this.txId=txId;
		this.amount=amount;
		this.txDate=txDate;
		
		
	}
	public int getTxId() {
		return txId;
	}
	public void setTxId(int txId) {
		this.txId = txId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTxDate() {
		return txDate;
	}
	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}


	 
	

}