package com.demo.repository.students;

import com.demo.base.BaseRepository;
import com.demo.domain.students.Student;

public interface StudentRepository extends BaseRepository<Student, Long> {

    Student findByName(String name);

}
