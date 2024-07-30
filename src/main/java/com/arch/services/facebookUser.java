package com.arch.services;

public class facebookUser implements facebookUserInterface{
	
	String[] friends= {"Akhil","Kumar", "Raju", "Karthik"};

	@Override
	public void getUserName() {
		// TODO Auto-generated method stub
		for(String s : friends) {
			System.out.println(s);
		}
	}

	@Override
	public void getSearch(String s) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void setUserName(String s) {
		// TODO Auto-generated method stub
		
	}

}
