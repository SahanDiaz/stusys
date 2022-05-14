package com.mgt.stusys.service;

import com.mgt.stusys.entity.Student;

import java.util.List;

public interface StudentService  {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById( Long id );
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
