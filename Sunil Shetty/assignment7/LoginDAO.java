package com.learnjobs;

public interface LoginDAO {

	public int insertLogin(Login c);
	public Login getLogin(String username, String pass);

}

