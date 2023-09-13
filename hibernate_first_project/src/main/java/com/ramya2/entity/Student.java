package com.ramya2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", branch=" + branch + "]";
	}
	@Id
	@Column(name="stdid" )
	private int sId;
	@Column(name="stdname")
	private String sName;
	@Column 
	private String branch;
	

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public Student() {
		super();
		
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}