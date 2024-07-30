package com.arch.view;

import java.util.Scanner;
import com.arch.controller.*;
public class facebookView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		String s=sc.nextLine();
		facebookControllerInterface fc = new facebookController();
		
		switch(c) {
		case 0: fc.createProfile();
				break;
		case 1: fc.displayFriends(); 
			    break;
		case 2: 
				fc.searchFriend(s); 
				break;
		case 3:	fc.logout(); 
				break;
		default : System.out.print("Enter correct Choice");
		
		}
	}

}
