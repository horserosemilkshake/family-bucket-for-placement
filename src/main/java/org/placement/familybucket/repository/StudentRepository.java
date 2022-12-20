package org.placement.familybucket.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.placement.familybucket.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}