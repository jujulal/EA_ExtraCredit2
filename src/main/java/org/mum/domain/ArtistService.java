package org.mum.domain;

import org.hibernate.SessionFactory;

public class ArtistService {
	private ArtistDao artistDao; 
	private SessionFactory sf; 
	
	public ArtistService(ArtistDao aDao, SessionFactory sf){
		this.artistDao=aDao;
		this.sf=sf;
	}

}
