package com.stackroute.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
