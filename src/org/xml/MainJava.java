package org.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MainJava extends Employee {
	
	public static void main(String[] args) throws Throwable {
		
		JAXBContext jax = JAXBContext.newInstance(Employee.class);
		
		Unmarshaller unmar = jax.createUnmarshaller();
		
		// to mention the path name //
		
		File fle = new File ("D:\\java and eclipse 32 bit\\eclipse\\MavenPrjt\\XMLFile\\Read.xml");
		
		Object obj = unmar.unmarshal(fle);
		
		// to create the obj for employe //
		
		// type casting method //
		Employee emp= (Employee)obj;
		
		System.out.println("the id is " + emp.getId());
		
		System.out.println("the name is " +emp.getName());
		
		System.out.println("the email is " +emp.getEmail());
		
		System.out.println("the phone is " +emp.getPhone());
		
	}
}
