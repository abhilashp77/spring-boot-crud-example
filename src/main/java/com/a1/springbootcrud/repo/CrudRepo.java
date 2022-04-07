package com.a1.springbootcrud.repo;

import com.a1.springbootcrud.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepo extends CrudRepository<Student, Integer> {


}
