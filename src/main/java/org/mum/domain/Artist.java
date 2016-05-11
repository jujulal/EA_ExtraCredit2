package org.mum.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Artist extends Person {
	private String biography;
	private String role; 
	@OneToMany
	private List<Movie> workedMovieList;
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Movie> getWorkedMovieList() {
		return workedMovieList;
	}
	public void setWorkedMovieList(List<Movie> workedMovieList) {
		this.workedMovieList = workedMovieList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((biography == null) ? 0 : biography.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((workedMovieList == null) ? 0 : workedMovieList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		if (biography == null) {
			if (other.biography != null)
				return false;
		} else if (!biography.equals(other.biography))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (workedMovieList == null) {
			if (other.workedMovieList != null)
				return false;
		} else if (!workedMovieList.equals(other.workedMovieList))
			return false;
		return true;
	} 
	
	
}
