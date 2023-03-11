package com.example.rajeducationacademy.newTech.retrofit.model.responseGetAttendance;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("date")
	private String date;

	@SerializedName("is_status")
	private String isStatus;

	@SerializedName("subject")
	private String subject;

	@SerializedName("class_id")
	private String classId;

	@SerializedName("student_id")
	private String studentId;

	@SerializedName("id")
	private String id;

	@SerializedName("attendance_date")
	private String attendanceDate;

	@SerializedName("attendance")
	private String attendance;

	public String getDate(){
		return date;
	}

	public String getIsStatus(){
		return isStatus;
	}

	public String getSubject(){
		return subject;
	}

	public String getClassId(){
		return classId;
	}

	public String getStudentId(){
		return studentId;
	}

	public String getId(){
		return id;
	}

	public String getAttendanceDate(){
		return attendanceDate;
	}

	public String getAttendance(){
		return attendance;
	}
}