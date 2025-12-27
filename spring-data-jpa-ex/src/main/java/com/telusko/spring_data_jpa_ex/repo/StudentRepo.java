package com.telusko.spring_data_jpa_ex.repo;

import java.util.List;
import com.telusko.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("select s from Student s where name=?1")
    List<Student> findByName(String name);

    List<Student> findByMarksGreaterThan(int marks);

}
