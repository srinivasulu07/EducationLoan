package com.loan.education.doa;

import com.loan.education.controller.UserValidation;

public class CollegeRanking {
	public int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	public void rankValidation() {
		UserValidation usr = new UserValidation();
		usr.validateRank(rank);
	}
}
