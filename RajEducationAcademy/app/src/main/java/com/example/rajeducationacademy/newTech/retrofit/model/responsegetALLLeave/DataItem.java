package com.example.rajeducationacademy.newTech.retrofit.model.responsegetALLLeave;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("reason")
	private String reason;

	@SerializedName("date_added")
	private String dateAdded;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("name")
	private String name;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("student_id")
	private String studentId;

	@SerializedName("leave_date")
	private String leaveDate;

	@SerializedName("id")
	private String id;

	@SerializedName("status")
	private String status;

	public String getReason(){
		return reason;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getName(){
		return name;
	}

	public String getMobile(){
		return mobile;
	}

	public String getStudentId(){
		return studentId;
	}

	public String getLeaveDate(){
		return leaveDate;
	}

	public String getId(){
		return id;
	}

	public String getStatus(){
		return status;
	}
}