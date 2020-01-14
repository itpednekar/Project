package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Transaction_Tb")
public class Transaction 
{
	private Integer tranId;
	private TransactionType tranType;
	private double advanceAmt;
	private Date advanceDate;
	private double remaningAmt;
	private Date finalTransDate;
	private double totalCost;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(TransactionType tranType, double advanceAmt, Date advanceDate, double remaningAmt,
			Date finalTransDate, double totalCost) {
		super();
		this.tranType = tranType;
		this.advanceAmt = advanceAmt;
		this.advanceDate = advanceDate;
		this.remaningAmt = remaningAmt;
		this.finalTransDate = finalTransDate;
		this.totalCost = totalCost;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	@Enumerated(EnumType.STRING)
	public TransactionType getTranType() {
		return tranType;
	}

	public void setTranType(TransactionType tranType) {
		this.tranType = tranType;
	}

	public double getAdvanceAmt() {
		return advanceAmt;
	}

	public void setAdvanceAmt(double advanceAmt) {
		this.advanceAmt = advanceAmt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getAdvanceDate() {
		return advanceDate;
	}

	public void setAdvanceDate(Date advanceDate) {
		this.advanceDate = advanceDate;
	}

	public double getRemaningAmt() {
		return remaningAmt;
	}

	public void setRemaningAmt(double remaningAmt) {
		this.remaningAmt = remaningAmt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getFinalTransDate() {
		return finalTransDate;
	}

	public void setFinalTransDate(Date finalTransDate) {
		this.finalTransDate = finalTransDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Transaction [tranId=" + tranId + ", tranType=" + tranType + ", advanceAmt=" + advanceAmt
				+ ", advanceDate=" + advanceDate + ", remaningAmt=" + remaningAmt + ", finalTransDate=" + finalTransDate
				+ ", totalCost=" + totalCost + "]";
	}
	
	
	
	
}
