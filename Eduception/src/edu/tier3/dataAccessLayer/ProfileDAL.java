package edu.tier3.dataAccessLayer;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.tier3.dataEntities.Hr;
import edu.tier3.dataEntities.Student;
import edu.tier3.dataEntities.StudentAchievement;
import edu.tier3.dataEntities.StudentEducationDetail;
import edu.tier3.dataEntities.StudentEmployementHistory;
import edu.tier3.dataEntities.StudentLeadership;
import edu.tier3.dataEntities.StudentSkill;
import edu.tier3.dataEntities.StudentWorkAuthorization;
import edu.tier3.dataEntities.User;

public class ProfileDAL {
	public HashMap loadStudentProfileDetails(HashMap userMap){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
	    EntityManager entitymanager = emfactory.createEntityManager();
	    int userId = Integer.parseInt(userMap.get("userId").toString());
	    
	    TypedQuery<Student> querySt =
	    	    entitymanager.createNamedQuery("Student.findByUserId", Student.class);
	    	    List<Student> studentResults = querySt.setParameter("userId", userId)
	    	    							.getResultList();
	    	    
	    	    Student studentProfile = studentResults.get(0);
	    	    
	   /* TypedQuery<StudentEducationDetail> querySED =
			    entitymanager.createNamedQuery("StudentEducationDetail.findByStudentId", StudentEducationDetail.class);
			    List<StudentEducationDetail> studentEducationDetail = querySED.setParameter("studentId", userId)
			    							.getResultList();
			    studentProfile.addStudentEducationDetail(studentEducationDetail);
	    
	    TypedQuery<StudentEmployementHistory> querySEH =
			    entitymanager.createNamedQuery("StudentEmployementHistory.findByStudentId", StudentEmployementHistory.class);
			    List<StudentEmployementHistory> studentEmployementHistory = querySEH.setParameter("studentId", userId)
			    							.getResultList();
			    studentProfile.addStudentEmployementHistory(studentEmployementHistory);
	    	    
	    TypedQuery<StudentAchievement> queryAch =
	    	    entitymanager.createNamedQuery("StudentAchievement.findByStudentId", StudentAchievement.class);
	    	    List<StudentAchievement> studentAchievement = queryAch.setParameter("studentId", userId)
	    	    							.getResultList();
    	    	studentProfile.addStudentAchievement(studentAchievement);
	    
	    TypedQuery<StudentLeadership> queryLd =
	    	    entitymanager.createNamedQuery("StudentLeadership.findByStudentId", StudentLeadership.class);
	    	    List<StudentLeadership> studentLeadership = queryLd.setParameter("studentId", userId)
	    	    							.getResultList();
	    	    studentProfile.addStudentLeadership(studentLeadership);
	    
	    TypedQuery<StudentWorkAuthorization> queryWa =
	    	    entitymanager.createNamedQuery("StudentWorkAuthorization.findByStudentId", StudentWorkAuthorization.class);
	    	    List<StudentWorkAuthorization> studentWorkAuthorization = queryWa.setParameter("studentId", userId)
	    	    							.getResultList();
	    	    studentProfile.addStudentWorkAuthorization(studentWorkAuthorization);
	    	    
	    TypedQuery<StudentSkill> querySk =
	    	    entitymanager.createNamedQuery("StudentSkill.findByStudentId", StudentSkill.class);
	    	    List<StudentSkill> studentSkill = querySk.setParameter("studentId", userId)
	    	    							.getResultList();
	    	    studentProfile.addStudentSkill(studentSkill);*/
	    
	    HashMap retMap  = new HashMap();
	    retMap.put("studentProfile", studentProfile);
	    return retMap;
	}
	
	public static void main(String []args){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
	    EntityManager entitymanager = emfactory.createEntityManager();
	    
	    
	    TypedQuery<Student> querySt =
	    	    entitymanager.createNamedQuery("Student.findByUserId", Student.class);
	    	    List<Student> studentResults = querySt.setParameter("userId", 1)
	    	    							.getResultList();
	    	    
	    	    Student studentProfile = studentResults.get(0);
	    	    StudentEducationDetail sed = studentProfile.getStudentEducationDetails().get(0);
	    	    sed.getMajor();
	    	    System.out.println("cgpa: " + sed.getCgpa());
	}

	public HashMap loadHRDetails(HashMap userMap) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
	    EntityManager entitymanager = emfactory.createEntityManager();
	    int userId = Integer.parseInt(userMap.get("userId").toString());
	    
	    TypedQuery<Hr> querySt =
	    	    entitymanager.createNamedQuery("Hr.findByUserId", Hr.class);
	    	    List<Hr> hrResults = querySt.setParameter("userId", userId)
	    	    							.getResultList();
	    	    
	    	    Hr hrDetails = hrResults.get(0);
	    	    
	    	    HashMap retMap  = new HashMap();
	    	    retMap.put("hrDetails", hrDetails);
	    	    return retMap;
	}
}
