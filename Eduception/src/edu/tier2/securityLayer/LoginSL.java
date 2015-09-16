package edu.tier2.securityLayer;

import java.util.HashMap;

import edu.tier2.businessLayer.LoginBL;

public class LoginSL {
	public HashMap login(HashMap credentials){
		LoginBL loginBL = new LoginBL();
		return loginBL.login(credentials);
	}
}
