package com.example.rajeducationacademy.newTech.retrofit.model.ResponseFeesHistory;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("date")
	private String date;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("class_id")
	private String classId;

	@SerializedName("total_fee")
	private String totalFee;

	@SerializedName("last_pay")
	private String lastPay;

	@SerializedName("student_id")
	private String studentId;

	@SerializedName("pay")
	private String pay;

	@SerializedName("id")
	private String id;

	@SerializedName("remaning")
	private String remaning;

	public String getDate(){
		return date;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getClassId(){
		return classId;
	}

	public String getTotalFee(){
		return totalFee;
	}

	public String getLastPay(){
		return lastPay;
	}

	public String getStudentId(){
		return studentId;
	}

	public String getPay(){
		return pay;
	}

	public String getId(){
		return id;
	}

	public String getRemaning(){
		return remaning;
	}
}