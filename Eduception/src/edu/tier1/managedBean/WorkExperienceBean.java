package edu.tier1.managedBean;

import java.util.List;

public class WorkExperienceBean {
	private String positionTitle;
	private String startDate;
	private String endDate;
	private String company;
	private String manager;
	private String managerTitle;
	private String defendValue;
	private String projectDetails;
	private List defendValuesList;
	
	public String getPositionTitle() {
		return positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getManagerTitle() {
		return managerTitle;
	}
	public void setManagerTitle(String managerTitle) {
		this.managerTitle = managerTitle;
	}
	public String getDefendValue() {
		return defendValue;
	}
	public void setDefendValue(String defendValue) {
		this.defendValue = defendValue;
	}
	public String getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	public List getDefendValuesList() {
		return defendValuesList;
	}
	public void setDefendValuesList(List defendValuesList) {
		this.defendValuesList = defendValuesList;
	}
}
