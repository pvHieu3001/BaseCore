package com.demo.service.students;

import com.demo.base.BaseService;
import com.demo.domain.students.Student;
import com.demo.domain.students.StudentDto;

public interface StudentService extends BaseService<Student, StudentDto, Long> {

    Student findByName(String name);

}
