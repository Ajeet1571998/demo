package com.example.rajeducationacademy.newTech.retrofit.model.feesStatus;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("paid_fees")
	private int paidFees;

	@SerializedName("total_fees")
	private String totalFees;

	@SerializedName("remaning")
	private String remaning;

	public int getPaidFees(){
		return paidFees;
	}

	public String getTotalFees(){
		return totalFees;
	}

	public String getRemaning(){
		return remaning;
	}
}