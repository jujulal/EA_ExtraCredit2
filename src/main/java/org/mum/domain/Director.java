package org.mum.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Director extends Person {
	
	private String biography;
	@OneToMany
	private List<Movie> directedMovies = new ArrayList<Movie>();
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public List<Movie> getDirectedMovies() {
		return directedMovies;
	}
	public void setDirectedMovies(List<Movie> directedMovies) {
		this.directedMovies = directedMovies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((biography == null) ? 0 : biography.hashCode());
		result = prime * result + ((directedMovies == null) ? 0 : directedMovies.hashCode());
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
		Director other = (Director) obj;
		if (biography == null) {
			if (other.biography != null)
				return false;
		} else if (!biography.equals(other.biography))
			return false;
		if (directedMovies == null) {
			if (other.directedMovies != null)
				return false;
		} else if (!directedMovies.equals(other.directedMovies))
			return false;
		return true;
	} 
	
	
}
