
package com.jsp.DTO;

public class MovieDto {
	private long altKey;
	private String budget;
	private String rating;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieDto [altKey=" + altKey + ", budget=" + budget + ", rating=" + rating + "]";
	}
}
