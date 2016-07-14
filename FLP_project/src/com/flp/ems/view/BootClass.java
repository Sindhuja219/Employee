package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	

	public static void main(String[] args) {
		System.out.print("AddEmployee");
		System.out.print("ModifyEmployee");
		System.out.print("RemoveEmployee");
		System.out.print("SearchEmployee");
		System.out.print("getAllEmployee");
		
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		
		menuSelection(s);
		}
	
	static void menuSelection(int r)
		{
		UserInteraction ui=new UserInteraction();
		
		switch (r)
		{
		
		case 1:
			ui.AddEmployee();
			break;
			
		case 2:
			ui.ModifyEmployee();
			break;
			
		case 3:
			ui.RemoveEmployee();
			break;
			
		case 4:
			ui.SearchEmployee();
			break;
			
		case 5:
			ui.getAllEmployee();
			break;
		}
			
		 }

	}


