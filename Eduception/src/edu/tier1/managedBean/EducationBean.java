package edu.tier1.managedBean;

import java.util.List;

public class EducationBean {
	private String major;
	private String startDate;
	private String endDate;
	private String school;
	private String cgpa;
	private String university;
	private String defendValue;
	private List defendvaluesList;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	
	public String getUniversity() {
		return university;
	}
	
	public void setUniversity(String university) {
		this.university = university;
	}
	
	public String getDefendValue() {
		return defendValue;
	}
	
	public void setDefendValue(String defendValue) {
		this.defendValue = defendValue;
	}
	
	public List getDefendvaluesList() {
		return defendvaluesList;
	}
	
	public void setDefendvaluesList(List defendvaluesList) {
		this.defendvaluesList = defendvaluesList;
	}
}
