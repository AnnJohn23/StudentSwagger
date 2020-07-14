package com.example.demo;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Document 
@ApiModel
public class StudentEntity {
	
	
	
	 private int StudId;
	 private String StudName;
	 private String StudDept;

	
	


	public StudentEntity() {
		super();
	}
	
	@ApiModelProperty(position = 1, required = true, value = "1")

	public int getStudId() {
		return StudId;
	}


	public void setStudId(int studId) {
		StudId = studId;
	}

	@ApiModelProperty(position = 2, required = true, value = "2")
	public String getStudName() {
		return StudName;
	}


	public void setStudName(String studName) {
		StudName = studName;
	}


	public String getStudDept() {
		return StudDept;
	}


	public void setStudDept(String studDept) {
		StudDept = studDept;
	}

	
	
	
}