package edu.tier1.managedBean;

public class HRBean {
	private String hrName;
	private String companyName;
	private String roleTitle;
	private String emailId;
	private String phoneNo;
	private String decription;
	private String HRhtmlFlush;
	
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRoleTitle() {
		return roleTitle;
	}
	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getHRhtmlFlush() {
		return HRhtmlFlush;
	}
	public void setHRhtmlFlush(String hRhtmlFlush) {
		HRhtmlFlush = hRhtmlFlush;
	}
	
	public void buildHtmlcode(){
		String codeUI = "";
				
		codeUI="<div id=\"hrdetails\">\n"
				+ "<h:outputText><h3>HR Profile Details</h3></h:outputText><br/>";
		
		
		codeUI= codeUI 
							+ "<h:outputText id=\"hrName\">"+this.getHrName()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"company\">"+this.getCompanyName()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"roleTitle\">"+this.getRoleTitle()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"emailId\">"+this.getEmailId()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"phoneNumber\">"+this.getPhoneNo()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"description\">"+this.getDecription()+"</h:outputText>&nbsp;";
				
				
		
		codeUI = codeUI + "</div>";
		
		setHRhtmlFlush(codeUI);
	}
}