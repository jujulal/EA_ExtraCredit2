package org.mum.domain;

import org.hibernate.SessionFactory;

public class ArtistDao {
	private SessionFactory sf;
	public ArtistDao(SessionFactory sf){
		this.sf=sf;
	}
	public void add(Artist artist){
		sf.getCurrentSession().persist(artist);
	}
	public Artist get(int Id){
		//return sf.getCurrentSession().get(Artist.class, int Id);
		return null;
	}
	
}
