package com.loan.education.controller;

import com.loan.education.model.EducationLoan;

public class UserValidation extends EducationLoan{

	public static int score = 0;

	public int validateEmployee(int userid, int password) {
		if (userid == 123 && password == 456) {
			System.out.println("Login Successfull");
			return 1;
		}
		return 0;
	}

	public void validateAge(int age) {
		if (age >= 21 && age <= 35) {
			score++;
		}
	}

	

//	public void validateCitizen(String citizen) {
//		if (citizen == "indian") {
//			score++;
//		} else {
//		}
//		System.out.println(score);
//
//	}

	public void validateRank(int rank) {
		if (rank <= 200) {
			score++;
		}

	}

	public void validateCredit(int creditscore) {
		if (creditscore >= 700) {
			score++;
		}

	}

	public void validatePeriod(int period) {
		if (period <= 6) {
			score++;

		}
	}
	public void validateAmount(int amount) {
		if (amount <= 5) {
			score++;

		}
	}
	 
	public void score() {
		// TODO Auto-generated method stub
		if (score>=3) {
			System.out.println("You are eligible for eduaction loan and your documents need to be verified..");
		}
		else {
			System.out.println("You didn't meet the necessary criteria for education loan..");
		}
	}

}
