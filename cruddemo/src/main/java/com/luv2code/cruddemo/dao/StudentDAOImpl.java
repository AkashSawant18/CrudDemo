package com.luv2code.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

	// define field for entity manager

	private EntityManager entityManager;

	// define constructor for injection

	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void save(Student theStudnt) {
		entityManager.persist(theStudnt);
	}

	public Student findById(Integer id) {
		return entityManager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {

		// create query
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);

		// return query results
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findByLastName(String theLastName) {
		// create query
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

		// return query parameter
		theQuery.setParameter("theData", theLastName);

		// return query result
		return theQuery.getResultList();
	}

	@Override
	@Transactional
	public void update(Student thestudent) {
		entityManager.merge(thestudent);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		//retrieve the student
		Student theStudent = entityManager.find(Student.class, id);
		
		//delete the student
		entityManager.remove(theStudent);
	}

}
