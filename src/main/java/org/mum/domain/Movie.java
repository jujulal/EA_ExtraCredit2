package org.mum.domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



public class Movie{
	
	@Id
	@GeneratedValue
	private int movieId;
	private String name;

	@Enumerated(EnumType.STRING)
	private Genre genre;
	private int rating; 
	private int year; 
	
	@OneToMany
	private List<Person> actorsList = new ArrayList<Person>();



	
}
