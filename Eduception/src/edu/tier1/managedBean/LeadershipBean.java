package edu.tier1.managedBean;

import java.util.List;

public class LeadershipBean {
	private String positionTitle;
	private String startDate;
	private String endDate;
	private String organization;
	private String positionDetails;
	private String positionDefend;
	private List defendList;
	
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
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getPositionDetails() {
		return positionDetails;
	}
	public void setPositionDetails(String positionDetails) {
		this.positionDetails = positionDetails;
	}
	public String getPositionDefend() {
		return positionDefend;
	}
	public void setPositionDefend(String positionDefend) {
		this.positionDefend = positionDefend;
	}
	public List getDefendList() {
		return defendList;
	}
	public void setDefendList(List defendList) {
		this.defendList = defendList;
	}
}
