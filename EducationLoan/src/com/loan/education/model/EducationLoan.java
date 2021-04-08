package com.loan.education.model;

import java.util.Scanner;

import com.loan.education.controller.UserValidation;
import com.loan.education.doa.Age;
import com.loan.education.doa.Amount;
import com.loan.education.doa.CollegeRanking;
import com.loan.education.doa.CreditScore;
import com.loan.education.doa.Repaymentperiod;
public class EducationLoan {

	Scanner sc = new Scanner(System.in);
	
	public static int userid;
	public int password;
	public static int result;
	public static int age;
	public static int amount;
	public static int rank;
	public static int credit;
	public static int period;
	
	public void employeValid() {
		
		System.out.println("Enter userid");
		userid = sc.nextInt();
		
		System.out.println("Enter password");
		password = sc.nextInt();
		
		UserValidation usr = new UserValidation();
		result = usr.validateEmployee(userid,password);
	}
	
	public void mainMethod() {
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
	UserValidation usr = new UserValidation();
	usr.validateAge(age);
		Age a = new Age();
		a.ageValidation();
		System.out.println("Enter your loan amount as int value in lakhs: ");
		amount =sc.nextInt();
		Amount am=new Amount();
		am.amountValidation();
//		System.out.println("Enter your citizenship: ");
//		citizen = sc.nextLine();
//		Citizen cv=new Citizen();
//		cv.citizenValidation();
		System.out.println("Enter the rank of college you are joining: ");
		rank = sc.nextInt();
		CollegeRanking cr=new CollegeRanking();
		cr.rankValidation();
		
		System.out.println("Enter your creditscore: ");
		credit = sc.nextInt();
		
		CreditScore cs=new CreditScore();
		cs.creditValidation();
		
		System.out.println("Enter your repaymentperiod: ");
		period = sc.nextInt();
		Repaymentperiod rp =new Repaymentperiod();
		rp.periodValidation();
		UserValidation u = new UserValidation();
		u.score();
	}
	
}
