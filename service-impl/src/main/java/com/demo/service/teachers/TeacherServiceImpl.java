package com.demo.service.teachers;

import com.demo.base.BaseRepository;
import com.demo.converter.ObjectMapperUtils;
import com.demo.domain.teachers.Teacher;
import com.demo.domain.teachers.TeacherDto;
import com.demo.repository.teachers.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeachService {

    @Autowired
    TeacherRepository repository;

    @Override
    public BaseRepository<Teacher, Long> getDao() {
        return repository;
    }

    @Override
    public Teacher createDto(TeacherDto dto) {
        return ObjectMapperUtils.map(dto, Teacher.class);
    }

    @Override
    public void convertDtoToEntity(TeacherDto dto, Teacher domain) {
        ObjectMapperUtils.map(dto, domain);
    }

    @Override
    public Teacher findByName(String name) {
        return repository.findByName(name);
    }



}
