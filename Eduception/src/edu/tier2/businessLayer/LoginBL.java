package edu.tier2.businessLayer;

import java.util.HashMap;
import edu.tier1.managedBean.UserBean;
import edu.tier3.dataAccessLayer.LoginDAL;

public class LoginBL {
	public HashMap login(HashMap credentialsMap){
		LoginDAL loginDAL = new LoginDAL();
		UserBean ub = (UserBean)credentialsMap.get("userBean");
		HashMap userMap = new HashMap();
		userMap.put("userName", ub.getName());
		HashMap returnMap = loginDAL.login(userMap);
		String pass = returnMap.get("password").toString();
		UserBean user = (UserBean)credentialsMap.get("userBean");
		if(user.getPassword().equals(pass)){
			user.setRole(returnMap.get("role").toString());
			user.setLoginStatus("success");
			user.setUid(returnMap.get("uid").toString());
		}
		else{
			user.setLoginStatus("failure");
			user.setPassword("");
		}
		HashMap retMap= new HashMap();
		retMap.put("retUserBean", user);
		return retMap;
	}
}
