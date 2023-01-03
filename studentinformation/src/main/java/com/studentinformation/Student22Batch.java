package com.studentinformation;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student22Batch
{
	@Id
	private int roll_num;
	private String stud_name;
	private String stud_dob;
	private String stud_doj;
	private String branch;
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_dob() {
		return stud_dob;
	}
	public void setStud_dob(String stud_dob) {
		this.stud_dob = stud_dob;
	}
	public String getStud_doj() {
		return stud_doj;
	}
	public void setStud_doj(String stud_doj) {
		this.stud_doj = stud_doj;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student22Batch(int roll_num, String stud_name, String stud_dob, String stud_doj, String branch) {
		super();
		this.roll_num = roll_num;
		this.stud_name = stud_name;
		this.stud_dob = stud_dob;
		this.stud_doj = stud_doj;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student22Batch [roll_num=" + roll_num + ", stud_name=" + stud_name + ", stud_dob=" + stud_dob
				+ ", stud_doj=" + stud_doj + ", branch=" + branch + "]";
	}
	public Student22Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}