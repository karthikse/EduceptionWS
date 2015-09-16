package edu.tier1.managedBean;

import java.util.List;

public class StudentProfileDetailsBean {
	private UserBean userBean;
	private List<AchievementsBean> achievementsBeans;
	private List<EducationBean> educationBeans;
	private List<LeadershipBean> leadershipBeans;
	private List<SkillsBean> skillsBeans;
	private List<WorkExperienceBean> workExperienceBeans;
	private List<WorkAuthorizationBean> workAuthorizationBeans;
	private String htmlFlush;
		
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	public List<AchievementsBean> getAchievementsBeans() {
		return achievementsBeans;
	}
	public void setAchievementsBeans(List<AchievementsBean> achievementsBeans) {
		this.achievementsBeans = achievementsBeans;
	}
	public List<EducationBean> getEducationBeans() {
		return educationBeans;
	}
	public void setEducationBeans(List<EducationBean> educationBeans) {
		this.educationBeans = educationBeans;
	}
	public List<LeadershipBean> getLeadershipBeans() {
		return leadershipBeans;
	}
	public void setLeadershipBeans(List<LeadershipBean> leadershipBeans) {
		this.leadershipBeans = leadershipBeans;
	}
	public List<SkillsBean> getSkillsBeans() {
		return skillsBeans;
	}
	public void setSkillsBeans(List<SkillsBean> skillsBeans) {
		this.skillsBeans = skillsBeans;
	}
	public List<WorkExperienceBean> getWorkExperienceBeans() {
		return workExperienceBeans;
	}
	public void setWorkExperienceBeans(List<WorkExperienceBean> workExperienceBeans) {
		this.workExperienceBeans = workExperienceBeans;
	}
	public List<WorkAuthorizationBean> getWorkAuthorizationBeans() {
		return workAuthorizationBeans;
	}
	public void setWorkAuthorizationBeans(
			List<WorkAuthorizationBean> workAuthorizationBeans) {
		this.workAuthorizationBeans = workAuthorizationBeans;
	}	
	public String getHtmlFlush() {
		return htmlFlush;
	}
	public void setHtmlFlush(String htmlFlush) {
		this.htmlFlush = htmlFlush;
	} 
	public void buildHtmlcode(){
		String codeUI = "";
		String educationUI = "";
		String workExUI = "";
		String awardsUI = "";
		String leadershipUI = "";
		String skillsUI = "";
		String workAuthUI = "";
		
		EducationBean eb = null;
		WorkExperienceBean wb = null;
		AchievementsBean ab = null;
		LeadershipBean lb = null;
		SkillsBean sb = null;
		WorkAuthorizationBean wab = null;
		
		codeUI="<div id=\"education\">\n"
				+ "<h:outputText><h3>Education</h3></h:outputText><br/>";
		if(educationBeans!=null && educationBeans.size()>0){
			for(int i=0;i<educationBeans.size();i++){
				
				eb = educationBeans.get(i);
		
				educationUI= educationUI 
							+ "<h:outputText id=\"branch"+i+"\">"+eb.getMajor()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"startDate"+i+"\">"+eb.getStartDate()+"</h:outputText>&nbsp;<h:outputText id=\"endDate"+i+"\">"+eb.getEndDate()+"</h:outputText><br/>"
							+ "<h:outputText id=\"college"+i+"\">"+eb.getSchool()+"</h:outputText>&nbsp;<h:outputText id=\"cgpa"+i+"\">"+eb.getCgpa()+"</h:outputText><br/>"
							+ "<h:outputText id=\"university"+i+"\">"+eb.getUniversity()+"</h:outputText>&nbsp;";
				
				if (eb.getDefendValue() == null || "".equalsIgnoreCase(eb.getDefendValue())){
					educationUI = educationUI
									+ "";    // code to be implemented to populate dropdown options
				}
				else{
					educationUI = educationUI
							+ "<h:outputText id=\"eduDefend"+i+"\">"+eb.getDefendValue()+"</h:outputText><br/>";
				}
				eb = null;
			}
		}
		
		
		codeUI = codeUI + educationUI + "</div>"
									+ "<div id=\"workExperience\">\n"
											+ "<h:outputText><h3>Work Experience</h3></h:outputText><br/>";
		if(workExperienceBeans!=null && workExperienceBeans.size()>0){
			for(int i=0;i<workExperienceBeans.size();i++){
				
				wb = workExperienceBeans.get(i);
				
				workExUI = workExUI
							+ "<h:outputText id=\"position"+i+"\">"+wb.getPositionTitle()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"workStartDate"+i+"\">"+wb.getStartDate()+"</h:outputText>&nbsp;<h:outputText id=\"workEndDate"+i+"\">"+wb.getEndDate()+"</h:outputText><br/>"
							+ "<h:outputText id=\"company"+i+"\">"+wb.getCompany()+"</h:outputText><br/>"
							+ "<h:outputText id=\"manager"+i+"\">"+wb.getManager()+"</h:outputText><br/>&nbsp<h:outputText id=\"managerTitle"+i+"\">"+wb.getManagerTitle()+"</h:outputText><br/>"
							+ "<h:outputText id=\"university"+i+"\">"+eb.getUniversity()+"</h:outputText>&nbsp;";
				
				if (wb.getDefendValue() == null || "".equalsIgnoreCase(wb.getDefendValue())){
					workExUI = workExUI
									+ "";    // code to be implemented to populate dropdown options
				}
				else{
					workExUI = workExUI
							+ "<h:outputText id=\"workDefend"+i+"\">"+wb.getDefendValue()+"</h:outputText><br/>";
				}
				workExUI = workExUI
						+ "<h:textarea id=\"projDetails"+i+"\">"+wb.getProjectDetails()+"</h:textarea><br/>";		
				
				wb = null;
			}
				}
				
				
				codeUI = codeUI + workExUI + "</div>"
						+ "<div id=\"Awards\">\n"
								+ "<h:outputText><h3>Awards</h3></h:outputText><br/>";
		if(achievementsBeans!=null && achievementsBeans.size()>0){
			for(int i=0;i<achievementsBeans.size();i++){
				
				ab = achievementsBeans.get(i);
				
				awardsUI = awardsUI
							+ "<h:outputText id=\"awardName"+i+"\">"+ab.getAwardName()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"issueDate"+i+"\">"+ab.getIssueDate()+"</h:outputText><br/>"
							+ "<h:outputText id=\"issuer"+i+"\">"+ab.getIssuer()+"</h:outputText>&nbsp";
				
				if (ab.getAwardDefend() == null || "".equalsIgnoreCase(ab.getAwardDefend())){
					awardsUI = awardsUI
									+ "";    // code to be implemented to populate dropdown options
				}
				else{
					awardsUI = awardsUI
							+ "<h:outputText id=\"awardsDefend"+i+"\">"+ab.getAwardDefend()+"</h:outputText><br/>";
				}
				awardsUI = awardsUI
						+ "<h:textarea id=\"awardDetails"+i+"\">"+ab.getAwardDetails()+"</h:textarea><br/>";		
				ab = null;
			}
				}
				
			
				codeUI = codeUI + awardsUI + "</div>"
						+ "<div id=\"Leadership\">\n"
								+ "<h:outputText><h3>Leadership</h3></h:outputText><br/>";
		if(leadershipBeans!=null && leadershipBeans.size()>0){
			for(int i=0;i<leadershipBeans.size();i++){
				
				lb = leadershipBeans.get(i);
				
				leadershipUI = leadershipUI
							+ "<h:outputText id=\"positionTitle"+i+"\">"+lb.getPositionTitle()+"</h:outputText>&nbsp;"
							+ "<h:outputText id=\"positionStartDate"+i+"\">"+lb.getStartDate()+"</h:outputText>&nbsp;<h:outputText id=\"positionEndDate"+i+"\">"+lb.getEndDate()+"</h:outputText><br/>"
							+ "<h:outputText id=\"organization"+i+"\">"+lb.getOrganization()+"</h:outputText>&nbsp";
				
				if (lb.getPositionDefend() == null || "".equalsIgnoreCase(lb.getPositionDefend())){
					leadershipUI = leadershipUI
									+ "";    // code to be implemented to populate dropdown options
				}
				else{
					leadershipUI = leadershipUI
							+ "<h:outputText id=\"leadershipDefend"+i+"\">"+lb.getPositionDefend()+"</h:outputText><br/>";
				}
				leadershipUI = leadershipUI
						+ "<h:textarea id=\"leadershipDetails"+i+"\">"+lb.getPositionDetails()+"</h:textarea><br/>";		
				lb = null;
			}
				}
				
				
				codeUI = codeUI + leadershipUI + "</div>"
						+ "<div id=\"skills\">\n"
								+ "<h:outputText><h3>Skills</h3></h:outputText><br/>";
		if(skillsBeans!=null && skillsBeans.size()>0){
			for(int i=0;i<skillsBeans.size();i++){
				
				sb = skillsBeans.get(i);
				
				skillsUI = skillsUI
							+ "<h:outputText id=\"skill"+i+"\">"+sb.getSkill()+"</h:outputText><br/>";
				sb = null;
			}
				}
				
				
				codeUI = codeUI + skillsUI + "</div>"
						+ "<div id=\"workAuth\">\n"
								+ "<h:outputText><h3>Work Authorization</h3></h:outputText><br/>";
		if(workAuthorizationBeans!=null && workAuthorizationBeans.size()>0){
			for(int i=0;i<workAuthorizationBeans.size();i++){
				
				wab = workAuthorizationBeans.get(i);
				
				workAuthUI = workAuthUI
							+ "<h:outputText id=\"workAuth"+i+"\">"+wab.getWorkauth()+"</h:outputText>&nbsp<h:outputText id=\"country"+i+"\">"+wab.getCountry()+"</h:outputText><br/>";
				wab = null;
			}
				}
		
		codeUI = codeUI + workAuthUI + "</div>";
		
		setHtmlFlush(codeUI);
	}
	
}
