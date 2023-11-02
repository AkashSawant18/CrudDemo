package com.luv2code.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);

			// createMultipleStudents(studentDAO);

			//readStudent(studentDAO);
			
			//queryForStudents(studentDAO);
			
			//queryForStudentByLastName(studentDAO);
			
			//updateStudent(studentDAO);
			
			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 4;
		System.out.println("Deleting the student with id:"+studentId);
		studentDAO.delete(studentId);
	}

//	private void updateStudent(StudentDAO studentDAO) {
//		//retrieve the student based on the id
//		int studentId = 1;
//		System.out.println("Getting student with Id :"+studentId);
//		Student myStudent = studentDAO.findById(studentId);
//		
//		//change first name 
//		myStudent.setFirstName("Akash");
//		
//		//update the student
//		studentDAO.update(myStudent);
//		
//		//display the updated student
//		System.out.println("the updated student is :"+myStudent);
//	}

//	private void queryForStudentByLastName(StudentDAO studentDAO) {
//		//get a list of students
//		List<Student> theStudents = studentDAO.findByLastName("Sawant");
//		
//		//display list of students
//		for(Student temp : theStudents) {
//			System.out.println(temp);
//		}
//	}

//	private void queryForStudents(StudentDAO studentDAO) {
//		//get list of students
//		List<Student> theStudent = studentDAO.findAll();
//		
//		//display list of students
//		for(Student tempStudent : theStudent ) {
//			System.out.println(tempStudent);
//		}
//	}

//	private void readStudent(StudentDAO studentDAO) {
//		
//		System.out.println("create student");
//		Student student = new Student("Paul","Dean","pauldean@gmail.com");
//		
//		System.out.println("saving student");
//		studentDAO.save(student);
//		
//		
//		int theId = student.getId();
//		System.out.println("the id of student is : "+ theId);
//		
//		System.out.println("retrieving student with id : "+theId);
//		Student myStudent = studentDAO.findById(theId);
//		
//		System.out.println("Display student"+myStudent);
//		
//		
//	}

//	private void createMultipleStudents(StudentDAO studentDAO) {
//		Student tempStudent1 = new Student("Ajit", "Sawant", "sawant.ajit11@gmail.com");
//		Student tempStudent2 = new Student("Sanket", "Kacahre", "sanketsk77@gmail.com");
//
//		studentDAO.save(tempStudent1);
//		studentDAO.save(tempStudent2);
//
//	}
//
//	private void createStudent(StudentDAO studentDAO) {
//		// create student object
//		System.out.println("Creating a new student...");
//		Student tempStudent = new Student("Akash", "Sawant", "akashsawant9960@gmail.com");
//
//		// save the student object
//		System.out.println("Saving the student...");
//		studentDAO.save(tempStudent);
//
//		// display id of the saved student
//		System.out.println("saved student.generated id: " + tempStudent.getId());
//
//	}

}
