package com.example.demo.model;



public class User {
	

    private int Id;
	private String Username;
	private String password;
	
	public User(int id, String username, String password) {
		Username = username;
		this.password = password;
	}

	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
