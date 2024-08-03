package com.arkacode.jpahibernate.jpahibernateCRUD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arkacode.jpahibernate.jpahibernateCRUD.DAO.StudentDAO;
import com.arkacode.jpahibernate.jpahibernateCRUD.Entity.Student;

@SpringBootApplication
public class JpahibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpahibernateCrudApplication.class, args);

		

		}

		@Bean
		public CommandLineRunner commandLineRunner(StudentDAO theStudentDAO){
			return runner -> {
				CreateStudent(theStudentDAO);
					};
				}

		private void CreateStudent(StudentDAO theStudentDAO) {

			System.out.println("Creating the student object .....");

			Student temp1 = new Student("Arka","Maity",23);

			System.out.println("student object created .....");

			theStudentDAO.save(temp1);

			System.out.println("Save the student with ID - "+ temp1.getId());
			
		}
	}


