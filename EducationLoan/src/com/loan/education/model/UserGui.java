package com.loan.education.model;

public class UserGui extends EducationLoan{

	public static void main(String[] args) {
		EducationLoan el = new EducationLoan();
		el.employeValid();
		
		if(EducationLoan.result == 1) {
			EducationLoan ed = new EducationLoan();
			ed.mainMethod();
		}
	}
	
}
