package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
   private StudentRepository studentRepository;
    @Override
    public Integer saveStudent(Student student) {
        return studentRepository.save(student).getSno();
    }

    @Override
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer sno) {
        return studentRepository.findById(sno).get();
    }

    @Override
    public void deleteStudent(Integer sno) {
  studentRepository.deleteById(sno);
    }
}
