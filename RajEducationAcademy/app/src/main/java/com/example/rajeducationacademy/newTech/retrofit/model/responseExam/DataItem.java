package com.example.rajeducationacademy.newTech.retrofit.model.responseExam;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("subjectname")
	private String subjectname;

	@SerializedName("pdf")
	private String pdf;

	@SerializedName("class_name")
	private String className;

	public String getSubjectname(){
		return subjectname;
	}

	public String getPdf(){
		return pdf;
	}

	public String getClassName(){
		return className;
	}
}