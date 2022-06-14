package com.tns.joinedtable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
		Employee emp=new Employee();
		emp.setName("Vinay");
		emp.setSalary(45000);
		em.persist(emp);
		
		//create an employee1
		Employee emp1=new Employee();
		emp1.setName("Ajay");
		emp1.setSalary(35000);
		em.persist(emp1);
		
		//create an Manager1
		Manager mg=new Manager();
		mg.setName("Aryan");
		mg.setSalary(65000);
		mg.setDeptName("Information Technology");
		em.persist(mg);
		
		em.getTransaction().commit();
		System.out.println("Added Employees and Manager Successfully");
		em.close();
		factory.close();
		
	}

}