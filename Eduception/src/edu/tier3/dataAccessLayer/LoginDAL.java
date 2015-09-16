package edu.tier3.dataAccessLayer;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.tier3.dataEntities.User;

public class LoginDAL {
	public HashMap login(HashMap userMap){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
	    EntityManager entitymanager = emfactory.createEntityManager();
	    TypedQuery<User> query =
	    entitymanager.createNamedQuery("User.findByUsername", User.class);
	    List<User> results = query.setParameter("username", userMap.get("userName").toString())
	    							.getResultList();
	    User user = (User)results.get(0);
	    HashMap retMap  = new HashMap();
	    retMap.put("password", user.getPassword());
	    retMap.put("uid", user.getUid());
	    retMap.put("role", user.getRoleId()); // change this to role from roleId 
	    return retMap;
	}
}
