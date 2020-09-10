package com.demo.api;

import com.demo.base.BaseController;
import com.demo.base.BaseService;
import com.demo.domain.students.Student;
import com.demo.domain.students.StudentDto;
import com.demo.service.students.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController extends BaseController<Student, StudentDto, Long> {

    @Autowired
    private StudentService studentService;

    @Override
    public BaseService<Student, StudentDto, Long> getService() {
        return studentService;
    }


}
