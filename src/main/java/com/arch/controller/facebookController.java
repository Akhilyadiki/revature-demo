package com.arch.controller;
import java.util.Scanner;

import com.arch.services.*;
public class facebookController implements  facebookControllerInterface{
	Scanner sc = new Scanner(System.in);
	
	
	
	facebookUserInterface fu = new facebookUser();
	
	@Override
	public void displayFriends() {
		// TODO Auto-generated method stub
		fu.getUserName();
			
		
		
	}

	@Override
	public void searchFriend(String s) {
		// TODO Auto-generated method stub
		fu.getSearch(s);
		
	}
		
	@Override
	public void logout() {
		
		System.out.println("logout Done");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProfile() {
		
		System.out.println("Enter Username");
		fu.setUserName(sc.nextLine());
		// TODO Auto-generated method stub
		
	}
	

	
	
}
