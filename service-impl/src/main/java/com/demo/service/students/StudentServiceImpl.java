package com.demo.service.students;

import com.demo.base.BaseRepository;
import com.demo.converter.ObjectMapperUtils;
import com.demo.domain.students.Student;
import com.demo.domain.students.StudentDto;
import com.demo.repository.students.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public BaseRepository<Student, Long> getDao() {
        return studentRepository;
    }

    @Override
    public Student createDto(StudentDto dto) {
        return ObjectMapperUtils.map(dto, Student.class);
    }

    @Override
    public void convertDtoToEntity(StudentDto dto, Student student) {
        ObjectMapperUtils.map(dto, student);
    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

}
