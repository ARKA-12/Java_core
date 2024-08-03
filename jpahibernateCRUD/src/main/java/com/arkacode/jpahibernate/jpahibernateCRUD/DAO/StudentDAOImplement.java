package com.arkacode.jpahibernate.jpahibernateCRUD.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.arkacode.jpahibernate.jpahibernateCRUD.Entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImplement implements StudentDAO {

    private EntityManager entityManager; 

    @Autowired
    public StudentDAOImplement(EntityManager entityManager){
        this.entityManager= entityManager;
    }
  


    @Override
    @Transactional
    public void save(Student theStudent) {
      entityManager.persist(theStudent);

    }}
