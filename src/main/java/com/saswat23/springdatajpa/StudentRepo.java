package com.saswat23.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saswat23.springdatajpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
