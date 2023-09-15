package com.jsp.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class MovieEntity implements Serializable {
	@Id
	@Column(name = "alt_key")
	private long altKey;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "actor_name")
	private String actorName;
	@Column(name = "actress_name")
	private String actressName;
	@Column(name = "released_date")
	private String releasedDate;
	@Column(name = "rating")
	private String rating;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	public String getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieEntity [altKey=" + altKey + ", movieName=" + movieName + ", actorName=" + actorName
				+ ", actressName=" + actressName + ", releasedDate=" + releasedDate + ", rating=" + rating + "]";
	}
}
