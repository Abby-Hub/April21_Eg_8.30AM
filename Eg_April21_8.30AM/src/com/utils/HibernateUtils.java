package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory factory = null;
	
	public static SessionFactory getSessionFactory() {
		if(factory == null)
			factory =  new Configuration().configure().buildSessionFactory();
		return factory;
	}

}
