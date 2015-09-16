package edu.tier1.managedBean;

import java.util.List;

public class AchievementsBean {
	private String awardName;
	private String issuer;
	private String issueDate;
	private String awardDetails;
	private String awardDefend;
	private List awardDefendList;
	
	public String getAwardName() {
		return awardName;
	}
	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getAwardDetails() {
		return awardDetails;
	}
	public void setAwardDetails(String awardDetails) {
		this.awardDetails = awardDetails;
	}
	public String getAwardDefend() {
		return awardDefend;
	}
	public void setAwardDefend(String awardDefend) {
		this.awardDefend = awardDefend;
	}
	public List getAwardDefendList() {
		return awardDefendList;
	}
	public void setAwardDefendList(List awardDefendList) {
		this.awardDefendList = awardDefendList;
	}
	
}
