package com.demo.repository.teachers;

import com.demo.base.BaseRepository;
import com.demo.domain.teachers.Teacher;

public interface TeacherRepository extends BaseRepository<Teacher, Long> {

    Teacher findByName(String name);

}
