package com.ustri.chapter1;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestEmployee {

	public static void main(String[] args) {
 AnnotationConfiguration cfg=new AnnotationConfiguration();
 cfg.addAnnotatedClass(Employee.class);
 cfg.configure("Hibernate.cfg.xml");
 new SchemaExport(cfg).create(true, true);
	}

}
