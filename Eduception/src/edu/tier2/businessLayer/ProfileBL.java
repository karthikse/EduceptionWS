package edu.tier2.businessLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.tier1.managedBean.AchievementsBean;
import edu.tier1.managedBean.EducationBean;
import edu.tier1.managedBean.HRBean;
import edu.tier1.managedBean.LeadershipBean;
import edu.tier1.managedBean.SkillsBean;
import edu.tier1.managedBean.StudentProfileDetailsBean;
import edu.tier1.managedBean.UserBean;
import edu.tier1.managedBean.WorkAuthorizationBean;
import edu.tier1.managedBean.WorkExperienceBean;
import edu.tier3.dataAccessLayer.ProfileDAL;
import edu.tier3.dataEntities.Hr;
import edu.tier3.dataEntities.Student;
import edu.tier3.dataEntities.StudentAchievement;
import edu.tier3.dataEntities.StudentEducationDetail;
import edu.tier3.dataEntities.StudentEmployementHistory;
import edu.tier3.dataEntities.StudentLeadership;
import edu.tier3.dataEntities.StudentSkill;
import edu.tier3.dataEntities.StudentWorkAuthorization;

public class ProfileBL {
	public HashMap loadStudentProfileDetails(HashMap credentialsMap){
		ProfileDAL profileDAL = new ProfileDAL();
		UserBean ub = (UserBean)credentialsMap.get("userBean");
		
		HashMap userMap = new HashMap();
		userMap.put("userId", ub.getUid());
		HashMap returnMap = profileDAL.loadStudentProfileDetails(userMap);
		
		Student studentProfile = (Student) returnMap.get("studentProfile");
		StudentProfileDetailsBean studentProfileDetailsBean = (StudentProfileDetailsBean) credentialsMap.get("studentProfileDetailsBean");
		
		//Start student details load
		
		studentProfileDetailsBean.getUserBean().setName(studentProfile.getFirstName() + " " + studentProfile.getMiddleName() + " " + studentProfile.getLastName());
		//studentProfileBean.getUserBean().setRole(studentProfile.getUser().getRoleId());
		studentProfileDetailsBean.getUserBean().setEmail(studentProfile.getUser().getUserDetail().getEmail1());
		
		EducationBean eb = null;
		List<EducationBean> educationBeanList = new ArrayList<EducationBean>();
		StudentEducationDetail eE = null;
		for(int i=0; i<studentProfile.getStudentEducationDetails().size();i++){
			eb = new EducationBean();
			eE = studentProfile.getStudentEducationDetails().get(i);
			eb.setMajor(eE.getMajor().getMajorName());
			eb.setSchool(eE.getSchool().getSchoolName());
			eb.setStartDate(eE.getStartDate().toString());
			eb.setEndDate(eE.getEndDate().toString());
			eb.setCgpa(String.valueOf(eE.getCgpa()));
			eb.setUniversity(eE.getUniversity().getUnivName());
			eb.setDefendValue(eE.getDefendValue());
			
			educationBeanList.add(eb);
		}
		studentProfileDetailsBean.setEducationBeans(educationBeanList);
		
		WorkExperienceBean web = null;
		List<WorkExperienceBean> workExpBeanList = new ArrayList<WorkExperienceBean>();
		StudentEmployementHistory seh = null;
		for(int i=0; i<studentProfile.getStudentEmployementHistories().size();i++){
			web = new WorkExperienceBean();
			seh = studentProfile.getStudentEmployementHistories().get(i);
			web.setPositionTitle(seh.getJobTitle());
			web.setStartDate(seh.getStartDate().toString());
			web.setEndDate(seh.getEndDate().toString());
			web.setCompany(seh.getCompany().getCompanyName());
			web.setManager(seh.getManagerName());
			web.setManagerTitle(seh.getManagerTitle());
			web.setDefendValue(seh.getDefendFlag());
			web.setProjectDetails(seh.getWorkDescription().toString());
			
			workExpBeanList.add(web);
		}
		studentProfileDetailsBean.setWorkExperienceBeans(workExpBeanList);
		
		AchievementsBean ab = null;
		List<AchievementsBean> achievementsBeanList = new ArrayList<AchievementsBean>();
		StudentAchievement sa = null;
		for (int i=0; i<studentProfile.getStudentAchievements().size(); i++){
			ab = new AchievementsBean();
			sa = studentProfile.getStudentAchievements().get(i);
			ab.setAwardName(sa.getAchievementName());
			ab.setIssuer(sa.getOrganizationName());
			ab.setIssueDate(null);
			ab.setAwardDetails(sa.getAchievementDescription().toString());
			ab.setAwardDefend(sa.getDefendFlag());
			
			achievementsBeanList.add(ab);
		}
		studentProfileDetailsBean.setAchievementsBeans(achievementsBeanList);
		
		LeadershipBean lb = null;
		List<LeadershipBean> leadershipBeanList = new ArrayList<LeadershipBean>();
		StudentLeadership sl = null;
		for (int i=0; i<studentProfile.getStudentLeaderships().size(); i++){
			lb = new LeadershipBean();
			sl = studentProfile.getStudentLeaderships().get(i);
			lb.setPositionTitle(null);
			lb.setStartDate(null);
			lb.setEndDate(null);
			lb.setOrganization(sl.getOrganizationName());
			lb.setPositionDetails(sl.getLeadershipRoleDescription().toString());
			lb.setPositionDefend(sl.getDefendFlag());
			
			leadershipBeanList.add(lb);
		}
		studentProfileDetailsBean.setLeadershipBeans(leadershipBeanList);
		
		WorkAuthorizationBean wab = null;
		List<WorkAuthorizationBean> workAuthorizationBeanList = new ArrayList<WorkAuthorizationBean>();
		StudentWorkAuthorization swa = null;
		for (int i=0; i<studentProfile.getStudentWorkAuthorizations().size(); i++){
			wab = new WorkAuthorizationBean();
			swa = studentProfile.getStudentWorkAuthorizations().get(i);
			wab.setWorkauth(swa.getWorkAuthorizationType().getAuthorizationName());
			wab.setCountry(swa.getCountry());			
			
			workAuthorizationBeanList.add(wab);
		}
		studentProfileDetailsBean.setWorkAuthorizationBeans(workAuthorizationBeanList);
		
		SkillsBean skb = null;
		List<SkillsBean> skillsBeanList = new ArrayList<SkillsBean>();
		StudentSkill ssk = null;
		for (int i=0; i<studentProfile.getStudentSkills().size(); i++){
			skb = new SkillsBean();
			ssk = studentProfile.getStudentSkills().get(i);
			skb.setSkill(ssk.getSkillLevel());
			
			skillsBeanList.add(skb);
		}
		studentProfileDetailsBean.setSkillsBeans(skillsBeanList);
		
		//End student details load
		HashMap retMap= new HashMap();
		return retMap;
	}

	public HashMap loadHRDetails(HashMap credentialsMap) {
		ProfileDAL profileDAL = new ProfileDAL();
		UserBean ub = (UserBean)credentialsMap.get("userBean");
		
		HashMap userMap = new HashMap();
		userMap.put("userId", ub.getUid());
		HashMap returnMap = profileDAL.loadHRDetails(userMap);
		
		Hr hrDetails = (Hr) returnMap.get("hrDetails");
		HRBean hrDetailsBean = (HRBean) credentialsMap.get("hrBean");
		
		//Start HR details load
		hrDetailsBean.setHrName(hrDetails.getFirstName() + " " + hrDetails.getMiddleName() + " " + hrDetails.getLastName());
		//hrDetailsBean.setCompanyName(hrDetails.getCompanyId().to);
		hrDetailsBean.setRoleTitle(hrDetails.getHrRole());
		//hrDetailsBean.setEmailId(hrDetails.getEmail());
		//hrDetailsBean.setPhoneNo(hrDetails.getPhone());
		hrDetailsBean.setDecription(hrDetails.getHrDescription().toString());
		//End HR details load
		HashMap retMap= new HashMap();
		return retMap;
	}
}
